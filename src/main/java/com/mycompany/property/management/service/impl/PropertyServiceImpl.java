package com.mycompany.property.management.service.impl;

import com.mycompany.property.management.DTO.PropertyDTO;
import com.mycompany.property.management.entity.PropertyEntity;
import com.mycompany.property.management.controller.PropertyController;
import com.mycompany.property.management.converter.PropertyConverter;
import com.mycompany.property.management.repository.PropertyRepository;
import com.mycompany.property.management.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;

    @Autowired
    private PropertyConverter propertyConverter;
    @Override
    public PropertyDTO saveProperty(PropertyDTO propertyDTO) {
    PropertyEntity pe = propertyConverter.getProperty(propertyDTO);
        pe=propertyRepository.save(pe);
        PropertyDTO dto = propertyConverter.getEntitytoDTO(pe);
        return dto;
    }

    @Override
    public List<PropertyDTO> getAllProperties(){
    List<PropertyEntity> list = (List<PropertyEntity>)propertyRepository.findAll();
    List<PropertyDTO> propertyList = new ArrayList<>();
    for(PropertyEntity pe: list){
        PropertyDTO dto = propertyConverter.getEntitytoDTO(pe);
        propertyList.add(dto);
    }
    return propertyList;
    }

    @Override
    public PropertyDTO updateProperty(PropertyDTO propertyDTO, Long id) {
          Optional<PropertyEntity> pent=  propertyRepository.findById(id);
          PropertyDTO propDTO=null;
          if(pent.isPresent()){
              PropertyEntity pe=pent.get();// we receive the data from database
              pe.setTitle(propertyDTO.getTitle());
              pe.setPrice(propertyDTO.getPrice());
              pe.setOwnerName(propertyDTO.getOwnerName());
              pe.setOwnerEmail(propertyDTO.getOwnerEmail());
              pe.setAddress(propertyDTO.getAddress());
              pe.setDescription(propertyDTO.getDescription());
              propDTO=propertyConverter.getEntitytoDTO(pe);
              propertyRepository.save(pe);


          }
        return propDTO;
    }


}
