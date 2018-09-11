/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.view;

import edu.salle.custommoodle.buisnesslogic.StudentBLO;
import edu.salle.custommoodle.model.Student;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gerardo Cabrera
 */
public class StudentWindow extends javax.swing.JFrame {

    /**
     * Creates new form StudentWindow
     */
    
    private StudentBLO studentBLO = new StudentBLO();
    
    public StudentWindow() {
        initComponents();
        setLocationRelativeTo(null);
        studentBLO.load();
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
        tfParameter = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        bDelete = new javax.swing.JButton();
        bSave = new javax.swing.JButton();
        tfId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bSearch = new javax.swing.JButton();
        bUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tStudents = new javax.swing.JTable();
        bRefresh = new javax.swing.JButton();
        bExit = new javax.swing.JButton();
        tfLastName = new javax.swing.JTextField();
        bSearchAll = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Last Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        tfParameter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfParameterActionPerformed(evt);
            }
        });
        getContentPane().add(tfParameter, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 130, -1));

        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });
        getContentPane().add(tfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 120, -1));

        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(bDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 130, 40));

        bSave.setText("Save");
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });
        getContentPane().add(bSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 130, 30));

        tfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdActionPerformed(evt);
            }
        });
        getContentPane().add(tfId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 120, -1));

        jLabel3.setText("Id");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 20, -1));

        bSearch.setText("Search");
        bSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearchActionPerformed(evt);
            }
        });
        getContentPane().add(bSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 130, 30));

        bUpdate.setText("Update");
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(bUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 130, 30));

        tStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Last Name"
            }
        ));
        tStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tStudentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tStudents);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, 240));

        bRefresh.setText("Refresh");
        bRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRefreshActionPerformed(evt);
            }
        });
        getContentPane().add(bRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 590, 50));

        bExit.setText("Save & Exit");
        bExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExitActionPerformed(evt);
            }
        });
        getContentPane().add(bExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 30));

        tfLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLastNameActionPerformed(evt);
            }
        });
        getContentPane().add(tfLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 120, -1));

        bSearchAll.setText("Search All");
        bSearchAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearchAllActionPerformed(evt);
            }
        });
        getContentPane().add(bSearchAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 130, 30));

        jLabel4.setText("Id/Name/Lastname");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameActionPerformed

    private void tfParameterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfParameterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfParameterActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed

        String id = tfId.getText();
        
        if(!id.isEmpty())
        {
            Student student = studentBLO.find(id);
            studentBLO.delete(student);
            
            List<Student> studentList = studentBLO.findAll();
            refreshTable(studentList);
            
            tfId.setText("");
            tfName.setText("");
            tfLastName.setText("");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "You need to fill all the ID field");
        }

    }//GEN-LAST:event_bDeleteActionPerformed

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
        // TODO add your handling code here:
        
        String name = tfName.getText();
        String lastName = tfLastName.getText();
        
        if(!name.isEmpty() && !lastName.isEmpty())
        {
            Student student = new Student(name, lastName);
            studentBLO.save(student);

            tfName.setText("");
            tfLastName.setText("");

            List<Student> studentList = studentBLO.findAll();
            refreshTable(studentList);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "You need to fill all the fields (Name and Lastname)");
        }
        
    }//GEN-LAST:event_bSaveActionPerformed

    private void tfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdActionPerformed

    private void bSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearchActionPerformed
        // TODO add your handling code here:
        
//        String id = tfId.getText();
//        Student student = studentBLO.find(id);
//        if(student != null)
//        {
//            tfName.setText(student.getName());
//            tfLastName.setText(student.getLastName());
//        }
        
        String lastName = tfParameter.getText().trim();
        
        if(!lastName.isEmpty())
        {
            List<Student> studentList = studentBLO.findByLastName(lastName);
            if(!studentList.isEmpty())
            {
              refreshTable(studentList);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "You need to fill the parameter");
        }
    }//GEN-LAST:event_bSearchActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
        // TODO add your handling code here:
        
        String name = tfName.getText();
        String lastName = tfLastName.getText();
        String id = tfId.getText();
        
        if(!id.isEmpty())
        {
            if(!name.isEmpty() || !lastName.isEmpty())
            {
                Student student = studentBLO.find(id);
                if(!name.isEmpty())
                {  
                    student.setName(name);
                }
                if(!lastName.isEmpty())
                {  
                    student.setLastName(lastName);
                }
                studentBLO.update(student);

                tfId.setText("");
                tfName.setText("");
                tfLastName.setText("");

                List<Student> studentList = studentBLO.findAll();
                refreshTable(studentList);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "You need to fill at least one of the fields (Name or Lastname)");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "You need to fill all the ID field");
        }
        
        
    }//GEN-LAST:event_bUpdateActionPerformed

    private void bRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRefreshActionPerformed
        // TODO add your handling code here:
        refreshTable(studentBLO.findAll());
    }//GEN-LAST:event_bRefreshActionPerformed

    private void tfLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLastNameActionPerformed

    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExitActionPerformed
        // TODO add your handling code here:
        
        studentBLO.commitChanges();
        this.dispose();
    }//GEN-LAST:event_bExitActionPerformed

    private void bSearchAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearchAllActionPerformed
        // TODO add your handling code here:
        List<Student> studentList = studentBLO.findAll();
        refreshTable(studentList);
    }//GEN-LAST:event_bSearchAllActionPerformed

    private void tStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tStudentsMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) tStudents.getModel();
        int selectedRowIndex = tStudents.getSelectedRow();
        String id = (String) dtm.getValueAt(selectedRowIndex, 0);
        String name = (String) dtm.getValueAt(selectedRowIndex, 1);
        String lastName = (String) dtm.getValueAt(selectedRowIndex, 2);
        
        tfId.setText(id);
        tfName.setText(name);
        tfLastName.setText(lastName);
    }//GEN-LAST:event_tStudentsMouseClicked

    
    //METODOS
    
    private void refreshTable(List<Student> studentList)
    {
        clearTable();
        
        DefaultTableModel dtm = (DefaultTableModel) tStudents.getModel();
        Object[] emptyRow = {""};
        
        for (int i = 0; i < studentList.size(); i++) {
            dtm.addRow(emptyRow);
            dtm.setValueAt(studentList.get(i).getId(), i, 0);
            dtm.setValueAt(studentList.get(i).getName(), i, 1);
            dtm.setValueAt(studentList.get(i).getLastName(), i, 2);
        }
    }
    
    private void clearTable()
    {
        DefaultTableModel dtm = (DefaultTableModel) tStudents.getModel();
        while(dtm.getRowCount()>0)
        {
            dtm.removeRow(0);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bExit;
    private javax.swing.JButton bRefresh;
    private javax.swing.JButton bSave;
    private javax.swing.JButton bSearch;
    private javax.swing.JButton bSearchAll;
    private javax.swing.JButton bUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tStudents;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfParameter;
    // End of variables declaration//GEN-END:variables
}
