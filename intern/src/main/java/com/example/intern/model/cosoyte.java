/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.intern.model;
import javax.persistence.*;

@Entity
@Table(name = "dm_cosoyte")
    
public class cosoyte {
@Id
@Column(nullable = false)
private int id;
private String ten;
@Column(unique = true)
private int tinhid;

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

    public int getTinhid() {
        return tinhid;
    }

    public void setTinhid(int tinhid) {
        this.tinhid = tinhid;
    }


}
