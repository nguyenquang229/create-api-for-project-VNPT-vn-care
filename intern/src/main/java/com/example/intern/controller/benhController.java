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
import com.example.intern.repository.benhRepository;
import com.example.intern.service.benhService;
import com.example.intern.model.benh;


@RestController
@RequestMapping("/benh")
public class benhController {
    @Autowired
    benhRepository benhrepository;
@GetMapping("/details")
public List<benh> getDetails()
{
return benhrepository.findAll();
}

@PostMapping("/create")
public benh create(@Valid @RequestBody benh t)
{
    return benhrepository.save(t);
}
@GetMapping("/details/{id}")
public benh detailById(@PathVariable(value = "id") Long tid )
{
    return benhrepository.findById(tid).orElseThrow(()-> new benhService("benh","id",tid));
}

@PutMapping("/update/{id}")
public benh update(@PathVariable(value = "id") Long id ,@Valid @RequestBody benh tid)
{
    
    benh t = benhrepository.findById(id).orElseThrow(()->new benhService("benh","id",id));
    tid.setId(t.getId());
    tid.setTen(t.getTen());
    tid.setMabenh(t.getMabenh());
    tid.setMota(t.getMota());
    return benhrepository.save(t);
    
    
    
}
@DeleteMapping("/delete/{id}")
public ResponseEntity<?> delete(@PathVariable(value = "id") Long id)
{
    benh t = benhrepository.findById(id).orElseThrow(()->new benhService("benh", "id", id));
    benhrepository.delete(t);
    return ResponseEntity.ok().build();
}

}

