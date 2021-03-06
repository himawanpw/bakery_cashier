/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gui.admin.menu;

import com.entities.AdminList;
import com.entities.UserList;
import com.util.ConnectionConfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Pung's Computer
 */
public class AdminSetting extends javax.swing.JPanel {

    /**
     * Creates new form UserSetting
     */
    Connection connection = null;
    Statement statement = null;
    PreparedStatement preparedStatement =null;
    ResultSet resultSet = null;
    
    public AdminSetting() {
        initComponents();
        showList();
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_show = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        btn_up = new javax.swing.JButton();
        btn_del = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(22, 160, 133));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        table_show.setBackground(new java.awt.Color(22, 160, 133));
        table_show.setForeground(new java.awt.Color(0, 0, 0));
        table_show.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Username", "Password"
            }
        ));
        table_show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_showMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_show);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 118, 396, 386));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Search by Username : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 400, -1, -1));

        txt_search.setBackground(new java.awt.Color(22, 160, 133));
        txt_search.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 396, 134, -1));

        btn_search.setForeground(new java.awt.Color(0, 0, 0));
        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gui/img/icons8-find-user-1male-26.png"))); // NOI18N
        btn_search.setText("SEARCH");
        btn_search.setBorder(null);
        btn_search.setBorderPainted(false);
        btn_search.setContentAreaFilled(false);
        btn_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 462, 94, -1));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 183, -1, -1));

        txt_id.setEditable(false);
        txt_id.setBackground(new java.awt.Color(22, 160, 133));
        jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 179, 130, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 231, -1, -1));

        txt_user.setBackground(new java.awt.Color(22, 160, 133));
        jPanel1.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 227, 130, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 273, -1, -1));

        txt_pass.setBackground(new java.awt.Color(22, 160, 133));
        jPanel1.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 269, 130, -1));

        btn_add.setBackground(new java.awt.Color(22, 160, 133));
        btn_add.setForeground(new java.awt.Color(0, 0, 0));
        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gui/img/icons8-add-user1-male-26 (1).png"))); // NOI18N
        btn_add.setText("ADD");
        btn_add.setBorder(null);
        btn_add.setBorderPainted(false);
        btn_add.setContentAreaFilled(false);
        btn_add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel1.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 341, -1, -1));

        btn_up.setBackground(new java.awt.Color(22, 160, 133));
        btn_up.setForeground(new java.awt.Color(0, 0, 0));
        btn_up.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gui/img/icons8-checked-user-male-24.png"))); // NOI18N
        btn_up.setText("UPDATE");
        btn_up.setBorder(null);
        btn_up.setBorderPainted(false);
        btn_up.setContentAreaFilled(false);
        btn_up.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_upActionPerformed(evt);
            }
        });
        jPanel1.add(btn_up, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 341, -1, -1));

        btn_del.setForeground(new java.awt.Color(0, 0, 0));
        btn_del.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gui/img/icons8-add-user1-male-26 (2).png"))); // NOI18N
        btn_del.setText("REMOVE");
        btn_del.setBorder(null);
        btn_del.setBorderPainted(false);
        btn_del.setContentAreaFilled(false);
        btn_del.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delActionPerformed(evt);
            }
        });
        jPanel1.add(btn_del, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 341, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 787, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        String sql = "INSERT INTO `admin` ( `user`, `pass`) "
                + "VALUES ( '"+txt_user.getText()+"', '"+txt_pass.getText()+"')";
        executeSQlQuery(sql, "INSERTED");
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_upActionPerformed
        // TODO add your handling code here:
        int confirmDialog = JOptionPane.showConfirmDialog(null,"Are You Sure Wanna UPDAATE This?","WARNING",JOptionPane.YES_NO_OPTION);
        if(confirmDialog == JOptionPane.YES_OPTION){
            String sql = "UPDATE admin "
                    + "SET user = '"+txt_user.getText()+"',pass='"+txt_pass.getText()+"' WHERE id = '"+txt_id.getText()+"';";
            executeSQlQuery(sql, "UPDATED");
        }
    }//GEN-LAST:event_btn_upActionPerformed

    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delActionPerformed
        // TODO add your handling code here:
        int confirmDialog = JOptionPane.showConfirmDialog(null,"Are You Sure Wanna DELETE This?","WARNING",JOptionPane.YES_NO_OPTION);
        if(confirmDialog == JOptionPane.YES_OPTION){
            String sql = "DELETE FROM admin WHERE id = '"+txt_id.getText()+"'";
            executeSQlQuery(sql, "DELETED");
        }
    }//GEN-LAST:event_btn_delActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) table_show.getModel();
        model.setRowCount(0);
        showSearch();
    }//GEN-LAST:event_btn_searchActionPerformed

    private void table_showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_showMouseClicked
        // TODO add your handling code here:
        int i = table_show.getSelectedRow();
        TableModel model = table_show.getModel();
        txt_id.setText(model.getValueAt(i, 0).toString());
        txt_user.setText(model.getValueAt(i, 1).toString());
        txt_pass.setText(model.getValueAt(i, 2).toString());
    }//GEN-LAST:event_table_showMouseClicked
    public ArrayList<AdminList> selectAll(){
        ArrayList<AdminList> adminList = new ArrayList<>();
        String sql = "SELECT * FROM admin";
        
        try {
            connection = ConnectionConfig.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            AdminList adminList1;
            while(resultSet.next()){
                adminList1 = new AdminList(
                        resultSet.getInt("id"),
                        resultSet.getString("user"), 
                        resultSet.getString("pass")  
                );
            adminList.add(adminList1);
        } 
        }catch (Exception e) {
            e.printStackTrace();
        }
        return adminList;
    }
    
    public void showList(){
        ArrayList<AdminList> list = selectAll();
        DefaultTableModel model = (DefaultTableModel) table_show.getModel();
        Object[] row = new Object[3];
        for(int i = 0;i<list.size();i++){
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getUsername();
            row[2] = list.get(i).getPassword();
            model.addRow(row);
        }
        table_show.setModel(model);
    }
    
    public ArrayList<AdminList> search(String varSearch){
        ArrayList<AdminList> adminList = new ArrayList<>();
        String sql = "SELECT * FROM admin WHERE user LIKE '%"+varSearch+"%'";
        
        try {
            connection = ConnectionConfig.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            AdminList adminList1;
            while(resultSet.next()){
                adminList1 = new AdminList(
                        resultSet.getInt("id"),
                        resultSet.getString("user"), 
                        resultSet.getString("pass")  
                );
            adminList.add(adminList1);
        }
            if(!resultSet.next()){
                JOptionPane.showMessageDialog(null, "Admin Not Found");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return adminList;
    }
    
    public void showSearch(){
        ArrayList<AdminList> list = search(txt_search.getText());
        DefaultTableModel model = (DefaultTableModel) table_show.getModel();
        Object[] row = new Object[3];
        for(int i = 0;i<list.size();i++){
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getUsername();
            row[2] = list.get(i).getPassword();
            model.addRow(row);
        }
        table_show.setModel(model);
    }
    
     public void executeSQlQuery(String query, String message){
       try{
           connection = ConnectionConfig.getConnection();
           statement = connection.createStatement();
           if((statement.executeUpdate(query)) == 1)
           {
               DefaultTableModel model = (DefaultTableModel)table_show.getModel();
               model.setRowCount(0);
               showList();
               txt_id.setText("");
               txt_user.setText("");
               txt_pass.setText("");
               JOptionPane.showMessageDialog(null, "Admin has been "+message+" Succefully");
           }else{
               JOptionPane.showMessageDialog(null, "Admin Not "+message);
           }
       }catch(Exception e){
           e.printStackTrace();
       }
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_del;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_up;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_show;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_pass;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
