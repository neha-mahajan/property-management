package com.mycompany.property.management.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="PROPERTY_TABLE")
@Getter
@Setter

public class PropertyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    @Column(name="PROPERTY_TITLE",nullable = false)
    private String title;
    private String description;
    private Double price;
    private String ownerName;
    private String ownerEmail;
    private String address;
}
