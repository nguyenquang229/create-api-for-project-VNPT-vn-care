/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.intern.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author QUANG
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class cosoyteService extends RuntimeException {
    private String resourceName;
    private String fieldName;
    private Object fieldValue;
    public cosoyteService(String resourceName,String fieldName,Object fieldValue)
    {
        super(String.format("%s not found %s,%s",resourceName,fieldName,fieldValue));
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
        this.resourceName = resourceName;
    }

    public String getResourceName() {
        return resourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Object getFieldValue() {
        return fieldValue;
    }
    
    
}
