package com.mycompany.property.management.controller;


import com.mycompany.property.management.DTO.CalculatorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/api/v1/calculator")
public class CalculateController {

    @GetMapping("/add{num3}")
    public Double add(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2,
                    @PathVariable("num3") Double num3){
        return num1+num2;
    }

    @GetMapping("/sub/{num112}/{num2}")
    public Double subtract(@PathVariable("num112") Double num1, @PathVariable("num2") Double num2){
          if(num1>num2) {
              return num1 - num2;
          }
              else {
                  return num2-num1;

              }
    }


    @GetMapping("/mul")
    public ResponseEntity<Double> multiply(@RequestBody CalculatorDTO calculatorDTO){
                Double result=calculatorDTO.getNum1() * calculatorDTO.getNum2() * calculatorDTO.getNum3();
                ResponseEntity<Double> responseEntity = new ResponseEntity<>(result, HttpStatus.CREATED);
                return responseEntity;
    }


}
