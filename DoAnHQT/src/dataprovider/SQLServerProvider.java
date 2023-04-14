/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataprovider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class SQLServerProvider {
     String strServerName="LAPTOP-QJUFSIIG\\SA";
        String strDatabaseName="QUANLITV";
        String strUserName="sa";
        String strPassword="123";
        private Connection conn;
        public void open(){
             try {
        // dang ky driver
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         
         // thiet lap ke noi
          String connectionURL="jdbc:sqlserver://"+strServerName+":1433;databaseName="+strDatabaseName
                    +";user="+strUserName+";password="+strPassword;
         conn = DriverManager.getConnection(connectionURL);
         if(getConn()==null){
            
                System.out.println("loi");
            }

        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        } 
    public void close(){
        try{
            this.getConn().close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public ResultSet executeQuery(String sql){
         ResultSet rs=null;
         try {
             java.sql.Statement st=getConn().createStatement();
             rs=st.executeQuery(sql);
         }
         catch(Exception ex){
             ex.printStackTrace();
         }
       return rs;
    }
    public int executeUpdate(String sql){
        int n=-1;
        try {
             java.sql.Statement st=getConn().createStatement();
             n=st.executeUpdate(sql);
         }
         catch(Exception ex){
             ex.printStackTrace();
         }
       return n;
    }

    /**
     * @return the conn
     */
    public Connection getConn() {
        return conn;
    }
        
}
