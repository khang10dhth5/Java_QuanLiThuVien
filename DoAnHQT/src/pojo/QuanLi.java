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
public class QuanLi {
    private String MaQL,TenQL,TaiKhoan,MatKhau,sdt,diachi;

    @Override
    public String toString() {
        return this.TenQL+"-MS:"+this.MaQL; //To change body of generated methods, choose Tools | Templates.
    }
    
    public QuanLi() {
    }

    public QuanLi(String MaQL, String TenQL, String sdt, String diachi) {
        this.MaQL = MaQL;
        this.TenQL = TenQL;
        this.sdt = sdt;
        this.diachi = diachi;
    }

    public QuanLi(String MaQL, String TenQL, String TaiKhoan, String MatKhau, String sdt, String diachi) {
        this.MaQL = MaQL;
        this.TenQL = TenQL;
        this.TaiKhoan = TaiKhoan;
        this.MatKhau = MatKhau;
        this.sdt = sdt;
        this.diachi = diachi;
    }

    public QuanLi(String TenQL, String TaiKhoan, String MatKhau, String sdt, String diachi) {
        this.TenQL = TenQL;
        this.TaiKhoan = TaiKhoan;
        this.MatKhau = MatKhau;
        this.sdt = sdt;
        this.diachi = diachi;
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
     * @return the TenQL
     */
    public String getTenQL() {
        return TenQL;
    }

    /**
     * @param TenQL the TenQL to set
     */
    public void setTenQL(String TenQL) {
        this.TenQL = TenQL;
    }

    /**
     * @return the TaiKhoan
     */
    public String getTaiKhoan() {
        return TaiKhoan;
    }

    /**
     * @param TaiKhoan the TaiKhoan to set
     */
    public void setTaiKhoan(String TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
    }

    /**
     * @return the MatKhau
     */
    public String getMatKhau() {
        return MatKhau;
    }

    /**
     * @param MatKhau the MatKhau to set
     */
    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
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
     * @return the diachi
     */
    public String getDiachi() {
        return diachi;
    }

    /**
     * @param diachi the diachi to set
     */
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
}
