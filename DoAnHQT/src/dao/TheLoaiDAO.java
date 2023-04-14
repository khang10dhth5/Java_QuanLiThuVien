/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dataprovider.SQLServerProvider;
import java.sql.ResultSet;
import java.util.ArrayList;
import pojo.TacGia;
import pojo.TheLoai;

/**
 *
 * @author Admin
 */
public class TheLoaiDAO {
    public static ArrayList<TheLoai> layDanhSachTheLoai(){
        ArrayList<TheLoai> dsTL=new ArrayList<TheLoai>();
        try{
            String sql="Select*from THELOAI";
            SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            ResultSet rs=provider.executeQuery(sql);
            while(rs.next()){
                TheLoai tl=new TheLoai();
                tl.setMaTL(rs.getString("MATL"));
                tl.setTenTL(rs.getString("TENTL"));
                dsTL.add(tl);
            }
            provider.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dsTL;
        
    }
    public static ArrayList<TheLoai> timKiemTLTheoTen(String tenTL){
        ArrayList<TheLoai> dsTL=new ArrayList<TheLoai>();
        try{
            String sql="Select*from THELOAI where TENTL LIKE N'%"+tenTL+"%'";
            SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            ResultSet rs=provider.executeQuery(sql);
            while(rs.next()){
                TheLoai tl=new TheLoai();
                tl.setMaTL(rs.getString("MATL"));
                tl.setTenTL(rs.getString("TENTL"));
             
                dsTL.add(tl);
            }
            provider.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dsTL;
        
    }
    public static boolean themTL(TheLoai tl){
        boolean kq=false;
        String sql=String.format("Insert into THELOAI() values(N'%s')", tl.getTenTL());
        SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            
            int n=provider.executeUpdate(sql);
            if(n==1){
                kq=true;
            }
            provider.close();
        return kq;
        
        
    }
    public static boolean xoaTL(int maTL){
        boolean kq=false;
        String sql=String.format("Delete from THELOAI where MaTL='%d'", maTL);
        SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            int n=provider.executeUpdate(sql);
            if(n==1){
                kq=true;
            }
            provider.close();
        return kq;
        
    }
    public static boolean  capNhatTL(TheLoai tl) {
        boolean kq=false;
        String sql=String.format("UPDATE THELOAI set TENTL=N'%s'"
                +"where MaTL='%d'", tl.getTenTL(),Integer.parseInt( tl.getMaTL()));
        SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            int n=provider.executeUpdate(sql);
            if(n==1){
                kq=true;
            }
        provider.close();
        return kq;
        
    }
    public static TheLoai layTL(int maTL){
        TheLoai tl=null;
        try{
            String sql="select *from THELOAI Where MaTL="+maTL;
            SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            ResultSet rs = provider.executeQuery(sql);
            if(rs.next()){
                tl=new TheLoai();
                tl.setMaTL(rs.getString("MATL"));
                tl.setTenTL(rs.getString("TENTL"));
              
             
            }
            provider.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return tl;
    }
}
