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
import com.example.intern.repository.dangkykhamRepository;
import com.example.intern.service.dangkykhamService;
import com.example.intern.model.dangkykham;


@RestController
@RequestMapping("/dangkykham")
public class dangkykhamController {
    @Autowired
    dangkykhamRepository dangkykhamrepository;
@GetMapping("/details")
public List<dangkykham> getDetails()
{
return dangkykhamrepository.findAll();
}

@PostMapping("/create")
public dangkykham create(@Valid @RequestBody dangkykham t)
{
    return dangkykhamrepository.save(t);
}
@GetMapping("/details/{id}")
public dangkykham detailById(@PathVariable(value = "id") Long tid )
{
    return dangkykhamrepository.findById(tid).orElseThrow(()-> new dangkykhamService("dangkykham","id",tid));
}

@PutMapping("/update/{id}")
public dangkykham update(@PathVariable(value = "id") Long id ,@Valid @RequestBody dangkykham tid)
{
    
    dangkykham t = dangkykhamrepository.findById(id).orElseThrow(()->new dangkykhamService("dangkykham","id",id));
   // tid.setId(t.getId());
    tid.setThoigiandk(t.getThoigiandk());
    tid.setThoigiankham(t.getThoigiankham());
    tid.setTrangthaikham(t.isTrangthaikham());
    tid.setNoidungkham(t.getNoidungkham());
    tid.setLoaikham(t.getLoaikham());
    tid.setBenhchinhid(t.getBenhchinhid());
    tid.setBenhphu(t.getBenhphu());
    tid.setMota(t.getMota());
    tid.setBenhnhanid(t.getBenhnhanid());
    tid.setBacsiid(t.getBacsiid());
    
    return dangkykhamrepository.save(t);
    
    
    
}
@DeleteMapping("/delete/{id}")
public ResponseEntity<?> delete(@PathVariable(value = "id") Long id)
{
    dangkykham t = dangkykhamrepository.findById(id).orElseThrow(()->new dangkykhamService("dangkykham", "id", id));
    dangkykhamrepository.delete(t);
    return ResponseEntity.ok().build();
}

}

