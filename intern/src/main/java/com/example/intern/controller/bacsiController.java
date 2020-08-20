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
import com.example.intern.repository.bacsiRepository;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import com.example.intern.model.bacsi;
import com.example.intern.service.bacsiService;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/bacsi")

public class bacsiController {
@Autowired 
bacsiRepository bsRepos;


@GetMapping("/details")
public List<bacsi> details()
{
    return bsRepos.findAll();
}
@GetMapping("/detail/{id}")
public bacsi detailID(@PathVariable(value = "id") Long id)
{
    return bsRepos.findById(id).orElseThrow(()->new bacsiService("bacsi", "id", id));
    
}
@PostMapping("/create")
public bacsi create(@Valid  @RequestBody bacsi k)
    {
        return bsRepos.save(k);
    }

@PutMapping("/update/{id}")
public bacsi update(@PathVariable(value = "id") Long id,@Valid @RequestBody bacsi k)
{
    bacsi kh = bsRepos.findById(id).orElseThrow(()->new bacsiService("bacsi","id", id));
    kh.setId(k.getId());
    kh.setTen(k.getTen());
    kh.setChuyenkhoa(k.getChuyenkhoa());
    kh.setMota(k.getMota());
    kh.setTrinhdo(k.getTrinhdo());
    kh.setKhoaId(k.getKhoaId());
    kh.setTaikhoanid(k.getTaikhoanid());
    return bsRepos.save(kh);
    
}
@DeleteMapping("delete/{id}")
public ResponseEntity<?> delete( @PathVariable(value = "id") Long id)
        
{
     bacsi kh = bsRepos.findById(id).orElseThrow(()->new bacsiService("bacsi","id", id));
     bsRepos.delete(kh);
     return ResponseEntity.ok().build();
     
     
}
 
}
