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
public class TheLoai {
    private String MaTL,TenTL;

    public TheLoai() {
    }

    public TheLoai(String MaTL, String TenTL) {
        this.MaTL = MaTL;
        this.TenTL = TenTL;
    }

    @Override
    public String toString() {
        return this.TenTL+"-MS:"+this.MaTL; //To change body of generated methods, choose Tools | Templates.
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
     * @return the TenTL
     */
    public String getTenTL() {
        return TenTL;
    }

    /**
     * @param TenTL the TenTL to set
     */
    public void setTenTL(String TenTL) {
        this.TenTL = TenTL;
    }
    
}
