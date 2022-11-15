package com.mycompany.property.management.controller;

import com.mycompany.property.management.DTO.PropertyDTO;
import com.mycompany.property.management.DTO.UserDTO;
import com.mycompany.property.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserDTO> saveUser(@RequestBody UserDTO userDto){
        userDto= userService.register(userDto);
        ResponseEntity<UserDTO> responseEntity = new ResponseEntity<>(userDto, HttpStatus.CREATED);
        //System.out.println(propertyDTO);
        return responseEntity;
    }

    @PostMapping("/login")
    public ResponseEntity<UserDTO> login(@RequestBody UserDTO userDto){
        userDto= userService.login(userDto.getOwnerEmail(),userDto.getPassword());
        return new ResponseEntity<>(userDto, HttpStatus.OK);
        //System.out.println(propertyDTO);

    }
}
