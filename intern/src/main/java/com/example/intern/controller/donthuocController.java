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
import com.example.intern.repository.donthuocRepository;
import com.example.intern.service.donthuocService;
import com.example.intern.model.donthuoc;


@RestController
@RequestMapping("/donthuoc")
public class donthuocController {
    @Autowired
    donthuocRepository donthuocrepository;
@GetMapping("/details")
public List<donthuoc> getDetails()
{
return donthuocrepository.findAll();
}

@PostMapping("/create")
public donthuoc create(@Valid @RequestBody donthuoc t)
{
    return donthuocrepository.save(t);
}
@GetMapping("/details/{id}")
public donthuoc detailById(@PathVariable(value = "id") Long tid )
{
    return donthuocrepository.findById(tid).orElseThrow(()-> new donthuocService("donthuoc","id",tid));
}

@PutMapping("/update/{id}")
public donthuoc update(@PathVariable(value = "id") Long id ,@Valid @RequestBody donthuoc tid)
{
    
    donthuoc t = donthuocrepository.findById(id).orElseThrow(()->new donthuocService("donthuoc","id",id));
    tid.setDangkikhamid(t.getDangkikhamid());
    tid.setThuocId(t.getThuocId());
    tid.setDonvitinhId(t.getDonvitinhId());
    tid.setSoluong(t.getSoluong());
    tid.setHuongdan(t.getHuongdan());
    
    return donthuocrepository.save(t);
    
    
    
}
@DeleteMapping("/delete/{id}")
public ResponseEntity<?> delete(@PathVariable(value = "id") Long id)
{
    donthuoc t = donthuocrepository.findById(id).orElseThrow(()->new donthuocService("donthuoc", "id", id));
    donthuocrepository.delete(t);
    return ResponseEntity.ok().build();
}

}
