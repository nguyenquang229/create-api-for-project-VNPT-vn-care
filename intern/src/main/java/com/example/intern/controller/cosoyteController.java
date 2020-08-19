/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.intern.controller;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.intern.model.cosoyte;
import com.example.intern.repository.cosoyteRepository;
import com.example.intern.service.cosoyteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cosoyte")


public class cosoyteController {
    @Autowired
    cosoyteRepository csytRepository;
    
    @GetMapping("/details")
    public List<cosoyte> getAll()
        {
         return csytRepository.findAll();
        }
    @GetMapping("/detail/{id}")
    public cosoyte detailById(@PathVariable(value = "id") Long id)
    {
        return csytRepository.findById(id).orElseThrow(()->new cosoyteService
                ("cosoyte", "id", id));
            
    }
    @PostMapping("/create")
    public cosoyte create(@Valid @RequestBody cosoyte csyt)
    {
        return csytRepository.save(csyt);
    }
    @PutMapping("/update/{id}")
    public cosoyte update(@PathVariable(value = "id") Long id,@Valid @RequestBody cosoyte csyt)
    {
        cosoyte cs = csytRepository.findById(id).orElseThrow(()->new cosoyteService("cosoyte","id", id));
        cs.setId(csyt.getId());
        cs.setTen(csyt.getTen());
        cs.setTinhid(csyt.getTinhid());
        return csytRepository.save(csyt);
        
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id){
        
        cosoyte cs = csytRepository.findById(id).orElseThrow(()->new cosoyteService("cosoyte", "id", id));
        csytRepository.delete(cs);
        return ResponseEntity.ok().build();
    }

}

