
package ui;

import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import src.Database;


public class Student extends javax.swing.JInternalFrame {

    DefaultTableModel dtm;
    String _ID = "";
    
    public Student() throws SQLException{
        initComponents();
        dtm = (DefaultTableModel)tbl_student.getModel();
        loadData();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_sm = new javax.swing.JLabel();
        jpnl_NewAdd = new javax.swing.JPanel();
        txt_brcd = new javax.swing.JTextField();
        txt_nm = new javax.swing.JTextField();
        lbl_brcd = new javax.swing.JLabel();
        lbl_stdnt = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_student = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_filter = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Student Management");

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        lbl_sm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_sm.setForeground(new java.awt.Color(51, 0, 204));
        lbl_sm.setText("Student Manage");

        jpnl_NewAdd.setBackground(new java.awt.Color(204, 204, 255));
        jpnl_NewAdd.setBorder(javax.swing.BorderFactory.createTitledBorder("New Admission"));

        txt_brcd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_brcdActionPerformed(evt);
            }
        });

        lbl_brcd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_brcd.setForeground(new java.awt.Color(102, 0, 51));
        lbl_brcd.setText("Barcode");

        lbl_stdnt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_stdnt.setForeground(new java.awt.Color(102, 0, 51));
        lbl_stdnt.setText("Student");

        btn_save.setBackground(new java.awt.Color(153, 204, 255));
        btn_save.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_update.setBackground(new java.awt.Color(204, 255, 153));
        btn_update.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(255, 153, 153));
        btn_delete.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnl_NewAddLayout = new javax.swing.GroupLayout(jpnl_NewAdd);
        jpnl_NewAdd.setLayout(jpnl_NewAddLayout);
        jpnl_NewAddLayout.setHorizontalGroup(
            jpnl_NewAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnl_NewAddLayout.createSequentialGroup()
                .addGroup(jpnl_NewAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnl_NewAddLayout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(lbl_stdnt))
                    .addGroup(jpnl_NewAddLayout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(lbl_brcd))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnl_NewAddLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpnl_NewAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_brcd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnl_NewAddLayout.createSequentialGroup()
                                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnl_NewAddLayout.setVerticalGroup(
            jpnl_NewAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnl_NewAddLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lbl_brcd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_brcd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_stdnt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpnl_NewAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Save Details"));

        tbl_student.setBackground(new java.awt.Color(204, 204, 255));
        tbl_student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Barcode", "Name"
            }
        ));
        tbl_student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_studentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_student);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("Filter");

        txt_filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filterActionPerformed(evt);
            }
        });
        txt_filter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filterKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_filter)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnl_NewAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(lbl_sm, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_sm, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnl_NewAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        try{
            int selection = JOptionPane.showConfirmDialog(rootPane, "want to save student data");
            if(selection == 0){
            Database.getConnection().createStatement().executeUpdate("insert into student(barcode,name) value ('"+txt_brcd.getText()+"','"+txt_nm.getText()+"')");
            JOptionPane.showMessageDialog(rootPane, "Data Saved Successfully");
            loadData();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void tbl_studentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_studentMouseClicked
        int selected_row = tbl_student.getSelectedRow();
        txt_brcd.setText(dtm.getValueAt(selected_row, 1).toString());
        txt_nm.setText(dtm.getValueAt(selected_row, 2).toString());
        _ID = dtm.getValueAt(selected_row, 0).toString();
    }//GEN-LAST:event_tbl_studentMouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        try {
            
            int selection = JOptionPane.showConfirmDialog(rootPane, "want to change student data");
            if(selection == 0){
                Database.getConnection().createStatement().executeUpdate("update student set barcode='"+txt_brcd.getText()+"',name='"+txt_nm.getText()+"' where id='"+_ID+"'");
                JOptionPane.showMessageDialog(rootPane, "Data Updated Successfuly");
                loadData();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        try {
            
            int selection = JOptionPane.showConfirmDialog(rootPane, "want to change delete data");
            if(selection == 0){
                Database.getConnection().createStatement().executeUpdate("delete from student where id='"+_ID+"'");
                JOptionPane.showMessageDialog(rootPane, "Data Deleted Successfuly");
                loadData();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void txt_filterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filterKeyReleased
        filter_table(txt_filter.getText().toUpperCase());
    }//GEN-LAST:event_txt_filterKeyReleased

    private void txt_filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_filterActionPerformed

    private void txt_brcdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_brcdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_brcdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpnl_NewAdd;
    private javax.swing.JLabel lbl_brcd;
    private javax.swing.JLabel lbl_sm;
    private javax.swing.JLabel lbl_stdnt;
    private javax.swing.JTable tbl_student;
    private javax.swing.JTextField txt_brcd;
    private javax.swing.JTextField txt_filter;
    private javax.swing.JTextField txt_nm;
    // End of variables declaration//GEN-END:variables

        void loadData() {
        try {
            
            dtm.setRowCount(0);
            ResultSet rs = Database.getConnection().createStatement().executeQuery("select * from student");
            
            while(rs.next()){
              Vector v = new Vector();
              v.add(rs.getString("id"));
              v.add(rs.getString("barcode"));
              v.add(rs.getString("name"));
              dtm.addRow(v);
            }
        
            
        }catch (Exception e) {
            e.printStackTrace();
        }
            
    }   
        void filter_table(String query){
            TableRowSorter<DefaultTableModel> trs = new TableRowSorter<DefaultTableModel>(dtm);
            tbl_student.setRowSorter(trs);
            trs.setRowFilter(RowFilter.regexFilter(query));
        }

}
