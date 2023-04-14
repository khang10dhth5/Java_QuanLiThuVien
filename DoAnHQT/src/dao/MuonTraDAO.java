/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dataprovider.SQLServerProvider;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import pojo.DocGia;
import pojo.MuonTra;

/**
 *
 * @author Admin
 */
public class MuonTraDAO {
    public static ArrayList<MuonTra> layDanhSachMuonTra(){
            ArrayList<MuonTra> dsMT=new ArrayList<MuonTra>();
        try{
            String sql="Select*from MUONTRA";
            SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            ResultSet rs=provider.executeQuery(sql);
            while(rs.next()){
                MuonTra mt=new MuonTra();
                mt.setMaMT(rs.getString("MAMT"));
                mt.setMaDG(rs.getString("MADG"));
                mt.setMaQL(rs.getString("MAQL"));
                mt.setNgayMuon(rs.getString("NGMUON"));     
                mt.setNgayTra(rs.getString("NGTRA"));   
                dsMT.add(mt);
            }
            provider.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dsMT;
        
    }
    
    public static boolean themMT(MuonTra mt){
        boolean kq=false;
        String sql=String.format(" Insert into MUONTRA(MADG,MAQL,NGMUON) values('%d','%d','%s')"
               ,Integer.parseInt(mt.getMaDG()),Integer.parseInt(mt.getMaQL()),mt.getNgayMuon());
        SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            
            int n=provider.executeUpdate(sql);
            if(n==1){
                kq=true;
            }
            provider.close();
        return kq;
        
        
    }
    public static boolean themMTCoNgayTra(MuonTra mt){
        boolean kq=false;
        String sql=String.format("Insert into MUONTRA values('%d','%d','%s','%s')"
               ,Integer.parseInt(mt.getMaDG()),Integer.parseInt(mt.getMaQL()),mt.getNgayMuon(),mt.getNgayTra());
        SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            
            int n=provider.executeUpdate(sql);
            if(n==1){
                kq=true;
            }
            provider.close();
        return kq;
        
        
    }
    public static boolean themMTKoNgayMuon(MuonTra mt){
        boolean kq=false;
        
        String sql=String.format("Insert into MUONTRA(MADG,MAQL) values('%d','%d')"
               ,Integer.parseInt(mt.getMaDG()),Integer.parseInt(mt.getMaQL()));
        SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            
            int n=provider.executeUpdate(sql);
            if(n==1){
                kq=true;
            }
            provider.close();
        return kq;
        
        
    }
    public static boolean xoaMT(int maMT){
        boolean kq=false;
        String sql=String.format("Delete from MUONTRA where MAMT='%d'", maMT);
        SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            int n=provider.executeUpdate(sql);
            if(n==1){
                kq=true;
            }
            provider.close();
        return kq;
        
    }
    public static boolean  capNhatMT(MuonTra mt) {
        boolean kq=false;
        String sql=String.format("UPDATE MUONTRA set MADG='%d', MAQL='%d', NGMUON='%s'"
                +"where MAMT='%d'",Integer.parseInt( mt.getMaDG()),Integer.parseInt(mt.getMaQL()),mt.getNgayMuon(),Integer.parseInt(mt.getMaMT()));
        SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            int n=provider.executeUpdate(sql);
            if(n==1){
                kq=true;
            }
        provider.close();
        return kq;
        
    }
    public static boolean  capNhatMTCoNgayTra(MuonTra mt) {
        boolean kq=false;
        String sql=String.format("UPDATE MUONTRA set MADG='%d', MAQL='%d', NGMUON='%s',NGTRA='%s'"
                +"where MAMT='%d'",Integer.parseInt( mt.getMaDG()),Integer.parseInt(mt.getMaQL()),mt.getNgayMuon(),mt.getNgayTra(),Integer.parseInt(mt.getMaMT()));
        SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            int n=provider.executeUpdate(sql);
            if(n==1){
                kq=true;
            }
        provider.close();
        return kq;
        
    }
     public static MuonTra layMT(int maMT){
        MuonTra nxb=null;
        try{
            String sql="select *from MUONTRA Where MAMT="+maMT;
            SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            ResultSet rs = provider.executeQuery(sql);
            if(rs.next()){
                nxb=new MuonTra();
                nxb.setMaMT(rs.getString("MAMT"));
                nxb.setMaDG(rs.getString("MADG"));
                nxb.setMaQL(rs.getString("MAQL"));
                nxb.setNgayMuon(rs.getString("NGMUON"));
             nxb.setNgayTra(rs.getString("NGTRA"));
            }
            provider.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return nxb;
    }
     public static ArrayList<MuonTra> ThongKeMuonTra(){
            ArrayList<MuonTra> dsMT=new ArrayList<MuonTra>();
        try{
             SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            CallableStatement command = provider.getConn().prepareCall("{call TongSach()}");
       
            ResultSet rs=command.executeQuery();
            while(rs.next()){
                MuonTra dg=new MuonTra();
                dg.setMaMT(rs.getString("MAMT"));
                dg.setMaDG(rs.getString("TENDG"));
                dg.setMaQL(rs.getString("SOSACH"));
                dg.setNgayMuon(rs.getString("NGTRA"));
                dsMT.add(dg);
            }
            provider.close();
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dsMT;
     }  
}
