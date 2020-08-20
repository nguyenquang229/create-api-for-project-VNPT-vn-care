/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.intern.model;
import javax.persistence.*;
@Entity
@Table(name = "dm_benh")
public class benh {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String Ten;
@Column(nullable = false)
private String Mabenh;
private String Mota;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getMabenh() {
        return Mabenh;
    }

    public void setMabenh(String Mabenh) {
        this.Mabenh = Mabenh;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }
    
}
