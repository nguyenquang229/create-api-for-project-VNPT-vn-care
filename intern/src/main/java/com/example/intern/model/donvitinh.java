/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.intern.model;

import javax.persistence.*;
@Entity
@Table(name = "dm_donvitinh")
public class donvitinh {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String ten;
    private String chitiet;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getChitiet() {
        return chitiet;
    }

    public void setChitiet(String chitiet) {
        this.chitiet = chitiet;
    }
    
}
