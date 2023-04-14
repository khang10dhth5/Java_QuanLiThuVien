/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dataprovider.SQLServerProvider;
import java.sql.ResultSet;
import java.util.ArrayList;
import pojo.Sach;
import pojo.TacGia;

/**
 *
 * @author Admin
 */
public class SachDAO {
    public static ArrayList<Sach> layDanhSachSach(){
            ArrayList<Sach> dsSH=new ArrayList<Sach>();
        try{
            String sql="Select*from SACH";
            SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            ResultSet rs=provider.executeQuery(sql);
            while(rs.next()){
                Sach s=new Sach();
                s.setMaSH(rs.getString("MASH"));
                s.setTenSH(rs.getString("TENSH"));
                s.setMaTG(rs.getString("MATG"));
                s.setMaTL(rs.getString("MATL"));
                s.setMaNXB(rs.getString("MANXB"));
                s.setNamxb(rs.getInt("NAMXB"));
                s.setConlai(rs.getInt("CONLAI"));
                dsSH.add(s);
            }
            provider.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dsSH;
        
    }
    public static ArrayList<Sach> timKiemSachTheoTen(String tenSH){
        ArrayList<Sach> dsSH=new ArrayList<Sach>();
        try{
            String sql="Select*from SACH where TENSH LIKE N'%"+tenSH+"%'";
            SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            ResultSet rs=provider.executeQuery(sql);
            while(rs.next()){
                Sach s=new Sach();
                s.setMaSH(rs.getString("MASH"));
                s.setTenSH(rs.getString("TENSH"));
                s.setMaTG(rs.getString("MATG"));
                s.setMaTL(rs.getString("MATL"));
                s.setMaNXB(rs.getString("MANXB"));
                s.setNamxb(rs.getInt("NAMXB"));
                s.setConlai(rs.getInt("CONLAI"));
                dsSH.add(s);
            }
            provider.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dsSH;
        
    }
    public static boolean themSach(Sach s){
        boolean kq=false;
        String sql=String.format("Insert into SACH values(N'%s','%d','%d','%d','%d','%d')"
                ,s.getTenSH(),Integer.parseInt(s.getMaTG()),Integer.parseInt(s.getMaTL()),Integer.parseInt(s.getMaNXB()),s.getNamxb(),s.getConlai());
        SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            
            int n=provider.executeUpdate(sql);
            if(n==1){
                kq=true;
            }
            provider.close();
        return kq;
        
        
    }
    public static boolean xoaSach(int maSH){
        boolean kq=false;
        String sql=String.format("Delete from SACH where MaSH='%d'", maSH);
        SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            int n=provider.executeUpdate(sql);
            if(n==1){
                kq=true;
            }
            provider.close();
        return kq;
        
    }
    public static boolean  capNhatSach(Sach s) {
        boolean kq=false;
        String sql=String.format("UPDATE SACH set TENSH=N'%s',MATG='%d', MATL='%d', MANXB='%d', NAMXB='%d', CONLAI='%d'"
                +"where MASH='%d'", s.getTenSH(),Integer.parseInt(s.getMaTG()),Integer.parseInt(s.getMaTL()),Integer.parseInt(s.getMaNXB()),s.getNamxb(),s.getConlai(),Integer.parseInt( s.getMaSH()));
        SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            int n=provider.executeUpdate(sql);
            if(n==1){
                kq=true;
            }
        provider.close();
        return kq;
        
    }
    public static Sach laySach(int maSH){
        Sach s=null;
        try{
            String sql=String.format("select *from SACH Where MASH='%d'",maSH);
            SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            ResultSet rs = provider.executeQuery(sql);
            if(rs.next()){
                s=new Sach();
                s.setMaSH(rs.getString("MASH"));
                s.setTenSH(rs.getString("TENSH"));
                s.setMaTG(rs.getString("MATG"));
                s.setMaTL(rs.getString("MATL"));
                s.setMaNXB(rs.getString("MANXB"));
                s.setNamxb(rs.getInt("NAMXB"));
                s.setConlai(rs.getInt("CONLAI"));
            }
            provider.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return s;
    }
    public static boolean KiemTraSachTheoMa(int MaSH){
         boolean kq=false;
       Sach s=new Sach();
        try{
            String sql=String.format("Select*from SACH where MASH= '%d'",MaSH);
            SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            ResultSet rs=provider.executeQuery(sql);
            while(rs.next()){
                s.setMaSH(rs.getString("MASH"));
                kq=true;
            }
            provider.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return kq;
        
    }
   
}
