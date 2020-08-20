/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.intern.service;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class benhService extends RuntimeException {
    private String resourceName;
    private String fieldName;
    private Object fieldValue;
    
    public benhService(String resourceName,String filedName,Object fieldValue)
    {
        super(String.format("%s not found with %s,%s",resourceName,filedName,fieldValue));
        this.fieldName = filedName;
        this.resourceName = resourceName;
        this.fieldValue = this.fieldValue;
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
