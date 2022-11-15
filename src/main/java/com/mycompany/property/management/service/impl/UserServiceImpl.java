package com.mycompany.property.management.service.impl;

import com.mycompany.property.management.DTO.UserDTO;
import com.mycompany.property.management.converter.UserConverter;
import com.mycompany.property.management.entity.UserEntity;
import com.mycompany.property.management.exception.BuisnessException;
import com.mycompany.property.management.exception.ErrorModel;
import com.mycompany.property.management.repository.UserRepository;
import com.mycompany.property.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConverter userConverter;

    @Override
    public UserDTO register(UserDTO userDTO) {

        Optional<UserEntity> optque= userRepository.findByOwnerEmail(userDTO.getOwnerEmail());
       if(optque.isPresent()) {
           List<ErrorModel> errorModelList = new ArrayList<>();

           ErrorModel errorModel = new ErrorModel();
           errorModel.setCode("Email  Already exist");
           errorModel.setMessage("Email you are trying to register ais already exist");
           errorModelList.add(errorModel);
           throw new BuisnessException(errorModelList);
       }
        UserEntity userEntity=userConverter.getDTOtoEntity(userDTO);
        userRepository.save(userEntity);
       userDTO = userConverter.getEntitytoDTO(userEntity);
        return userDTO;
    }

    @Override
    public UserDTO login(String email, String password)  {
        UserDTO dto=null;
        Optional<UserEntity> opt = userRepository.findByOwnerEmailAndPassword(email, password);
        if(opt.isPresent()){
            dto=userConverter.getEntitytoDTO(opt.get());
        }
        else{
            List<ErrorModel> errorModelList = new ArrayList<>();
            ErrorModel errorModel= new ErrorModel();
            errorModel.setCode("Invalid login");
            errorModel.setMessage("Incorrect username and password");
            errorModelList.add(errorModel);
            throw new BuisnessException(errorModelList);
        }
        return dto;
    }
}
