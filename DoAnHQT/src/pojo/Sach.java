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
public class Sach {
    private String MaSH,TenSH,MaTG,MaTL,MaNXB;
    private int namxb,conlai;

    @Override
    public String toString() {
        return this.TenSH+"-MS:"+this.MaSH; //To change body of generated methods, choose Tools | Templates.
    }
    
    public Sach(String TenSH, String MaTG, String MaTL, String MaNXB, int namxb, int conlai) {
        this.TenSH = TenSH;
        this.MaTG = MaTG;
        this.MaTL = MaTL;
        this.MaNXB = MaNXB;
        this.namxb = namxb;
        this.conlai = conlai;
    }

    public Sach(String MaSH, String TenSH, String MaTG, String MaTL, String MaNXB, int namxb, int conlai) {
        this.MaSH = MaSH;
        this.TenSH = TenSH;
        this.MaTG = MaTG;
        this.MaTL = MaTL;
        this.MaNXB = MaNXB;
        this.namxb = namxb;
        this.conlai = conlai;
    }

    public Sach() {
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
     * @return the TenSH
     */
    public String getTenSH() {
        return TenSH;
    }

    /**
     * @param TenSH the TenSH to set
     */
    public void setTenSH(String TenSH) {
        this.TenSH = TenSH;
    }

    /**
     * @return the MaTG
     */
    public String getMaTG() {
        return MaTG;
    }

    /**
     * @param MaTG the MaTG to set
     */
    public void setMaTG(String MaTG) {
        this.MaTG = MaTG;
    }

    /**
     * @return the MaTL
     */
    public String getMaTL() {
        return MaTL;
    }

    /**
     * @param MaTL the MaTL to set
     */
    public void setMaTL(String MaTL) {
        this.MaTL = MaTL;
    }

    /**
     * @return the MaNXB
     */
    public String getMaNXB() {
        return MaNXB;
    }

    /**
     * @param MaNXB the MaNXB to set
     */
    public void setMaNXB(String MaNXB) {
        this.MaNXB = MaNXB;
    }

    /**
     * @return the namxb
     */
    public int getNamxb() {
        return namxb;
    }

    /**
     * @param namxb the namxb to set
     */
    public void setNamxb(int namxb) {
        this.namxb = namxb;
    }

    /**
     * @return the conlai
     */
    public int getConlai() {
        return conlai;
    }

    /**
     * @param conlai the conlai to set
     */
    public void setConlai(int conlai) {
        this.conlai = conlai;
    }
}
