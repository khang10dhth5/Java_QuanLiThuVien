/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dataprovider.SQLServerProvider;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.print.DocFlavor;
import javax.swing.JOptionPane;
import pojo.DocGia;
import pojo.Sach;

/**
 *
 * @author Admin
 */
public class DocGiaDAO {
    CallableStatement cs;
    Statement st;
    private SQLServerProvider con;

    public static ArrayList<DocGia> layDanhSachDG(){
            ArrayList<DocGia> dsDG=new ArrayList<DocGia>();
        try{
            String sql="Select*from DOCGIA";
            SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            ResultSet rs=provider.executeQuery(sql);
            while(rs.next()){
                DocGia dg=new DocGia();
                dg.setMaDG(rs.getString("MADG"));
                dg.setTenDG(rs.getString("TENDG"));
                dg.setSdt(rs.getString("SDT"));
                dg.setDiaChi(rs.getString("DIACHI"));     
                dg.setSlmuon(rs.getInt("SLMUON"));
                dsDG.add(dg);
            }
            provider.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dsDG;
        
    }
    
   public static boolean themDG(DocGia ql){
        boolean kq=false;
        String sql=String.format("Insert into DOCGIA values(N'%s','%s',N'%s','%d')"
                ,ql.getTenDG(),ql.getSdt(),ql.getDiaChi(),ql.getSlmuon());
        SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            int n=provider.executeUpdate(sql);
            if(n==1){
                kq=true;
            }
            provider.close();
        return kq;
        
        
    }
    public static boolean xoaDG(int maDG){
        boolean kq=false;
        String sql=String.format("Delete from DOCGIA where MaDG='%d'", maDG);
        SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            int n=provider.executeUpdate(sql);
            if(n==1){
                kq=true;
            }
            provider.close();
        return kq;
        
    }
    public static boolean  capNhatDG(DocGia dg) {
        boolean kq=false;
        String sql=String.format("UPDATE DOCGIA set TENDG=N'%s',SDT='%s', DIACHI=N'%s',SLMUON='%d'"
                +"where MADG='%d'",dg.getTenDG(),dg.getSdt(),dg.getDiaChi(),dg.getSlmuon(),Integer.parseInt( dg.getMaDG()));
        SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            int n=provider.executeUpdate(sql);
            if(n==1){
                kq=true;
            }
        provider.close();
        return kq;
        
    }
     public static boolean KiemTraDGTheoMa(int MaDG){
         boolean kq=false;
        DocGia s=new DocGia();
        try{
            String sql=String.format("Select*from DOCGIA where MADG= '%d'",MaDG);
            SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            ResultSet rs=provider.executeQuery(sql);
            while(rs.next()){
                s.setMaDG(rs.getString("MADG"));
                s.setTenDG(rs.getString("TENDG"));
                s.setSdt(rs.getString("SDT"));
                s.setDiaChi(rs.getString("DIACHI"));
                s.setSlmuon(rs.getInt("SLMUON"));
                kq=true;
            }
            provider.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return kq;
        
    }
    public static ArrayList<DocGia> timKiemDGTheoTen(String tenDG){
        ArrayList<DocGia> dsDG=new ArrayList<DocGia>();
        try{
            String sql="Select*from DOCGIA where TENDG LIKE N'%"+tenDG+"%'";
            SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            ResultSet rs=provider.executeQuery(sql);
            while(rs.next()){
                DocGia s=new DocGia();
                s.setMaDG(rs.getString("MADG"));
                s.setTenDG(rs.getString("TENDG"));
                s.setSdt(rs.getString("SDT"));
                s.setDiaChi(rs.getString("DIACHI"));
                s.setSlmuon(rs.getInt("SLMUON"));
                dsDG.add(s);
            }
            provider.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dsDG;
        
    }
    public static DocGia layDG(int maDG){
        DocGia s=null;
        try{
            String sql=String.format("select *from DOCGIA Where MADG='%d'",maDG);
            SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            ResultSet rs = provider.executeQuery(sql);
            if(rs.next()){
                s=new DocGia();
                s.setMaDG(rs.getString("MADG"));
                s.setTenDG(rs.getString("TENDG"));
                s.setSdt(rs.getString("SDT"));
                s.setDiaChi(rs.getString("DIACHI"));
                s.setSlmuon(rs.getInt("SLMUON"));
            }
            provider.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return s;
    }
    
    public static ArrayList<DocGia> layTTMTDG(int ma){

        ArrayList<DocGia> dsDG=new ArrayList<DocGia>();
        try{
            SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            CallableStatement command = provider.getConn().prepareCall("{call ThongTin_MT (?)}");
            command.setInt(1,ma);
            ResultSet rs=command.executeQuery();
            while(rs.next()){
                DocGia dg=new DocGia();
                dg.setMaDG(rs.getString("MAMT"));
                dg.setTenDG(rs.getString("TENSH"));
                dg.setSdt(rs.getString("NGMUON"));
                dg.setDiaChi(rs.getString("NGTRA"));     
                dsDG.add(dg);
            }
            provider.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dsDG;
        
    }
    
}
