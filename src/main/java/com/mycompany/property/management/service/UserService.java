package com.mycompany.property.management.service;

import com.mycompany.property.management.DTO.UserDTO;

public interface UserService {
   UserDTO register(UserDTO userDTO);
       UserDTO login(String email,String password);
}
