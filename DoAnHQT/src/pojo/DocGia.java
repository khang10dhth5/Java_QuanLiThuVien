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
public class DocGia {
    private String maDG,tenDG,sdt,DiaChi;
    private int slmuon;

    @Override
    public String toString() {
        return this.tenDG+"-MS:"+this.getMaDG(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public DocGia(String tenDG, String sdt, String DiaChi, int slmuon) {
        this.tenDG = tenDG;
        this.sdt = sdt;
        this.DiaChi = DiaChi;
        this.slmuon = slmuon;
    }

    public DocGia(String maDG, String tenDG, String sdt, String DiaChi, int slmuon) {
        this.maDG = maDG;
        this.tenDG = tenDG;
        this.sdt = sdt;
        this.DiaChi = DiaChi;
        this.slmuon = slmuon;
    }

    public DocGia() {
    }

    /**
     * @return the maDG
     */
    public String getMaDG() {
        return maDG;
    }

    /**
     * @param maDG the maDG to set
     */
    public void setMaDG(String maDG) {
        this.maDG = maDG;
    }

    /**
     * @return the tenDG
     */
    public String getTenDG() {
        return tenDG;
    }

    /**
     * @param tenDG the tenDG to set
     */
    public void setTenDG(String tenDG) {
        this.tenDG = tenDG;
    }

    /**
     * @return the sdt
     */
    public String getSdt() {
        return sdt;
    }

    /**
     * @param sdt the sdt to set
     */
    public void setSdt(String sdt) {
        this.sdt = sdt;
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
     * @return the slmuon
     */
    public int getSlmuon() {
        return slmuon;
    }

    /**
     * @param slmuon the slmuon to set
     */
    public void setSlmuon(int slmuon) {
        this.slmuon = slmuon;
    }
}
