/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.Controllers;

import app.Views.Admin;
import app.Views.Login;
import app.Views.User;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class ChangePassword extends javax.swing.JFrame {

    

    
    private Login parent;

    public ChangePassword() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tieude = new javax.swing.JLabel();
        matkhaucu = new javax.swing.JLabel();
        matkhaumoi = new javax.swing.JLabel();
        nhaplaimatkhaumoi = new javax.swing.JLabel();
        dongy = new javax.swing.JButton();
        thoat = new javax.swing.JButton();
        jPasswordMatkhaucu = new javax.swing.JPasswordField();
        jPasswordMatkhaumoi = new javax.swing.JPasswordField();
        jPasswordnhaplaimk = new javax.swing.JPasswordField();
        keyIcon = new javax.swing.JLabel();
        ten = new javax.swing.JLabel();
        username = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đổi mật khẩu");

        tieude.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tieude.setForeground(new java.awt.Color(255, 0, 0));
        tieude.setText("THAY ĐỔI MẬT KHẨU");

        matkhaucu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        matkhaucu.setForeground(new java.awt.Color(0, 51, 255));
        matkhaucu.setText("Mật khẩu cũ");

        matkhaumoi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        matkhaumoi.setForeground(new java.awt.Color(0, 0, 255));
        matkhaumoi.setText("Mật khẩu mới");

        nhaplaimatkhaumoi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nhaplaimatkhaumoi.setForeground(new java.awt.Color(0, 0, 255));
        nhaplaimatkhaumoi.setText("Nhập lại mật khẩu mới");

        dongy.setBackground(new java.awt.Color(255, 204, 255));
        dongy.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dongy.setForeground(new java.awt.Color(255, 0, 0));
        dongy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Ok-icon.png"))); // NOI18N
        dongy.setText("Đồng ý");
        dongy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dongyActionPerformed(evt);
            }
        });

        thoat.setBackground(new java.awt.Color(255, 204, 255));
        thoat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        thoat.setForeground(new java.awt.Color(255, 0, 0));
        thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Action-remove-icon.png"))); // NOI18N
        thoat.setText("Thoát");
        thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatActionPerformed(evt);
            }
        });

        keyIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/key-icon (1).png"))); // NOI18N

        ten.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ten.setForeground(new java.awt.Color(0, 0, 255));
        ten.setText("Tên đăng nhập");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(keyIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tieude, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPasswordnhaplaimk, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(matkhaumoi)
                            .addComponent(matkhaucu)
                            .addComponent(ten))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordMatkhaucu, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(jPasswordMatkhaumoi)
                            .addComponent(username))))
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nhaplaimatkhaumoi)
                    .addComponent(dongy))
                .addGap(29, 29, 29)
                .addComponent(thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tieude, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(keyIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordMatkhaucu, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matkhaucu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordMatkhaumoi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matkhaumoi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordnhaplaimk, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nhaplaimatkhaumoi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dongy)
                    .addComponent(thoat))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection conn = null;
    
     public String getMD5(String md5) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] array = md.digest(md5.getBytes());

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF | 0x100))).substring(1, 3);
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    //action Đồng ý
    private void dongyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dongyActionPerformed
        // Nhắc nhở người dùng không bỏ trống ô nào
        if (username.getText().isEmpty() || jPasswordMatkhaucu.getText().isEmpty() || jPasswordMatkhaumoi.getText().isEmpty() || jPasswordnhaplaimk.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Bạn cần điền đầy đủ thông tin!");
            return;
        }
        
        try {
            
            String sql = "select * from account where username=? and password=?";
            // tạo đối tượng thực thi câu lệnh select
            ps = conn.prepareStatement(sql);
            ps.setString(1, username.getText());
            ps.setString(2, jPasswordMatkhaucu.getText());
            System.out.println(ps);
            rs = ps.executeQuery();
            
            if (rs.next()) { // nếu  user và pass tồn tại trong database thì
                // Thay doi mat khau
                System.out.println(jPasswordMatkhaumoi.getText());
                System.out.println(jPasswordnhaplaimk.getText());
                if (!jPasswordMatkhaumoi.getText().equals(jPasswordnhaplaimk.getText())){ // kiem tra khong khop
                    JOptionPane.showMessageDialog(null,  "Mật khẩu không khớp");
                    return;
                }
                // nếu khớp thì
                String sql1 = "update account set password=? where username=?";
                ps = conn.prepareStatement(sql1);
                ps.setString(1, jPasswordMatkhaumoi.getText());
                ps.setString(2, username.getText());
                System.out.println(ps);
                ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null,  "Đổi mật khẩu thành công");
            } else { //nếu  user và pass không tồn tại trong db thì
                JOptionPane.showMessageDialog(null, "Username or password not match!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_dongyActionPerformed
    // Action Thoát
    private void thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoatActionPerformed
        // TODO add your handling code here:
                ChangePassword.this.dispose();
    }//GEN-LAST:event_thoatActionPerformed

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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }
    
    public void doShow(Login parent) {
        this.parent = parent;
        Ketnoi();
        setVisible(true);
    }
    
    public void Ketnoi() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/qltl", "root", "");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dongy;
    private javax.swing.JPasswordField jPasswordMatkhaucu;
    private javax.swing.JPasswordField jPasswordMatkhaumoi;
    private javax.swing.JPasswordField jPasswordnhaplaimk;
    private javax.swing.JLabel keyIcon;
    private javax.swing.JLabel matkhaucu;
    private javax.swing.JLabel matkhaumoi;
    private javax.swing.JLabel nhaplaimatkhaumoi;
    private javax.swing.JLabel ten;
    private javax.swing.JButton thoat;
    private javax.swing.JLabel tieude;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
