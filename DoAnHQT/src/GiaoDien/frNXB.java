/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

import dao.NXBDAO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pojo.NXB;

/**
 *
 * @author Admin
 */
public class frNXB extends javax.swing.JDialog {

    /**
     * Creates new form frNXB
     */
    public frNXB(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         this.setLocation(450, 300);
         btnLuu.setVisible(false);
        btnHuy.setVisible(false);
        hienthi();
        lb_k1.setVisible(false);
        lb_k2.setVisible(false);
        lb_k3.setVisible(false);
        lb_k4.setVisible(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnTimKiem = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lb_ma = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        btnCapNhat = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        lb_k1 = new javax.swing.JLabel();
        lb_k2 = new javax.swing.JLabel();
        lb_k3 = new javax.swing.JLabel();
        lb_k4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_TimKiem.png"))); // NOI18N
        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jLabel1.setText("DANH SÁCH NXB");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã", "Tên"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(txtTimKiem)
                .addGap(18, 18, 18)
                .addComponent(btnTimKiem)
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnThem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXoa)
                .addGap(80, 80, 80))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTimKiem)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(null);

        jLabel2.setText("THÔNG TIN CHI TIẾT");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(214, 15, 120, 16);

        jLabel3.setText("Mã:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(55, 57, 22, 16);
        jPanel2.add(lb_ma);
        lb_ma.setBounds(125, 57, 55, 16);

        jLabel5.setText("Tên:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(50, 94, 27, 16);

        jLabel6.setText("Địa chỉ:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(50, 134, 44, 16);

        jLabel7.setText("SDT:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(50, 174, 29, 16);
        jPanel2.add(txtTen);
        txtTen.setBounds(125, 91, 268, 22);
        jPanel2.add(txtDiaChi);
        txtDiaChi.setBounds(125, 131, 268, 22);

        txtSDT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSDTFocusLost(evt);
            }
        });
        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });
        jPanel2.add(txtSDT);
        txtSDT.setBounds(125, 171, 268, 22);

        btnCapNhat.setText("Cập Nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });
        jPanel2.add(btnCapNhat);
        btnCapNhat.setBounds(201, 238, 85, 25);

        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        jPanel2.add(btnLuu);
        btnLuu.setBounds(108, 238, 53, 25);

        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        jPanel2.add(btnHuy);
        btnHuy.setBounds(317, 238, 53, 25);

        lb_k1.setForeground(new java.awt.Color(255, 0, 0));
        lb_k1.setText("(*)");
        jPanel2.add(lb_k1);
        lb_k1.setBounds(398, 94, 18, 16);

        lb_k2.setForeground(new java.awt.Color(255, 51, 51));
        lb_k2.setText("(*)");
        jPanel2.add(lb_k2);
        lb_k2.setBounds(398, 134, 18, 16);

        lb_k3.setForeground(new java.awt.Color(255, 51, 51));
        lb_k3.setText("(*)");
        jPanel2.add(lb_k3);
        lb_k3.setBounds(398, 174, 18, 16);

        lb_k4.setForeground(new java.awt.Color(255, 51, 0));
        lb_k4.setText("(*):Bắt buộc");
        jPanel2.add(lb_k4);
        lb_k4.setBounds(133, 300, 72, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
         ArrayList<NXB> dsSach=NXBDAO.timKiemNXBTheoTen(txtTimKiem.getText());
        DefaultTableModel atm=(DefaultTableModel)jTable1.getModel();
        atm.setRowCount(0);
        for(NXB db:dsSach){
            Vector<Object> vec=new Vector<Object>();
            vec.add(db.getMaNXB());
            vec.add(db.getTenNXB());
            
            atm.addRow(vec);
            
        }
        jTable1.setModel(atm);
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row=jTable1.getSelectedRow();
        String ma= (String)jTable1.getValueAt(row, 0);
        NXB a=NXBDAO.layNXB(Integer.parseInt(ma));
        lb_ma.setText(a.getMaNXB());
        txtTen.setText(a.getTenNXB());
        txtDiaChi.setText(a.getDiaChi());
        txtSDT.setText(a.getSDT());
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
         lb_ma.setText("");
        txtTen.setText("");
        txtDiaChi.setText("");
        txtSDT.setText("");
        btnLuu.setVisible(true);
       btnHuy.setVisible(true);
       btnCapNhat.setVisible(false);
       btnXoa.setVisible(false);
       lb_k1.setVisible(true);
        lb_k2.setVisible(true);
        lb_k3.setVisible(true);
        lb_k4.setVisible(true);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        if(jTable1.getSelectedRowCount()<1){
            JOptionPane.showMessageDialog(this,"hãy chọn NXB muốn xóa!");
        }
        else {
            int row=jTable1.getSelectedRow();
            String ma= (String)jTable1.getValueAt(row, 0);

                  int tl=JOptionPane.showConfirmDialog(null,"bạn muốn xóa phải không","thông báo",JOptionPane.YES_NO_OPTION);
                    if(tl==JOptionPane.YES_OPTION){
                        NXBDAO.xoaNXB(Integer.parseInt(ma));
                        hienthi();
                        txtDiaChi.setText("");
                        txtSDT.setText("");
                        txtTen.setText("");
                    }
                    else{

                        return;

                    }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        if(txtDiaChi.getText().equals("")||txtSDT.getText().equals("")||txtTen.getText().equals("")){
          JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin bắt buộc");
        }
        else {
            try{
                 Double a=Double.parseDouble(txtSDT.getText());
                    txtSDTActionPerformed(evt);
                    NXB dg=new NXB(txtTen.getText(),txtDiaChi.getText(),txtSDT.getText());      
                    NXBDAO.themNXB(dg);

                    lb_ma.setText("");
                    txtTen.setText("");
                    txtDiaChi.setText(""); 
                    txtSDT.setText(""); 
                    btnLuu.setVisible(false);
                    btnHuy.setVisible(false);
                    btnCapNhat.setVisible(true);
                    btnXoa.setVisible(true);
                    lb_k1.setVisible(false);
                    lb_k2.setVisible(false);
                    lb_k3.setVisible(false);
                    lb_k4.setVisible(false);
                    hienthi();
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(this,"Vui lòng nhập sdt hợp lệ");
                txtSDT.requestFocus();
            }
           
        }
        
        
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
        if(txtDiaChi.getText().equals("")||txtSDT.getText().equals("")||txtTen.getText().equals("")){
          JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin bắt buộc");
          
        }
        else{
            try{
                 Double a=Double.parseDouble(txtSDT.getText());
                 NXB dg=new NXB(lb_ma.getText(),txtTen.getText(),txtDiaChi.getText(),txtSDT.getText());
                int tl=JOptionPane.showConfirmDialog(this, "bn có muốn cập nhật nxb có mã "+lb_ma.getText(), "thông báo", JOptionPane.YES_NO_OPTION);
                if(tl==JOptionPane.YES_OPTION){
                NXBDAO.capNhatNXB(dg);
                hienthi(); 
        }
        else return;
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(this,"Vui lòng nhập sdt hợp lệ");
                txtSDT.requestFocus();
            }
        }
       
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
         btnCapNhat.setVisible(true);
        btnXoa.setVisible(true);
        btnHuy.setVisible(false);
        btnLuu.setVisible(false);
        txtTen.setText("");
        txtDiaChi.setText("");
        txtSDT.setText("");
        lb_ma.setText("");
        lb_k1.setVisible(false);
        lb_k2.setVisible(false);
        lb_k3.setVisible(false);
        lb_k4.setVisible(false);
    }//GEN-LAST:event_btnHuyActionPerformed

    private void txtSDTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSDTFocusLost
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtSDTFocusLost

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_txtSDTActionPerformed

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
            java.util.logging.Logger.getLogger(frNXB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frNXB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frNXB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frNXB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frNXB dialog = new frNXB(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lb_k1;
    private javax.swing.JLabel lb_k2;
    private javax.swing.JLabel lb_k3;
    private javax.swing.JLabel lb_k4;
    private javax.swing.JLabel lb_ma;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    private void hienthi() {
        ArrayList<NXB> dsTG=NXBDAO.layDanhSachNXB();
        DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
        dtm.setRowCount(0);
        for(NXB db:dsTG){
            Vector<Object> vec=new Vector<Object>();
            vec.add(db.getMaNXB());
            vec.add(db.getTenNXB());
            dtm.addRow(vec);
            
        }
        jTable1.setModel(dtm);
    }
}
