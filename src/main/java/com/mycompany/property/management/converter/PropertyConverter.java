package com.mycompany.property.management.converter;

import com.mycompany.property.management.DTO.PropertyDTO;
import com.mycompany.property.management.entity.PropertyEntity;
import org.springframework.stereotype.Component;

@Component
public class PropertyConverter {

    public PropertyEntity getProperty(PropertyDTO propertyDTO){
        PropertyEntity pe = new PropertyEntity();
        pe.setTitle(propertyDTO.getTitle());
        pe.setDescription(propertyDTO.getDescription());
        pe.setPrice(propertyDTO.getPrice());
        pe.setAddress(propertyDTO.getAddress());
        pe.setOwnerEmail(propertyDTO.getOwnerEmail());
        pe.setOwnerName(propertyDTO.getOwnerName());
        return pe;
    }


    public PropertyDTO getEntitytoDTO(PropertyEntity propertyEntity){
        PropertyDTO propertyDTO = new PropertyDTO();
        propertyDTO.setId(propertyEntity.getId());
        propertyDTO.setTitle(propertyEntity.getTitle());
        propertyDTO.setDescription(propertyEntity.getDescription());
        propertyDTO.setPrice(propertyEntity.getPrice());
        propertyDTO.setAddress(propertyEntity.getAddress());
        propertyDTO.setOwnerEmail(propertyEntity.getOwnerEmail());
        propertyDTO.setOwnerName(propertyEntity.getOwnerName());
        return propertyDTO;
    }

}
