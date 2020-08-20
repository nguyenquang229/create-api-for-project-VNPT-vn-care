/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.intern.model;
import javax.persistence.*;
import org.springframework.lang.Nullable;
@Entity
@Table(name = "dm_khoa")
    
public class khoa {
    @Id
   @Column(nullable = false)
            private int Id;
    private String Ten;
    @Column(unique = true)
    private int CosoyteId;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getCosoyteId() {
        return CosoyteId;
    }

    public void setCosoyteId(int CosoyteId) {
        this.CosoyteId = CosoyteId;
    }
            
    
    
}
