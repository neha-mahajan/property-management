package com.mycompany.property.management.controller;

import com.mycompany.property.management.DTO.CalculatorDTO;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;


@ExtendWith(MockitoExtension.class)
public class CalculateContollerTest {


    //@BeforeEach

static Double num1 ;
    static Double num2 ;
   static Double num3;

    @BeforeAll
    static void beforeAll(){
        System.out.println("Beforeall method");
        num1=3.5;
        num2=3.5;
        num3=3.5;
    }


    @AfterAll
    static void afterAll(){
        System.out.println("afterall method");
        num1=3.5;
        num2=3.5;
        num3=3.5;
    }
    @InjectMocks
    private CalculateController calculateController;

    @Test
    @DisplayName("test addition success scenario")
    void additionTest_sucess(){
        Double result=calculateController.add(3.5,3.5,3.5);
       Assertions.assertEquals(7.0,result);
    }

    @Test
    @DisplayName("test addition failure scenario")
    void additionTest_failure(){
        Double result=calculateController.add(3.0,3.5,3.5);
        Assertions.assertNotEquals(7.0,result);
    }

    @Test
    @DisplayName("test substraction success scenario")
    void substractionTest_sucess(){
        Double result=calculateController.subtract(num1+1,num2);
        Assertions.assertEquals(1.0,result);
    }

    @Test
    @DisplayName("test substraction num1 is greater")
    void substractionTst_no2isgreater(){
        Double result=calculateController.subtract(num1,num2+1);
        Assertions.assertEquals(1.0,result);
    }


    @Test
    void multiply(){
        CalculatorDTO dto= new CalculatorDTO();
        dto.setNum1(num1);
        dto.setNum2(num2);
        dto.setNum3(num3);
        ResponseEntity<Double> responseEntity = calculateController.multiply(dto);
        Assertions.assertEquals(42.875,responseEntity.getBody());

    }



}
