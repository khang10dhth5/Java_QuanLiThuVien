/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

import dao.MuonTraDAO;
import dataprovider.SQLServerProvider;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import pojo.MuonTra;

/**
 *
 * @author Admin
 */
public class frThongKe extends javax.swing.JDialog {
CallableStatement cs;
    Statement st;
    private SQLServerProvider con;
    /**
     * Creates new form frThongKe
     */
    public frThongKe(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
       this.setLocation(450, 250);
       this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(1000, 700);
        hienthi();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lb_TongDG = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lb_SoLuongSach = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lb_SachMuon = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lb_SachTrongKho = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lb_PhieuMuon = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lb_DangMuon = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lb_DaTra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("THỐNG KÊ MƯỢN TRẢ SÁCH");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(340, 13, 170, 16);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Phiếu Mượn", "Tên Độc Giả", "Số sách", "Ngày trả"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 50, 870, 170);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(null);

        jLabel3.setText("Tổng độc giả:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 50, 80, 30);

        lb_TongDG.setText("0");
        jPanel1.add(lb_TongDG);
        lb_TongDG.setBounds(150, 60, 50, 20);

        jLabel5.setText("Số loại sách:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 140, 100, 16);

        lb_SoLuongSach.setText("0");
        jPanel1.add(lb_SoLuongSach);
        lb_SoLuongSach.setBounds(150, 140, 40, 20);

        jLabel7.setText("Số Sách đang mượn:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 220, 130, 16);

        lb_SachMuon.setText("0");
        jPanel1.add(lb_SachMuon);
        lb_SachMuon.setBounds(150, 220, 50, 20);

        jLabel9.setText("Số sách trong kho:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 290, 120, 16);

        lb_SachTrongKho.setText("0");
        jPanel1.add(lb_SachTrongKho);
        lb_SachTrongKho.setBounds(150, 290, 40, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 270, 440, 330);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(null);

        jLabel2.setText("Tổng Số Phiếu Mượn:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(50, 40, 130, 16);

        lb_PhieuMuon.setText("0");
        jPanel2.add(lb_PhieuMuon);
        lb_PhieuMuon.setBounds(210, 40, 40, 16);

        jLabel6.setText("Đang mượn:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(50, 120, 90, 16);

        lb_DangMuon.setText("0");
        jPanel2.add(lb_DangMuon);
        lb_DangMuon.setBounds(210, 120, 41, 16);

        jLabel10.setText("Đã Trả:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(50, 210, 45, 16);

        lb_DaTra.setText("0");
        jPanel2.add(lb_DaTra);
        lb_DaTra.setBounds(210, 210, 60, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(490, 270, 380, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frThongKe dialog = new frThongKe(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lb_DaTra;
    private javax.swing.JLabel lb_DangMuon;
    private javax.swing.JLabel lb_PhieuMuon;
    private javax.swing.JLabel lb_SachMuon;
    private javax.swing.JLabel lb_SachTrongKho;
    private javax.swing.JLabel lb_SoLuongSach;
    private javax.swing.JLabel lb_TongDG;
    // End of variables declaration//GEN-END:variables

    private void hienthi() {
        ArrayList<MuonTra> dsDG=MuonTraDAO.ThongKeMuonTra();
        DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
        dtm.setRowCount(0);
        for(MuonTra db:dsDG){
            Vector<Object> vec=new Vector<Object>();
            vec.add(db.getMaMT());
            vec.add(db.getMaDG());
            vec.add(db.getMaQL());
            vec.add(db.getNgayMuon());
            dtm.addRow(vec);
            
        }
        jTable1.setModel(dtm);
        
        try {
           SQLServerProvider provider=new SQLServerProvider();
            provider.open();
            CallableStatement command = provider.getConn().prepareCall("{call  TONGTV()}");
          
            ResultSet rs=command.executeQuery();

            while(rs.next()){
                
            
            lb_TongDG.setText(rs.getInt(1) + "");
            lb_SoLuongSach.setText(String.valueOf(rs.getInt(2)));
            lb_SachMuon.setText(String.valueOf(rs.getInt(3)));
            lb_SachTrongKho.setText(String.valueOf(rs.getInt(4)));
            lb_PhieuMuon.setText(String.valueOf(rs.getInt(5)));
            lb_DangMuon.setText(String.valueOf(rs.getInt(6)));
           lb_DaTra.setText(String.valueOf(rs.getInt(7)));
            }

            con.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
    }
    
}
