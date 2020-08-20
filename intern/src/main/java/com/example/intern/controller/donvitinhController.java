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
import com.example.intern.repository.donvitinhRepository;
import com.example.intern.service.donvitinhService;
import com.example.intern.model.donvitinh;


@RestController
@RequestMapping("/donvitinh")
public class donvitinhController {
    @Autowired
    donvitinhRepository donvitinhrepository;
@GetMapping("/details")
public List<donvitinh> getDetails()
{
return donvitinhrepository.findAll();
}

@PostMapping("/create")
public donvitinh create(@Valid @RequestBody donvitinh t)
{
    return donvitinhrepository.save(t);
}
@GetMapping("/details/{id}")
public donvitinh detailById(@PathVariable(value = "id") Long tid )
{
    return donvitinhrepository.findById(tid).orElseThrow(()-> new donvitinhService("donvitinh","id",tid));
}

@PutMapping("/update/{id}")
public donvitinh update(@PathVariable(value = "id") Long id ,@Valid @RequestBody donvitinh tid)
{
    
    donvitinh t = donvitinhrepository.findById(id).orElseThrow(()->new donvitinhService("donvitinh","id",id));
   // tid.setId(t.getId());
    tid.setTen(t.getTen());
    tid.setChitiet(t.getChitiet());
    return donvitinhrepository.save(t);
    
    
    
}
@DeleteMapping("/delete/{id}")
public ResponseEntity<?> delete(@PathVariable(value = "id") Long id)
{
    donvitinh t = donvitinhrepository.findById(id).orElseThrow(()->new donvitinhService("donvitinh", "id", id));
    donvitinhrepository.delete(t);
    return ResponseEntity.ok().build();
}

}
