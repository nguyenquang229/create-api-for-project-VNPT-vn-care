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


import com.example.intern.service.benhnhanService;
import com.example.intern.model.benhnhan;
import com.example.intern.repository.benhnhanRepository;
import javax.validation.Valid;
       

@RestController
@RequestMapping("/benhnhan")
public class benhnhanController {

    @Autowired
    benhnhanRepository benhnhanRepository;

    // Get All benhnhans
@GetMapping("/details")
public List<benhnhan> getAllbenhnhan() {
    return benhnhanRepository.findAll();
}
    // Create a new benhnhan
@PostMapping("/create")
public benhnhan createBenhnhan(@Valid @RequestBody benhnhan bn) {
    return benhnhanRepository.save(bn);
}
    // Get a Single benhnhan
@GetMapping("/details/{id}")
public benhnhan getbenhnhanById(@PathVariable(value = "id") Long bnId) {
    return benhnhanRepository.findById(bnId)
            .orElseThrow(() -> new benhnhanService("benhnhan", "id", bnId));
}
    // Update a benhnhan
@PutMapping("/update/{id}")
public benhnhan updateBenhnhan(@PathVariable(value = "id") Long bnId,
                                        @Valid @RequestBody benhnhan bnDetails) {

    benhnhan bn = benhnhanRepository.findById(bnId)
            .orElseThrow(() -> new benhnhanService("benhnhan", "id", bnId));

    bn.setTen(bnDetails.getTen());
    bn.setNgaySinh(bnDetails.getNgaySinh());
    bn.setGioiTinh(bnDetails.getGioiTinh());
    bn.setCMND(bnDetails.getCMND());
    bn.setNoiCap(bnDetails.getNoiCap());
    bn.setNgayCap(bnDetails.getNgayCap());
    bn.setBhyt(bnDetails.getBhyt());
    bn.setDiaChi(bnDetails.getDiaChi());
    bn.setAnhBhyt(bnDetails.getAnhBhyt());
    bn.setAnhCMNDtruoc(bnDetails.getAnhCMNDtruoc());
    bn.setAnhCMNDsau(bnDetails.getAnhCMNDsau());
    bn.setTaikhoanid(bnDetails.getTaikhoanid());
    benhnhan updatedbenhnhan = benhnhanRepository.save(bn);
    return updatedbenhnhan;
}
    // Delete a benhnhan
@DeleteMapping("/delete/{id}")
public ResponseEntity<?> deleteBenhnhan(@PathVariable(value = "id") Long bnId) {
    benhnhan bn = benhnhanRepository.findById(bnId)
            .orElseThrow(() -> new benhnhanService("benhnhan", "id", bnId));

    benhnhanRepository.delete(bn);

    return ResponseEntity.ok().build();
}

}