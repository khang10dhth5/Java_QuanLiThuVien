/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dataprovider.SQLServerProvider;
import java.sql.ResultSet;
import java.util.ArrayList;
import pojo.ChiTietMT;
import pojo.DocGia;
import pojo.Sach;

/**
 *
 * @author Admin
 */
public class ChiTietMTDAO {
    public static ArrayList<ChiTietMT> layDanhSachChiTietMT(){
            ArrayList<ChiTietMT> dsCTMT=new ArrayList<ChiTietMT>();
        try{
            String sql="Select*from CTMUONTRA";
            SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            ResultSet rs=provider.executeQuery(sql);
            while(rs.next()){
                ChiTietMT ct=new ChiTietMT();
                ct.setMaMT(rs.getString("MAMT"));
                ct.setMaSH(rs.getString("MASH"));
            
                ct.setTienPhat(rs.getInt("TIENPHAT"));     
                ct.setGhiChu(rs.getString("GHICHUPHAT"));
                dsCTMT.add(ct);
            }
            provider.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dsCTMT;
        
    }
    
        public static boolean themCTMT(ChiTietMT ct){
        boolean kq=false;
        String sql=String.format("Insert into CTMUONTRA values('%d','%d','%d',N'%s')",
                Integer.parseInt( ct.getMaMT()),Integer.parseInt( ct.getMaSH()),ct.getTienPhat(),ct.getGhiChu());
        SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            
            int n=provider.executeUpdate(sql);
            if(n==1){
                kq=true;
            }
            provider.close();
        return kq;
        
        
    }
    public static boolean xoaCTMT(int maMT,int MaSH){
        boolean kq=false;
        String sql=String.format("Delete from CTMUONTRA where MAMT='%d' AND MASH='%d'" , maMT,MaSH);
        SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            int n=provider.executeUpdate(sql);
            if(n==1){
                kq=true;
            }
            provider.close();
        return kq;
        
    }
    public static boolean  capNhatCTMT(ChiTietMT ct) {
        boolean kq=false;
        String sql=String.format("UPDATE CTMUONTRA set TIENPHAT='%d',  GHICHUPHAT=N'%s'"
                +"where MAMT='%d'AND MASH='%d'",ct.getTienPhat(),ct.getGhiChu(),Integer.parseInt( ct.getMaMT())
                ,Integer.parseInt(ct.getMaSH()));
        SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            int n=provider.executeUpdate(sql);
            if(n==1){
                kq=true;
            }
        provider.close();
        return kq;
        
    }
    public static ArrayList<ChiTietMT> ChiTietMTMa(int MaMT){
        ArrayList<ChiTietMT> dsmt=new ArrayList<ChiTietMT>();
        try{
            String sql=String.format("Select*from CTMUONTRA where MAMT= '%d'",MaMT);
            SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            ResultSet rs=provider.executeQuery(sql);
            while(rs.next()){
                ChiTietMT ct=new ChiTietMT();
                ct.setMaMT(rs.getString("MAMT"));
                ct.setMaSH(rs.getString("MASH"));
         
                ct.setTienPhat(rs.getInt("TIENPHAT"));            
                ct.setGhiChu(rs.getString("GHICHUPHAT"));
                dsmt.add(ct);
            }
            provider.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dsmt;
        
    }
     public static ChiTietMT layCTMT(int maMT,int maSH){
       ChiTietMT nxb=null;
        try{
            String sql=String.format("select *from CTMUONTRA Where MAMT='%d' and MASH='%d'",maMT,maSH);
            SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            ResultSet rs = provider.executeQuery(sql);
            if(rs.next()){
                nxb=new ChiTietMT();
                nxb.setMaMT(rs.getString("MAMT"));
                nxb.setMaSH(rs.getString("MASH"));
                nxb.setTienPhat(rs.getInt("TIENPHAT"));
                nxb.setGhiChu(rs.getString("GHICHUPHAT"));
          
            }
            provider.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return nxb;
    }
     public static boolean ktTrung(int maMT,int maSH){
       boolean kq=false;
        try{
            String sql=String.format("select *from CTMUONTRA Where MAMT='%d' and MASH='%d'",maMT,maSH);
            SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            ResultSet rs = provider.executeQuery(sql);
            if(rs.next()){
               kq=true;
               return kq;
          
            }
            provider.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return kq;
    }
     public static boolean ktChiTietMTTheoMaMT(int maMT){
         boolean kq=false;
            ArrayList<ChiTietMT> dsCTMT=new ArrayList<ChiTietMT>();
        try{
            String sql=String.format("Select*from CTMUONTRA where MAMT='%s'",maMT);
            SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            ResultSet rs=provider.executeQuery(sql);
            while(rs.next()){
                kq=true;
                return kq;
            }
            provider.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return kq;
        
    }
}
