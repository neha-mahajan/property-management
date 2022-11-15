package com.mycompany.property.management.converter;

import com.mycompany.property.management.DTO.PropertyDTO;
import com.mycompany.property.management.DTO.UserDTO;
import com.mycompany.property.management.entity.PropertyEntity;
import com.mycompany.property.management.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public UserEntity getDTOtoEntity(UserDTO userDTO){
        UserEntity ue = new UserEntity();
        ue.setOwnerEmail(userDTO.getOwnerEmail());
        ue.setOwnerName(userDTO.getOwnerName());
        ue.setPhone(userDTO.getPhone());
        ue.setPassword(userDTO.getPassword());
        return ue;
    }

    public UserDTO getEntitytoDTO(UserEntity userEntity){
        UserDTO dto = new UserDTO();
        dto.setOwnerEmail(userEntity.getOwnerEmail());
        dto.setOwnerName(userEntity.getOwnerName());
        dto.setId(userEntity.getId());
        dto.setPhone(userEntity.getPhone());
        return dto;
    }
}
