/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.intern.model;
import javax.persistence.*;
import org.springframework.lang.Nullable;
@Entity
@Table(name = "dm_bacsi")
    
public class bacsi {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String Ten;
    private String Chuyenkhoa;
    private String Trinhdo;
    private String Mota;
    
    @Column(nullable = false)
    private int KhoaId;
    @Column(nullable = false)
    private int Taikhoanid;

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

    public String getChuyenkhoa() {
        return Chuyenkhoa;
    }

    public void setChuyenkhoa(String Chuyenkhoa) {
        this.Chuyenkhoa = Chuyenkhoa;
    }

    public String getTrinhdo() {
        return Trinhdo;
    }

    public void setTrinhdo(String Trinhdo) {
        this.Trinhdo = Trinhdo;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }

    public int getKhoaId() {
        return KhoaId;
    }

    public void setKhoaId(int KhoaId) {
        this.KhoaId = KhoaId;
    }

    public int getTaikhoanid() {
        return Taikhoanid;
    }

    public void setTaikhoanid(int Taikhoanid) {
        this.Taikhoanid = Taikhoanid;
    }
    
            
    
    
}
