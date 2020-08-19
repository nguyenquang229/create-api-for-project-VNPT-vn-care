/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.intern.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.intern.model.taikhoan;
import org.springframework.stereotype.Repository;
@Repository
public interface taikhoanRepository extends JpaRepository<taikhoan, Long> {
    
}
