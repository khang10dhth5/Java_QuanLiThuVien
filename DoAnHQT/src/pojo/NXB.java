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
public class NXB {
    private String MaNXB, TenNXB,DiaChi,SDT;

    public NXB(String MaNXB, String TenNXB, String DiaChi, String SDT) {
        this.MaNXB = MaNXB;
        this.TenNXB = TenNXB;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
    }

    @Override
    public String toString() {
        return this.TenNXB+"-MS:"+this.MaNXB; //To change body of generated methods, choose Tools | Templates.
    }
    
    public NXB(String TenNXB, String DiaChi, String SDT) {
        this.TenNXB = TenNXB;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
    }

    public NXB() {
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
     * @return the TenNXB
     */
    public String getTenNXB() {
        return TenNXB;
    }

    /**
     * @param TenNXB the TenNXB to set
     */
    public void setTenNXB(String TenNXB) {
        this.TenNXB = TenNXB;
    }

    /**
     * @return the DiaChi
     */
    public String getDiaChi() {
        return DiaChi;
    }

    /**
     * @param DiaChi the DiaChi to set
     */
    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    /**
     * @return the SDT
     */
    public String getSDT() {
        return SDT;
    }

    /**
     * @param SDT the SDT to set
     */
    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
}
