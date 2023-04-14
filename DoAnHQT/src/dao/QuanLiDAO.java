/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dataprovider.SQLServerProvider;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTextField;
import pojo.DocGia;
import pojo.QuanLi;

/**
 *
 * @author Admin
 */
public class QuanLiDAO {
    public static ArrayList<QuanLi> layDanhSachQL(){
            ArrayList<QuanLi> dsQL=new ArrayList<QuanLi>();
        try{
            String sql="Select*from QUANLY";
            SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            ResultSet rs=provider.executeQuery(sql);
            while(rs.next()){
                QuanLi ql=new QuanLi();
                ql.setMaQL(rs.getString("MAQL"));
                ql.setTaiKhoan(rs.getString("TAIKHOAN"));
                ql.setMatKhau(rs.getString("MATKHAU"));
                ql.setTenQL(rs.getString("TENQL"));
                 ql.setSdt(rs.getString("SDT"));
                ql.setDiachi(rs.getString("DIACHI"));
                
                dsQL.add(ql);
            }
            provider.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dsQL;
        
    }
    
    public static boolean themQL(QuanLi ql){
        boolean kq=false;
        String sql=String.format("Insert into QUANLY values('%s','%s',N'%s','%s',N'%s')"
                ,ql.getTaiKhoan(),ql.getMatKhau(),ql.getTenQL(),ql.getSdt(),ql.getDiachi());
        SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            
            int n=provider.executeUpdate(sql);
            if(n==1){
                kq=true;
            }
            provider.close();
        return kq;
        
        
    }
    public static boolean xoaDG(int maQL){
        boolean kq=false;
        String sql=String.format("Delete from QUANLY where MAQL='%d'", maQL);
        SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            int n=provider.executeUpdate(sql);
            if(n==1){
                kq=true;
            }
            provider.close();
        return kq;
        
    }
    public static boolean  capNhatQL(QuanLi ql) {
        boolean kq=false;
        String sql=String.format("UPDATE QUANLY set TENQL=N'%s',TAIKHOAN='%s',MATKHAU='%s',SDT='%s',DIACHI=N'%s'"
                +"where MAQL='%d'",ql.getTenQL(),ql.getTaiKhoan(),ql.getMatKhau(),ql.getSdt(),ql.getDiachi(),Integer.parseInt(ql.getMaQL()));
        SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            int n=provider.executeUpdate(sql);
            if(n==1){
                kq=true;
            }
        provider.close();
        return kq;
        
    }
    public static boolean  capNhatQLThongThuong(QuanLi ql) {
        boolean kq=false;
        String sql=String.format("UPDATE QUANLY set TENQL=N'%s',SDT='%s',DIACHI=N'%s'"
                +"where MAQL='%d'",ql.getTenQL(),ql.getSdt(),ql.getDiachi(),Integer.parseInt(ql.getMaQL()));
        SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            int n=provider.executeUpdate(sql);
            if(n==1){
                kq=true;
            }
        provider.close();
        return kq;
        
    }
        public static QuanLi DangNhap(String tk,String mk){
            QuanLi ql=null;
         try{
            String sql=String.format("Select*from QUANLY WHERE TAIKHOAN='%s' and MATKHAU='%s'",tk,mk);
            SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            ResultSet rs=provider.executeQuery(sql);
            while(rs.next()){
                ql=new QuanLi();
                ql.setMaQL(rs.getString("MAQL"));
                ql.setTaiKhoan(rs.getString("TAIKHOAN"));
                ql.setMatKhau(rs.getString("MATKHAU"));
                ql.setTenQL(rs.getString("TENQL"));
                ql.setSdt(rs.getString("SDT"));
                ql.setDiachi(rs.getString("DIACHI"));
            }
            provider.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return ql;
        
    }
        public static QuanLi layQL(int maQL){
        QuanLi s=null;
        try{
            String sql=String.format("select *from QUANLY Where MAQL='%d'",maQL);
            SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            ResultSet rs = provider.executeQuery(sql);
            if(rs.next()){
                s=new QuanLi();
                s.setMaQL(rs.getString("MAQL"));
                s.setTaiKhoan(rs.getString("TAIKHOAN"));
                s.setMatKhau(rs.getString("MATKHAU"));
                s.setTenQL(rs.getString("TENQL"));
                s.setSdt(rs.getString("SDT"));
                s.setDiachi(rs.getString("DIACHI"));
            
            }
            provider.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return s;
    }
    
    
}
