/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.intern.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.intern.service.taikhoanService;
import com.example.intern.model.taikhoan;
import com.example.intern.repository.taikhoanRepository;
import javax.validation.Valid;


@RestController
@RequestMapping("/taikhoan")
public class taikhoanController {

    @Autowired
    taikhoanRepository tkRepository;

    // Get All taikhoans
@GetMapping("/details")
public List<taikhoan> getAlltaikhoan() {
    return tkRepository.findAll();
}
    // Create a new taikhoan
@PostMapping("/create")
public taikhoan createTaikhoan(@Valid @RequestBody taikhoan tk) {
    return tkRepository.save(tk);
}
    // Get a Single taikhoan
@GetMapping("/detail/{id}")
public taikhoan gettaikhoanByTaikhoan(@PathVariable(value = "id") Long tkId) {
    return tkRepository.findById(tkId)
            .orElseThrow(() -> new taikhoanService("taikhoan", "id", tkId));
}
    // Update a taikhoan
@PutMapping("/update/{id}")
public taikhoan updateTaikhoan(@PathVariable(value = "id") Long tkId,
                                        @Valid @RequestBody taikhoan tkDetails) {

    taikhoan tk = tkRepository.findById(tkId)
            .orElseThrow(() -> new taikhoanService("taikhoan", "id", tkId));

    tk.setHoten(tkDetails.getHoten());
    tk.setEmail(tkDetails.getEmail());
    tk.setSdt(tkDetails.getSdt());
    tk.setMatkhau(tkDetails.getMatkhau());
    

    taikhoan updatedtaikhoan = tkRepository.save(tk);
    return updatedtaikhoan;
}
    // Delete a taikhoan
@DeleteMapping("/delete/{id}")
public ResponseEntity<?> deleteTaikhoan(@PathVariable(value = "id") Long tkId) {
    taikhoan tk = tkRepository.findById(tkId)
            .orElseThrow(() -> new taikhoanService("taikhoan", "id", tkId));

    tkRepository.delete(tk);

    return ResponseEntity.ok().build();
}

}