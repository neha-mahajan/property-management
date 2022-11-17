package com.mycompany.property.management.repository;

import com.mycompany.property.management.DTO.UserDTO;
import com.mycompany.property.management.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UserEntity,Long> {


    Optional<UserEntity> findByOwnerEmailAndPassword(String email, String password);
    Optional<UserEntity> findByOwnerEmail(String email);
}
