/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author Admin
 */
public class ChiTietMT {
    private String MaMT,MaSH,GhiChu;
    private int TienPhat;

    public ChiTietMT(String MaMT, String MaSH, int TienPhat, String GhiChu) {
        this.MaMT = MaMT;
        this.MaSH = MaSH;
    
        this.GhiChu = GhiChu;
        this.TienPhat = TienPhat;
    }

    public ChiTietMT(String MaSH, String GhiChu, int TienPhat) {
        this.MaSH = MaSH;
        this.GhiChu = GhiChu;
        this.TienPhat = TienPhat;
    }

    public ChiTietMT() {
    }

    /**
     * @return the MaMT
     */
    public String getMaMT() {
        return MaMT;
    }

    /**
     * @param MaMT the MaMT to set
     */
    public void setMaMT(String MaMT) {
        this.MaMT = MaMT;
    }

    /**
     * @return the MaSH
     */
    public String getMaSH() {
        return MaSH;
    }

    /**
     * @param MaSH the MaSH to set
     */
    public void setMaSH(String MaSH) {
        this.MaSH = MaSH;
    }

    /**
     * @return the NgayTra
     */
   

    /**
     * @param NgayTra the NgayTra to set
     */
   
    /**
     * @return the GhiChu
     */
    public String getGhiChu() {
        return GhiChu;
    }

    /**
     * @param GhiChu the GhiChu to set
     */
    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    /**
     * @return the TienPhat
     */
    public int getTienPhat() {
        return TienPhat;
    }

    /**
     * @param TienPhat the TienPhat to set
     */
    public void setTienPhat(int TienPhat) {
        this.TienPhat = TienPhat;
    }
}
