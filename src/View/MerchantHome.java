/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.DatabaseConnector;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Udesh Madawa
 */
public class MerchantHome extends javax.swing.JFrame {
    
    DatabaseConnector dbConnector;   
    PreparedStatement pst = null;
    ResultSet res = null;
    
    public MerchantHome() {
        initComponents();
        dbConnector = new DatabaseConnector();
        inputTable();
   
        
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
         
    }
         public void inputTable(){
             DefaultTableModel model = new DefaultTableModel();
            
             try {
                 
                Connection connection = dbConnector.getConnection();
                 String sql ="SELECT id,name,price,status FROM products";
                 pst = connection.prepareStatement(sql);
                 res = pst.executeQuery();
                 jTable1.setModel(DbUtils.resultSetToTableModel(res));
                 
               
             } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, e);
             }
         }
         
         public void tableData(){
             int row = jTable1.getSelectedRow();
             
             String Id = jTable1.getValueAt(row,0).toString() ;
             String name = jTable1.getValueAt(row, 1).toString();
             double price =(double) jTable1.getValueAt(row, 2);
             String status = jTable1.getValueAt(row, 3).toString();
            
             
             mid.setText(Id);
             productField.setText(name);
             priceField.setText(String.valueOf(price));
             statusArea.setText(status);
             
         }
         public void update(){
             String name = productField.getText();
             double price = Double.parseDouble(priceField.getText());
             String status = statusArea.getText();
             String Id = mid.getText();
             try {
                 Connection connection = dbConnector.getConnection();
                 String sql = "UPDATE products SET name = ?, price = ?,status = ? WHERE id = ? ";
                 pst = connection.prepareStatement(sql);                 
                 pst.setString(1,name );
                pst.setDouble(2, price);
                pst.setString(3, status);
                pst.setInt(4,Integer.parseInt(Id));
                 pst.executeUpdate();
                 
                 JOptionPane.showMessageDialog(null,"DATA UPDATED");
             } catch (Exception e) {
                  JOptionPane.showMessageDialog(null, "UPDATE FAIL!");
             }
         }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        productField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        statusArea = new javax.swing.JTextArea();
        minsertButton = new javax.swing.JButton();
        mbackBtton = new javax.swing.JButton();
        midbutton = new javax.swing.JLabel();
        mid = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mupdateButton = new javax.swing.JButton();
        deletButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELLING YOUR PRODUCT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 363, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("PRODUCT NAME");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 104, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("PRICE");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 151, 111, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("STATUS");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 198, 111, -1));

        priceField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        priceField.setToolTipText("enter price");
        priceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceFieldActionPerformed(evt);
            }
        });
        jPanel2.add(priceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 145, 234, -1));

        productField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        productField.setToolTipText("enter product name");
        jPanel2.add(productField, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 98, 234, -1));

        statusArea.setColumns(20);
        statusArea.setRows(5);
        jScrollPane1.setViewportView(statusArea);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 198, -1, -1));

        minsertButton.setBackground(new java.awt.Color(0, 51, 51));
        minsertButton.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        minsertButton.setForeground(new java.awt.Color(255, 255, 255));
        minsertButton.setText("INSERT");
        minsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minsertButtonActionPerformed(evt);
            }
        });
        jPanel2.add(minsertButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 452, 90, 35));

        mbackBtton.setBackground(new java.awt.Color(0, 51, 51));
        mbackBtton.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        mbackBtton.setForeground(new java.awt.Color(255, 255, 255));
        mbackBtton.setText("BACK");
        mbackBtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbackBttonActionPerformed(evt);
            }
        });
        jPanel2.add(mbackBtton, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 452, 90, 35));

        midbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        midbutton.setText("ID");
        jPanel2.add(midbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 315, 111, 26));

        mid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mid.setText("ID");
        jPanel2.add(mid, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 318, 54, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Square150x150Logo.scale-100.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        mupdateButton.setBackground(new java.awt.Color(0, 51, 51));
        mupdateButton.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        mupdateButton.setForeground(new java.awt.Color(255, 255, 255));
        mupdateButton.setText("UPDATE");
        mupdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mupdateButtonActionPerformed(evt);
            }
        });

        deletButton.setBackground(new java.awt.Color(0, 51, 51));
        deletButton.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        deletButton.setForeground(new java.awt.Color(255, 255, 255));
        deletButton.setText("DELETE");
        deletButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletButtonActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(0, 153, 153));
        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(0, 153, 153));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ORDER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(mupdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deletButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mupdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void priceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceFieldActionPerformed

    private void minsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minsertButtonActionPerformed
       
           String product = productField.getText();
           double amount =Double.parseDouble(priceField.getText());
          String stat = statusArea.getText();
        
       
         if (product.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "Product Can Not Be Empty !");
        }else if (priceField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Price Can Not Be Empty !");
        }else if (stat.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "Status  Can Not Be Empty !");
        }else{
        //saving data to database
            Connection connection = dbConnector.getConnection();
            String query = "INSERT INTO products(name,price,status) VALUES (?,?,?)";
            try (PreparedStatement stmt = connection.prepareStatement(query)) {
                stmt.setString(1,product );
                stmt.setDouble(2, amount);
                stmt.setString(3, stat);  
                stmt.executeUpdate();
                int input = JOptionPane.showOptionDialog(null, "Saved Succesfully..!", "Info", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

                if (input == JOptionPane.OK_OPTION) {
                   new MerchantHome().setVisible(true);
                   this.setVisible(false);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
               
            }
            
           
        
        
        }
    }//GEN-LAST:event_minsertButtonActionPerformed

    private void mbackBttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbackBttonActionPerformed
        
        new RegisterAsMerchantView().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_mbackBttonActionPerformed
    


    private void mupdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mupdateButtonActionPerformed
       
        update();
        inputTable();
    }//GEN-LAST:event_mupdateButtonActionPerformed

    private void deletButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletButtonActionPerformed
       
        int Check = JOptionPane.showConfirmDialog(null, "ARE YOU SURE!");
        
        if(Check==0){
            
            Connection connection =null;
           
            
            int Id ;
            
            try {
                Id = Integer.parseInt(mid.getText());
                connection = dbConnector.getConnection();
                String sql = "DELETE FROM products WHERE id=?";
                pst = connection.prepareStatement(sql);
                pst.setInt(1,Id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "DELETED");
                
            } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, "CAN NOT DELETED");
            }
        }
        inputTable();
    }//GEN-LAST:event_deletButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        tableData();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1KeyPressed

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        tableData();
    }//GEN-LAST:event_jTable1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         new order_details().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MerchantHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MerchantHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MerchantHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MerchantHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MerchantHome().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton mbackBtton;
    private javax.swing.JLabel mid;
    private javax.swing.JLabel midbutton;
    private javax.swing.JButton minsertButton;
    private javax.swing.JButton mupdateButton;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField productField;
    private javax.swing.JTextArea statusArea;
    // End of variables declaration//GEN-END:variables
}
