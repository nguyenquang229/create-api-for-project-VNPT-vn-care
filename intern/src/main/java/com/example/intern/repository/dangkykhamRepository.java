/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.intern.repository;

import com.example.intern.model.dangkykham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author QUANG
 */
@Repository
public interface dangkykhamRepository extends JpaRepository<dangkykham, Long> {
    
}
