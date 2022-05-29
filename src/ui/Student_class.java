
package ui;

import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import src.Database;


public class Student_class extends javax.swing.JInternalFrame {
    
    DefaultTableModel dtm;
    String _ID = "";
    
    public Student_class() {
        initComponents();
        dtm = (DefaultTableModel)tbl_class.getModel();
        loadData();
   
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_csm = new javax.swing.JLabel();
        pnl_newclass = new javax.swing.JPanel();
        lbl_cid = new javax.swing.JLabel();
        lbl_sid = new javax.swing.JLabel();
        txt_sid = new javax.swing.JTextField();
        txt_cid = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        pnl_savedetails = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_class = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Class Management");

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        lbl_csm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_csm.setForeground(new java.awt.Color(0, 0, 204));
        lbl_csm.setText("Class Manage System");

        pnl_newclass.setBackground(new java.awt.Color(204, 204, 255));
        pnl_newclass.setBorder(javax.swing.BorderFactory.createTitledBorder("New Class"));

        lbl_cid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_cid.setText("Class Id");

        lbl_sid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_sid.setText("Student Id");

        txt_sid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sidActionPerformed(evt);
            }
        });

        btn_save.setBackground(new java.awt.Color(51, 102, 255));
        btn_save.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(255, 51, 51));
        btn_delete.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_update.setBackground(new java.awt.Color(102, 255, 102));
        btn_update.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_newclassLayout = new javax.swing.GroupLayout(pnl_newclass);
        pnl_newclass.setLayout(pnl_newclassLayout);
        pnl_newclassLayout.setHorizontalGroup(
            pnl_newclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_newclassLayout.createSequentialGroup()
                .addGroup(pnl_newclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_newclassLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(pnl_newclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnl_newclassLayout.createSequentialGroup()
                                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_newclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_cid, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_sid, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnl_newclassLayout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(lbl_sid))
                    .addGroup(pnl_newclassLayout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(lbl_cid)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_newclassLayout.setVerticalGroup(
            pnl_newclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_newclassLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbl_sid, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_sid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_cid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txt_cid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(pnl_newclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        pnl_savedetails.setBackground(new java.awt.Color(204, 204, 255));
        pnl_savedetails.setBorder(javax.swing.BorderFactory.createTitledBorder("Save Details"));

        tbl_class.setBackground(new java.awt.Color(153, 153, 153));
        tbl_class.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Student Id", "Class Id"
            }
        ));
        tbl_class.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_classMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_class);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Filter");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_savedetailsLayout = new javax.swing.GroupLayout(pnl_savedetails);
        pnl_savedetails.setLayout(pnl_savedetailsLayout);
        pnl_savedetailsLayout.setHorizontalGroup(
            pnl_savedetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_savedetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_savedetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                    .addGroup(pnl_savedetailsLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField1)))
                .addContainerGap())
        );
        pnl_savedetailsLayout.setVerticalGroup(
            pnl_savedetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_savedetailsLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(pnl_savedetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_newclass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_savedetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_csm)
                .addGap(184, 184, 184))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl_csm, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_newclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_savedetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            int selection = JOptionPane.showConfirmDialog(rootPane, "want to save student_class data");
            if(selection == 0){
            Database.getConnection().createStatement().executeUpdate("insert into  student_class(sid,cid) value ('"+txt_sid.getText()+"','"+txt_cid.getText()+"')");
            JOptionPane.showMessageDialog(rootPane, "Data Saved Successfully");
            loadData();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void tbl_classMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_classMouseClicked
        int selected_row = tbl_class.getSelectedRow();
        txt_sid.setText(dtm.getValueAt(selected_row, 1).toString());
        txt_cid.setText(dtm.getValueAt(selected_row, 2).toString());
        _ID = dtm.getValueAt(selected_row, 0).toString();
    }//GEN-LAST:event_tbl_classMouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        try {
            
            int selection = JOptionPane.showConfirmDialog(rootPane, "want to change student_class data");
            if(selection == 0){
                Database.getConnection().createStatement().executeUpdate("update class set sid='"+txt_sid.getText()+"',Cid='"+txt_cid.getText()+"' where id='"+_ID+"'");
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
                Database.getConnection().createStatement().executeUpdate("delete from student_class where id='"+_ID+"'");
                JOptionPane.showMessageDialog(rootPane, "Data Deleted Successfuly");
                loadData();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void txt_sidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sidActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_cid;
    private javax.swing.JLabel lbl_csm;
    private javax.swing.JLabel lbl_sid;
    private javax.swing.JPanel pnl_newclass;
    private javax.swing.JPanel pnl_savedetails;
    private javax.swing.JTable tbl_class;
    private javax.swing.JTextField txt_cid;
    private javax.swing.JTextField txt_sid;
    // End of variables declaration//GEN-END:variables

        void loadData() {
        try {
            
            dtm.setRowCount(0);
            ResultSet rs = Database.getConnection().createStatement().executeQuery("select * from student_class");
            
            while(rs.next()){
              Vector v = new Vector();
              v.add(rs.getString("id"));
              v.add(rs.getString("sid"));
              v.add(rs.getString("cid"));
              dtm.addRow(v);
            }
        
            
        }catch (Exception e) {
            e.printStackTrace();
        }


    }
        void filter_table(String query){
            TableRowSorter<DefaultTableModel> trs = new TableRowSorter<DefaultTableModel>(dtm);
            tbl_class.setRowSorter(trs);
            trs.setRowFilter(RowFilter.regexFilter(query));
        }    

}


