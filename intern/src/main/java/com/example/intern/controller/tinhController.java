/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.intern.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import com.example.intern.repository.tinhRepository;
import com.example.intern.service.tinhService;
import com.example.intern.model.tinh;


@RestController
@RequestMapping("/tinh")
public class tinhController {
    @Autowired
    tinhRepository tinhrepository;
@GetMapping("/details")
public List<tinh> getDetails()
{
return tinhrepository.findAll();
}

@PostMapping("/create")
public tinh create(@Valid @RequestBody tinh t)
{
    return tinhrepository.save(t);
}
@GetMapping("/details/{id}")
public tinh detailById(@PathVariable(value = "id") Long tid )
{
    return tinhrepository.findById(tid).orElseThrow(()-> new tinhService("tinh","id",tid));
}

@PutMapping("/update/{id}")
public tinh update(@PathVariable(value = "id") Long id ,@Valid @RequestBody tinh tid)
{
    
    tinh t = tinhrepository.findById(id).orElseThrow(()->new tinhService("tinh","id",id));
    tid.setId(t.getId());
    tid.setTen(t.getTen());
    
    return tinhrepository.save(t);
    
    
    
}
@DeleteMapping("/delete/{id}")
public ResponseEntity<?> delete(@PathVariable(value = "id") Long id)
{
    tinh t = tinhrepository.findById(id).orElseThrow(()->new tinhService("tinh", "id", id));
    tinhrepository.delete(t);
    return ResponseEntity.ok().build();
}

}





