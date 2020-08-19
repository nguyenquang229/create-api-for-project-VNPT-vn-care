/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.intern.model;
import javax.persistence.*;
@Entity
@Table(name = "dm_tinh")
    

public class tinh {
@Id
//@GeneratedValue(strategy = GenerationType.AUTO)
@Column(nullable = false)
private int id;
@Column(unique = true)
private String ten;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    
}
