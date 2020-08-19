/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.intern.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dm_benhnhan")

/**
 *
 * @author QUANG
 */
public class benhnhan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String Ten;
    private Date NgaySinh;
    private String GioiTinh;
    private String CMND;
    private String NoiCap;
    private Date NgayCap;
    private String Bhyt;

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getNoiCap() {
        return NoiCap;
    }

    public void setNoiCap(String NoiCap) {
        this.NoiCap = NoiCap;
    }

    public Date getNgayCap() {
        return NgayCap;
    }

    public void setNgayCap(Date NgayCap) {
        this.NgayCap = NgayCap;
    }

    public String getBhyt() {
        return Bhyt;
    }

    public void setBhyt(String Bhyt) {
        this.Bhyt = Bhyt;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getAnhdaidien() {
        return anhdaidien;
    }

    public void setAnhdaidien(String anhdaidien) {
        this.anhdaidien = anhdaidien;
    }

    public String getAnhBhyt() {
        return anhBhyt;
    }

    public void setAnhBhyt(String anhBhyt) {
        this.anhBhyt = anhBhyt;
    }

    public String getAnhCMNDtruoc() {
        return anhCMNDtruoc;
    }

    public void setAnhCMNDtruoc(String anhCMNDtruoc) {
        this.anhCMNDtruoc = anhCMNDtruoc;
    }

    public String getAnhCMNDsau() {
        return anhCMNDsau;
    }

    public void setAnhCMNDsau(String anhCMNDsau) {
        this.anhCMNDsau = anhCMNDsau;
    }

    public String getTaikhoanid() {
        return taikhoanid;
    }

    public void setTaikhoanid(String taikhoanid) {
        this.taikhoanid = taikhoanid;
    }
    private String DiaChi;
    private String anhdaidien;
    private String anhBhyt;
    private String anhCMNDtruoc;
    private String anhCMNDsau;
    private String taikhoanid;
    
    
    
    
    
}
