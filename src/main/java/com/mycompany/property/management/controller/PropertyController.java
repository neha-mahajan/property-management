package com.mycompany.property.management.controller;

import com.mycompany.property.management.DTO.PropertyDTO;
import com.mycompany.property.management.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PropertyController {


    @Autowired
    private PropertyService propertyService;

@GetMapping("/hello")
    public String sayHello(){
    return "hello";
}

@PostMapping("/properties")
    public ResponseEntity<PropertyDTO> saveProperty(@RequestBody PropertyDTO propertyDTO){
    propertyDTO= propertyService.saveProperty(propertyDTO);
    ResponseEntity<PropertyDTO> responseEntity = new ResponseEntity<>(propertyDTO,HttpStatus.CREATED);
            //System.out.println(propertyDTO);
    return responseEntity;
}

@GetMapping("/properties")
    public ResponseEntity<List<PropertyDTO>>  getAllProperties(){
    List<PropertyDTO> propertyList = propertyService.getAllProperties();
ResponseEntity<List<PropertyDTO>> responseEntity = new ResponseEntity<>(propertyList,HttpStatus.CREATED);
return  responseEntity;
}

@PutMapping("/properties/{propertyId}")
    public  ResponseEntity<PropertyDTO>  updateProperty(@RequestBody PropertyDTO propertyDTO, @PathVariable Long propertyId){
    propertyDTO=propertyService.updateProperty(propertyDTO,propertyId);
    ResponseEntity<PropertyDTO> responseEntity = new ResponseEntity<>(propertyDTO,HttpStatus.CREATED);
    //System.out.println(propertyDTO);
    return responseEntity;
}



}
