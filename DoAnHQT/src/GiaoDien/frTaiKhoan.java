/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

import dao.QuanLiDAO;
import javax.swing.JOptionPane;
import pojo.QuanLi;

/**
 *
 * @author Admin
 */
public class frTaiKhoan extends javax.swing.JDialog {
    QuanLi a;
    /**
     * Creates new form frTaiKhoan
     */
    public frTaiKhoan(java.awt.Frame parent, boolean modal,String s) {
        super(parent, modal);
        initComponents();
         this.setSize(500, 400);
          this.setLocation(0, 55);
        this.jLabel4.setVisible(false);
        this.jLabel5.setVisible(false);
        this.jLabel6.setVisible(false);
        this.txtMKMoi.setVisible(false);
        this.txtMatKhauXacNhan.setVisible(false);
        this.txtMKCu.setVisible(false);
        this.btnXacNhan.setVisible(false);
        lb_Ma.setText(s);
        lb_k1.setVisible(false);
        lb_k2.setVisible(false);
        lb_k3.setVisible(false);
        lb_k4.setVisible(false);
        hienthi();
    }
    public frTaiKhoan(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMatKhauXacNhan = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        txtMKMoi = new javax.swing.JPasswordField();
        lbDoi = new javax.swing.JLabel();
        btnSua = new javax.swing.JButton();
        txtMKCu = new javax.swing.JPasswordField();
        btnXacNhan = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        lb_Ma = new javax.swing.JLabel();
        lb_k2 = new javax.swing.JLabel();
        lb_k3 = new javax.swing.JLabel();
        lb_k1 = new javax.swing.JLabel();
        lb_k4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Thông tin");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(181, 21, 54, 25);

        jLabel2.setText("Mã:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 50, 22, 16);

        jLabel3.setText("Tên:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 80, 27, 16);
        getContentPane().add(txtTen);
        txtTen.setBounds(120, 72, 200, 30);

        jLabel4.setText("Mật khẩu cũ:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 230, 74, 16);

        jLabel5.setText("Mật Khẩu:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 260, 58, 16);
        getContentPane().add(txtMatKhauXacNhan);
        txtMatKhauXacNhan.setBounds(140, 290, 186, 22);

        jLabel6.setText("Nhập lại mật khẩu:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 290, 108, 16);
        getContentPane().add(txtMKMoi);
        txtMKMoi.setBounds(140, 250, 186, 22);

        lbDoi.setText("Đổi mật khẩu!");
        lbDoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDoiMouseClicked(evt);
            }
        });
        getContentPane().add(lbDoi);
        lbDoi.setBounds(320, 180, 80, 16);

        btnSua.setText("Cập nhật");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSua);
        btnSua.setBounds(175, 170, 90, 25);
        getContentPane().add(txtMKCu);
        txtMKCu.setBounds(140, 220, 186, 22);

        btnXacNhan.setText("Xác nhận");
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });
        getContentPane().add(btnXacNhan);
        btnXacNhan.setBounds(180, 330, 85, 25);

