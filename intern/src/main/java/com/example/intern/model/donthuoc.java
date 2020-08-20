/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.intern.model;

import javax.persistence.*;
@Entity
@Table(name = "kb_donthuoc")

public class donthuoc {
@Id
//@GeneratedValue(strategy = GenerationType.AUTO)
@Column(nullable = false)
private int dangkikhamid;
@Column(nullable = false)
private int thuocId;
@Column(nullable = false)
private int donvitinhId;
private Double soluong;
private String huongdan;

    public int getDangkikhamid() {
        return dangkikhamid;
    }

    public void setDangkikhamid(int dangkikhamid) {
        this.dangkikhamid = dangkikhamid;
    }

    public int getThuocId() {
        return thuocId;
    }

    public void setThuocId(int thuocId) {
        this.thuocId = thuocId;
    }

    public int getDonvitinhId() {
        return donvitinhId;
    }

    public void setDonvitinhId(int donvitinhId) {
        this.donvitinhId = donvitinhId;
    }

    public Double getSoluong() {
        return soluong;
    }

    public void setSoluong(Double soluong) {
        this.soluong = soluong;
    }

    public String getHuongdan() {
        return huongdan;
    }

    public void setHuongdan(String huongdan) {
        this.huongdan = huongdan;
    }

}
