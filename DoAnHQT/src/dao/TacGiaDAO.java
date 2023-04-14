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

/**
 *
 * @author Admin
 */
public class TacGiaDAO {
     public static ArrayList<TacGia> layDanhSachTacGia(){
        ArrayList<TacGia> dsTG=new ArrayList<TacGia>();
        try{
            String sql="Select*from TACGIA";
            SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            ResultSet rs=provider.executeQuery(sql);
            while(rs.next()){
                TacGia tg=new TacGia();
                tg.setMaTG(rs.getString("MATG"));
                tg.setTenTG(rs.getString("TENTG"));
                tg.setGhiChu(rs.getString("GHICHU"));
                dsTG.add(tg);
            }
            provider.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dsTG;
        
    }
    public static ArrayList<TacGia> timKiemTGTheoTen(String tenTG){
        ArrayList<TacGia> dsTG=new ArrayList<TacGia>();
        try{
            String sql="Select*from TACGIA where TENTG LIKE N'%"+tenTG+"%'";
            SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            ResultSet rs=provider.executeQuery(sql);
            while(rs.next()){
                TacGia tg=new TacGia();
                tg.setMaTG(rs.getString("MATG"));
                tg.setTenTG(rs.getString("TENTG"));
                tg.setGhiChu(rs.getString("GHICHU"));
                dsTG.add(tg);
            }
            provider.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dsTG;
        
    }
    public static boolean themTG(TacGia tg){
        boolean kq=false;
        String sql=String.format("Insert into TACGIA values(N'%s',N'%s')", tg.getTenTG(),tg.getGhiChu());
        SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            
            int n=provider.executeUpdate(sql);
            if(n==1){
                kq=true;
            }
            provider.close();
        return kq;
        
        
    }
    public static boolean xoaTG(int maTG){
        boolean kq=false;
        String sql=String.format("Delete from TACGIA where MaTG='%d'", maTG);
        SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            int n=provider.executeUpdate(sql);
            if(n==1){
                kq=true;
            }
            provider.close();
        return kq;
        
    }
    public static boolean  capNhatTG(TacGia tg) {
        boolean kq=false;
        String sql=String.format("UPDATE TACGIA set TENTG=N'%s', GHICHU=N'%s'"
                +"where MATG='%d'", tg.getTenTG(),tg.getGhiChu(),Integer.parseInt( tg.getMaTG()));
        SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            int n=provider.executeUpdate(sql);
            if(n==1){
                kq=true;
            }
        provider.close();
        return kq;
        
    }
    public static TacGia layTG(int maTG){
        TacGia tg=null;
        try{
            String sql="select *from TacGia Where MaTG="+maTG;
            SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            ResultSet rs = provider.executeQuery(sql);
            if(rs.next()){
                tg=new TacGia();
                tg.setMaTG(rs.getString("MATG"));
                tg.setTenTG(rs.getString("TENTG"));
                tg.setGhiChu(rs.getString("GHICHU"));
             
            }
            provider.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return tg;
    }
}