        jLabel7.setText("Số Điện Thoại:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 110, 90, 16);

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
        getContentPane().add(txtSDT);
        txtSDT.setBounds(120, 110, 190, 22);

        jLabel8.setText("Địa chỉ:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 140, 70, 16);
        getContentPane().add(txtDiaChi);
        txtDiaChi.setBounds(120, 140, 200, 22);
        getContentPane().add(lb_Ma);
        lb_Ma.setBounds(120, 50, 60, 20);

        lb_k2.setForeground(new java.awt.Color(255, 0, 0));
        lb_k2.setText("(*)");
        getContentPane().add(lb_k2);
        lb_k2.setBounds(350, 260, 18, 16);

        lb_k3.setForeground(new java.awt.Color(255, 51, 51));
        lb_k3.setText("(*)");
        getContentPane().add(lb_k3);
        lb_k3.setBounds(350, 290, 18, 20);

        lb_k1.setForeground(new java.awt.Color(255, 51, 51));
        lb_k1.setText("(*)");
        getContentPane().add(lb_k1);
        lb_k1.setBounds(350, 220, 18, 16);

        lb_k4.setForeground(new java.awt.Color(255, 51, 51));
        lb_k4.setText("(*):Bắt buộc");
        getContentPane().add(lb_k4);
        lb_k4.setBounds(330, 360, 90, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbDoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDoiMouseClicked
        // TODO add your handling code here:
        
        this.jLabel4.setVisible(true);
        this.jLabel5.setVisible(true);
        this.jLabel6.setVisible(true);
        this.txtMKMoi.setVisible(true);
        this.txtMatKhauXacNhan.setVisible(true);
        this.txtMKCu.setVisible(true);
        this.lbDoi.setVisible(false);
        this.btnXacNhan.setVisible(true);
        this.lbDoi.setVisible(false);
        this.setSize(500, 600);
        lb_k1.setVisible(false);
        lb_k2.setVisible(false);
        lb_k3.setVisible(false);
        lb_k4.setVisible(false);
    }//GEN-LAST:event_lbDoiMouseClicked

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        // TODO add your handling code here:
        this.jLabel4.setVisible(false);
        this.jLabel5.setVisible(false);
        this.jLabel6.setVisible(false);
        this.txtMKMoi.setVisible(false);
        this.txtMatKhauXacNhan.setVisible(false);
        this.txtMKCu.setVisible(false);
        this.lbDoi.setVisible(true);
        this.btnXacNhan.setVisible(false);
        this.setSize(500, 400);
        QuanLi a=QuanLiDAO.layQL(Integer.parseInt(lb_Ma.getText()));
        if(txtMKMoi.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu mới");
            txtMKMoi.requestFocus();
        }
        else if(txtMKCu.getText().equals(a.getMatKhau())==false){
            JOptionPane.showMessageDialog(this, "Mật khẩu cũ Không Chính Xác");
            txtMKCu.setText("");
            txtMKMoi.setText("");
            txtMatKhauXacNhan.setText("");
        }
        else if(txtMKMoi.getText().equals(txtMatKhauXacNhan.getText())==false){
            JOptionPane.showMessageDialog(this, "Mật khẩu mới không trùng khớp");
            txtMKCu.setText("");
            txtMKMoi.setText("");
            txtMatKhauXacNhan.setText("");
        }
        else{
            QuanLi b=new QuanLi(a.getMaQL(), a.getTenQL(), a.getTaiKhoan(), txtMKMoi.getText(), a.getSdt(), a.getDiachi());
            QuanLiDAO.capNhatQL(b);
            JOptionPane.showMessageDialog(this, "Thay đổi mật khẩu thành công");
            lb_k1.setVisible(false);
            lb_k2.setVisible(false);
            lb_k3.setVisible(false);
            lb_k4.setVisible(false);
        }
    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if(txtDiaChi.getText().equals("")||txtSDT.getText().equals("")||txtTen.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin bắt buộc");
        }
        else {
            try{
                
             double a=Double.parseDouble(txtSDT.getText());
             QuanLi b=new QuanLi(lb_Ma.getText(), txtTen.getText(), txtSDT.getText(), txtDiaChi.getText());
            int tl=JOptionPane.showConfirmDialog(this,"bạn muốn cập nhật thông tin", "thông báo", JOptionPane.YES_NO_OPTION);
            if(tl==JOptionPane.YES_OPTION){
                QuanLiDAO.capNhatQLThongThuong(b);
            }
            else{
                return;
        }
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(this, "Vui lòng nhập sdt hợp lệ");
                txtSDT.requestFocus();
                
            }
        }
        
    
    }//GEN-LAST:event_btnSuaActionPerformed

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtSDTActionPerformed

    private void txtSDTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSDTFocusLost
        // TODO add your handling code here:
        if(txtSDT.getText().equals("")!=true){
            try{
                
             double a=Double.parseDouble(txtSDT.getText());
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(this, "Vui lòng nhập sdt hợp lệ");
                txtSDT.requestFocus();
                
            }
        }
    }//GEN-LAST:event_txtSDTFocusLost

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
            java.util.logging.Logger.getLogger(frTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frTaiKhoan dialog = new frTaiKhoan(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbDoi;
    private javax.swing.JLabel lb_Ma;
    private javax.swing.JLabel lb_k1;
    private javax.swing.JLabel lb_k2;
    private javax.swing.JLabel lb_k3;
    private javax.swing.JLabel lb_k4;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JPasswordField txtMKCu;
    private javax.swing.JPasswordField txtMKMoi;
    private javax.swing.JPasswordField txtMatKhauXacNhan;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables

    private void hienthi() {
        a=QuanLiDAO.layQL(Integer.parseInt(lb_Ma.getText()));
        txtDiaChi.setText(a.getDiachi());
        txtSDT.setText(a.getSdt());
        txtTen.setText(a.getTenQL());
        
    }
}
