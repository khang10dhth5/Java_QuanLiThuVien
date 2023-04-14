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
public class MuonTra {
   private String MaMT,MaDG,MaQL,NgayMuon,NgayTra; 

    public MuonTra(String MaMT, String MaDG, String MaQL, String NgayMuon, String NgayTra) {
        this.MaMT = MaMT;
        this.MaDG = MaDG;
        this.MaQL = MaQL;
        this.NgayMuon = NgayMuon;
        this.NgayTra = NgayTra;
    }

    public MuonTra(String MaDG, String MaQL, String NgayMuon, String NgayTra) {
        this.MaDG = MaDG;
        this.MaQL = MaQL;
        this.NgayMuon = NgayMuon;
        this.NgayTra = NgayTra;
    }

    

    public MuonTra() {
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
     * @return the MaDG
     */
    public String getMaDG() {
        return MaDG;
    }

    /**
     * @param MaDG the MaDG to set
     */
    public void setMaDG(String MaDG) {
        this.MaDG = MaDG;
    }

    /**
     * @return the MaQL
     */
    public String getMaQL() {
        return MaQL;
    }

    /**
     * @param MaQL the MaQL to set
     */
    public void setMaQL(String MaQL) {
        this.MaQL = MaQL;
    }

    /**
     * @return the NgayMuon
     */
    public String getNgayMuon() {
        return NgayMuon;
    }

    /**
     * @param NgayMuon the NgayMuon to set
     */
    public void setNgayMuon(String NgayMuon) {
        this.NgayMuon = NgayMuon;
    }

    /**
     * @return the NgayTra
     */
    public String getNgayTra() {
        return NgayTra;
    }

    /**
     * @param NgayTra the NgayTra to set
     */
    public void setNgayTra(String NgayTra) {
        this.NgayTra = NgayTra;
    }
}
