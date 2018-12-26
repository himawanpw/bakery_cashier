/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gui.admin.menu;

import com.entities.Bread;
import com.entities.TransactionHsitory;
import com.gui.user.User;
import com.util.ConnectionConfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pung's Computer
 */
public class History extends javax.swing.JPanel {

    /**
     * Creates new form History
     */
    Connection connection = null;
    Statement statement = null;
    PreparedStatement preparedStatement =null;
    ResultSet resultSet = null;
    User user = new User();
    public History() {
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
        btn_showAll = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(22, 160, 133));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

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

        table_show.setBackground(new java.awt.Color(22, 160, 133));
        table_show.setForeground(new java.awt.Color(0, 0, 0));
        table_show.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Bread", "Price(/pcs)", "Quantity", "Total Price", "Chasier"
            }
        ));
        jScrollPane1.setViewportView(table_show);

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Search by Bread Name : ");

        txt_search.setBackground(new java.awt.Color(22, 160, 133));
        txt_search.setForeground(new java.awt.Color(0, 0, 0));

        btn_showAll.setForeground(new java.awt.Color(0, 0, 0));
        btn_showAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gui/img/icons8-select-all-30.png"))); // NOI18N
        btn_showAll.setText("SHOW ALL");
        btn_showAll.setBorder(null);
        btn_showAll.setBorderPainted(false);
        btn_showAll.setContentAreaFilled(false);
        btn_showAll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_showAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showAllActionPerformed(evt);
            }
        });

        btn_search.setForeground(new java.awt.Color(0, 0, 0));
        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gui/img/icons8-search-30.png"))); // NOI18N
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btn_showAll, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_search)
                            .addComponent(btn_showAll)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_showAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showAllActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)table_show.getModel();
        model.setRowCount(0);
        showList();
    }//GEN-LAST:event_btn_showAllActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)table_show.getModel();
        model.setRowCount(0);
        search();
    }//GEN-LAST:event_btn_searchActionPerformed
    public ArrayList<TransactionHsitory> selectAll(){
        ArrayList<TransactionHsitory> transactionList = new ArrayList<>();
        String sql = "SELECT * FROM transaksi";
        try {
            connection = ConnectionConfig.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            TransactionHsitory history;
            while(resultSet.next()){
                history = new TransactionHsitory(
                        resultSet.getInt("id"),
                        resultSet.getString("bread_name"), 
                        resultSet.getDouble("total_price"),
                        resultSet.getInt("quan"),
                        resultSet.getDate("date")
                );
                transactionList.add(history);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return transactionList;
    }
    
    public void showList(){
        ArrayList<TransactionHsitory> list = selectAll();
        DefaultTableModel model = (DefaultTableModel) table_show.getModel();
        Object[] row = new Object[6];
        for(int i = 0;i<list.size();i++){
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getBraed();
            row[2] = list.get(i).getPrice();
            row[3] = list.get(i).getQuan();
            row[4] = list.get(i).getDate();
            row[5] = user.getUser();
            model.addRow(row);
        }
        table_show.setModel(model);
    }
    
    public ArrayList<TransactionHsitory> search(String varSearch){
        ArrayList<TransactionHsitory> transactionList = new ArrayList<>();
        String sql = "SELECT * FROM transaksi WHERE bread_name LIKE '%"+varSearch+"%'";
        try {
            connection = ConnectionConfig.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            TransactionHsitory history;
            while(resultSet.next()){
                history = new TransactionHsitory(
                        resultSet.getInt("id"),
                        resultSet.getString("bread_name"), 
                        resultSet.getDouble("total_price"),
                        resultSet.getInt("quan"),
                        resultSet.getDate("date")
                );
                transactionList.add(history);
            }
            if(!resultSet.next()){
                JOptionPane.showMessageDialog(null, "Transaction Not Found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return transactionList;
    }
    
    public void search(){
        ArrayList<TransactionHsitory> list = search(txt_search.getText());
        DefaultTableModel model = (DefaultTableModel) table_show.getModel();
        Object[] row = new Object[6];
        for(int i = 0;i<list.size();i++){
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getBraed();
            row[2] = list.get(i).getPrice();
            row[3] = list.get(i).getQuan();
            row[4] = list.get(i).getDate();
            row[5] = user.getUser();
            model.addRow(row);
        }
        table_show.setModel(model);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_showAll;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_show;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
