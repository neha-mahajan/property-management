package com.mycompany.property.management.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class BuisnessException extends RuntimeException{

    private List<ErrorModel> errors;



    public BuisnessException(List<ErrorModel> errors){
        this.errors=errors;
    }



}
