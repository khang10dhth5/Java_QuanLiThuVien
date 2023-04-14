/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dataprovider.SQLServerProvider;
import java.sql.ResultSet;
import java.util.ArrayList;
import pojo.NXB;
import pojo.TacGia;

/**
 *
 * @author Admin
 */
public class NXBDAO {
    public static ArrayList<NXB> layDanhSachNXB(){
        ArrayList<NXB> dsNXB=new ArrayList<NXB>();
        try{
            String sql="select*from NXB";
            SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            ResultSet rs=provider.executeQuery(sql);
            while(rs.next()){
                NXB nxb=new NXB();
                nxb.setMaNXB(rs.getString("MANXB"));
                nxb.setTenNXB(rs.getString("TENNXB"));
                nxb.setDiaChi(rs.getString("DIACHI"));
                nxb.setSDT(rs.getString("SDT"));
                dsNXB.add(nxb);
            }
            provider.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dsNXB;
        
    }
  
    public static boolean themNXB(NXB nxb){
        boolean kq=false;
        String sql=String.format("Insert into NXB values(N'%s',N'%s','%s')"
                , nxb.getTenNXB(),nxb.getDiaChi(),nxb.getSDT());
        SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            
            int n=provider.executeUpdate(sql);
            if(n==1){
                kq=true;
            }
            provider.close();
        return kq;
        
        
    }
    public static boolean xoaNXB(int maNXB){
        boolean kq=false;
        String sql=String.format("Delete from NXB where MANXB='%d'", maNXB);
        SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            int n=provider.executeUpdate(sql);
            if(n==1){
                kq=true;
            }
            provider.close();
        return kq;
        
    }
    public static boolean  capNhatNXB(NXB nxb) {
        boolean kq=false;
        String sql=String.format("UPDATE NXB set TENNXB=N'%s', DIACHI=N'%s', SDT='%s'"
                +"where MANXB='%d'", nxb.getTenNXB(),nxb.getDiaChi(),nxb.getSDT() ,Integer.parseInt( nxb.getMaNXB()));
        SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            int n=provider.executeUpdate(sql);
            if(n==1){
                kq=true;
            }
        provider.close();
        return kq;
        
    }
    public static NXB layNXB(int maNXB){
        NXB nxb=null;
        try{
            String sql="select *from NXB Where MANXB="+maNXB;
            SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            ResultSet rs = provider.executeQuery(sql);
            if(rs.next()){
                nxb=new NXB();
                nxb.setMaNXB(rs.getString("MANXB"));
                nxb.setTenNXB(rs.getString("TENNXB"));
                nxb.setDiaChi(rs.getString("DIACHI"));
                nxb.setSDT(rs.getString("SDT"));
             
            }
            provider.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return nxb;
    }
     public static ArrayList<NXB> timKiemNXBTheoTen(String tenNXB){
        ArrayList<NXB> dsTG=new ArrayList<NXB>();
        try{
            String sql="Select*from NXB where TENNXB LIKE N'%"+tenNXB+"%'";
            SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            ResultSet rs=provider.executeQuery(sql);
            while(rs.next()){
                NXB tg=new NXB();
                tg.setMaNXB(rs.getString("MANXB"));
                tg.setTenNXB(rs.getString("TENNXB"));
                tg.setDiaChi(rs.getString("DIACHI"));
                tg.setSDT(rs.getString("SDT"));
                dsTG.add(tg);
            }
            provider.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dsTG;
        
    }
}
