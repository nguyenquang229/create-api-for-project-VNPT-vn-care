/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.intern.model;
import java.util.Date;
import javax.persistence.*;
@Entity
@Table(name = "kb_dangkykham")
public class dangkykham {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int Id;
   @Column(nullable = false)
   private Date thoigiandk;
   
   @Column(nullable = false)
   private Date thoigiankham;
   
   @Column(nullable = false)
   private boolean trangthaikham;
   private String noidungkham;
   
   @Column(nullable = false)
   private int loaikham;
   
   @Column(nullable = false)
   private int Benhchinhid;
   private String Benhphu;
   private String Mota;
   
   @Column(nullable = false)
   private int Benhnhanid;
   @Column(nullable = false)
   private int Bacsiid;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Date getThoigiandk() {
        return thoigiandk;
    }

    public void setThoigiandk(Date thoigiandk) {
        this.thoigiandk = thoigiandk;
    }

    public Date getThoigiankham() {
        return thoigiankham;
    }

    public void setThoigiankham(Date thoigiankham) {
        this.thoigiankham = thoigiankham;
    }

    public boolean isTrangthaikham() {
        return trangthaikham;
    }

    public void setTrangthaikham(boolean trangthaikham) {
        this.trangthaikham = trangthaikham;
    }

    public String getNoidungkham() {
        return noidungkham;
    }

    public void setNoidungkham(String noidungkham) {
        this.noidungkham = noidungkham;
    }

    public int getLoaikham() {
        return loaikham;
    }

    public void setLoaikham(int loaikham) {
        this.loaikham = loaikham;
    }

    public int getBenhchinhid() {
        return Benhchinhid;
    }

    public void setBenhchinhid(int Benhchinhid) {
        this.Benhchinhid = Benhchinhid;
    }

    public String getBenhphu() {
        return Benhphu;
    }

    public void setBenhphu(String Benhphu) {
        this.Benhphu = Benhphu;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }

    public int getBenhnhanid() {
        return Benhnhanid;
    }

    public void setBenhnhanid(int Benhnhanid) {
        this.Benhnhanid = Benhnhanid;
    }

    public int getBacsiid() {
        return Bacsiid;
    }

    public void setBacsiid(int Bacsiid) {
        this.Bacsiid = Bacsiid;
    }
   
}
