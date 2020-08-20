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
import com.example.intern.repository.thuocRepository;
import com.example.intern.service.thuocService;
import com.example.intern.model.thuoc;


@RestController
@RequestMapping("/thuoc")
public class thuocController {
    @Autowired
    thuocRepository thuocrepository;
@GetMapping("/details")
public List<thuoc> getDetails()
{
return thuocrepository.findAll();
}

@PostMapping("/create")
public thuoc create(@Valid @RequestBody thuoc t)
{
    return thuocrepository.save(t);
}
@GetMapping("/details/{id}")
public thuoc detailById(@PathVariable(value = "id") Long tid )
{
    return thuocrepository.findById(tid).orElseThrow(()-> new thuocService("thuoc","id",tid));
}

@PutMapping("/update/{id}")
public thuoc update(@PathVariable(value = "id") Long id ,@Valid @RequestBody thuoc tid)
{
    
    thuoc t = thuocrepository.findById(id).orElseThrow(()->new thuocService("thuoc","id",id));
   // tid.setId(t.getId());
    tid.setTen(t.getTen());
    tid.setMota(t.getMota());
    return thuocrepository.save(t);
    
    
    
}
@DeleteMapping("/delete/{id}")
public ResponseEntity<?> delete(@PathVariable(value = "id") Long id)
{
    thuoc t = thuocrepository.findById(id).orElseThrow(()->new thuocService("thuoc", "id", id));
    thuocrepository.delete(t);
    return ResponseEntity.ok().build();
}

}

