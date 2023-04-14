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
public class TacGia {
    private String MaTG,TenTG,GhiChu;

    public TacGia() {
    }

    @Override
    public String toString() {
        return this.getTenTG()+"-MS:"+this.MaTG; //To change body of generated methods, choose Tools | Templates.
    }
    
    public TacGia(String MaTG, String TenTG, String GhiChu) {
        this.MaTG = MaTG;
        this.TenTG = TenTG;
        this.GhiChu = GhiChu;
    }

    public TacGia(String TenTG, String GhiChu) {
        this.TenTG = TenTG;
        this.GhiChu = GhiChu;
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
     * @return the TenTG
     */
    public String getTenTG() {
        return TenTG;
    }

    /**
     * @param TenTG the TenTG to set
     */
    public void setTenTG(String TenTG) {
        this.TenTG = TenTG;
    }

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
}
