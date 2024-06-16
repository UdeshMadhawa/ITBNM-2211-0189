/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.MerchantController;
import Model.DatabaseConnector;
import Model.MerchantModel;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Udesh Madawa
 */
public class RegisterAsMerchantView extends javax.swing.JFrame {

    /**
     * Creates new form RegisterAsMerchantView
     */
    
    DatabaseConnector dbConnector;
    
    public RegisterAsMerchantView() {
        initComponents();
          dbConnector = new DatabaseConnector();
         
  

        /**
         * make screen as not re-sizable
         *
         */
        this.setResizable(false);
        /**
         * Open screen middle of the screen
         *
         */
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        /**
         * getting countries
         */
        getCountryCodes();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mname = new javax.swing.JLabel();
        mtxt = new javax.swing.JTextField();
        mcname = new javax.swing.JLabel();
        mcombo = new javax.swing.JComboBox<>();
        muname = new javax.swing.JLabel();
        mutxt = new javax.swing.JTextField();
        mpassword = new javax.swing.JLabel();
        mpfield = new javax.swing.JPasswordField();
        mregister = new javax.swing.JButton();
        mbackbutton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register As Merchant");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mname.setText("Full Name");
        getContentPane().add(mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 97, 96, -1));

        mtxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtxtActionPerformed(evt);
            }
        });
        getContentPane().add(mtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 92, 301, 30));

        mcname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mcname.setText("Country Code");
        getContentPane().add(mcname, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 152, 98, -1));

        mcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcomboActionPerformed(evt);
            }
        });
        getContentPane().add(mcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 148, 297, 30));

        muname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        muname.setText("User Name");
        getContentPane().add(muname, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 210, 94, -1));

        mutxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mutxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mutxtActionPerformed(evt);
            }
        });
        getContentPane().add(mutxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 205, 301, 30));

        mpassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mpassword.setText("Password");
        getContentPane().add(mpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 266, 94, -1));

        mpfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(mpfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 261, 301, 30));

        mregister.setBackground(new java.awt.Color(0, 51, 51));
        mregister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mregister.setForeground(new java.awt.Color(255, 255, 255));
        mregister.setText("REGISTER");
        mregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mregisterActionPerformed(evt);
            }
        });
        getContentPane().add(mregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 337, -1, -1));

        mbackbutton.setBackground(new java.awt.Color(0, 51, 51));
        mbackbutton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mbackbutton.setForeground(new java.awt.Color(255, 255, 255));
        mbackbutton.setText("BACK");
        mbackbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbackbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(mbackbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 337, 84, 27));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 470, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mtxtActionPerformed

    private void mcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcomboActionPerformed

    private void mutxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mutxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mutxtActionPerformed
    
    private void mregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mregisterActionPerformed
       new MerchantController(this, new MerchantModel()).registerAction();
    }//GEN-LAST:event_mregisterActionPerformed

    private void mbackbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbackbuttonActionPerformed
        new LoginScreen().setVisible(true);
         this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_mbackbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterAsMerchantView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterAsMerchantView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterAsMerchantView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterAsMerchantView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterAsMerchantView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton mbackbutton;
    private javax.swing.JLabel mcname;
    private javax.swing.JComboBox<String> mcombo;
    private javax.swing.JLabel mname;
    private javax.swing.JLabel mpassword;
    private javax.swing.JPasswordField mpfield;
    private javax.swing.JButton mregister;
    private javax.swing.JTextField mtxt;
    private javax.swing.JLabel muname;
    private javax.swing.JTextField mutxt;
    // End of variables declaration//GEN-END:variables

    private void getCountryCodes() {

        Connection connection = dbConnector.getConnection();
        Statement stmt;
        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM countries");
            while (rs.next()) {
                String name = rs.getString("name");
                String code = rs.getString("code");
                mcombo.addItem(code+"-"+name);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
    
    
    public String getFirstName(){ 
        return mtxt.getText();
    }
    
    public int getCountry(){
        String contry = mcombo.getSelectedItem().toString();
        String splittedValue[] = contry.split("-");
        int code = Integer.parseInt(splittedValue[0]);
        
        return code;
    }
    
    public String getUserName(){
        return mutxt.getText();
    }
    
    public String getPassword(){
        return String.valueOf(mpfield.getPassword()); 
    }
    
    
    
}