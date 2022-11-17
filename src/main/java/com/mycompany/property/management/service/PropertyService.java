package com.mycompany.property.management.service;

import com.mycompany.property.management.DTO.PropertyDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PropertyService {
    PropertyDTO saveProperty(PropertyDTO propertyDTO);
List<PropertyDTO> getAllProperties();
  PropertyDTO updateProperty(PropertyDTO propertyDTO,Long propertyId);



}
