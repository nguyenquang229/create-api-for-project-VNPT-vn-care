/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.intern.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.intern.repository.khoaRepository;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import com.example.intern.model.khoa;
import com.example.intern.service.khoaService;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/khoa")

public class khoaController {
@Autowired 
khoaRepository krepos;


@GetMapping("/details")
public List<khoa> details()
{
    return krepos.findAll();
}
@GetMapping("/detail/{id}")
public khoa detailID(@PathVariable(value = "id") Long id)
{
    return krepos.findById(id).orElseThrow(()->new khoaService("khoa", "id", id));
    
}
@PostMapping("/create")
public khoa create(@Valid  @RequestBody khoa k)
    {
        return krepos.save(k);
    }

@PutMapping("/update/{id}")
public khoa update(@PathVariable(value = "id") Long id,@Valid @RequestBody khoa k)
{
    khoa kh = krepos.findById(id).orElseThrow(()->new khoaService("khoa","id", id));
    kh.setId(k.getId());
    kh.setTen(k.getTen());
    kh.setCosoyteId(k.getCosoyteId());
    return krepos.save(kh);
    
}
@DeleteMapping("delete/{id}")
public ResponseEntity<?> delete( @PathVariable(value = "id") Long id)
        
{
     khoa kh = krepos.findById(id).orElseThrow(()->new khoaService("khoa","id", id));
     krepos.delete(kh);
     return ResponseEntity.ok().build();
     
     
}
 
}
