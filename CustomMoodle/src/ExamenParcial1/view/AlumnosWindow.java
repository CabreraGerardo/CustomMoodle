/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenParcial1.view;

import ExamenParcial1.buisnesslogic.SubjectBLO;
import ExamenParcial1.model.Student;
import ExamenParcial1.buisnesslogic.StudentBLO;
import ExamenParcial1.model.Subject;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gerardo Cabrera
 */
public class AlumnosWindow extends javax.swing.JFrame {

    /**
     * Creates new form Alumnos
     */
    
    StudentBLO studentBLO = new StudentBLO();
    SubjectBLO subjectBLO = new SubjectBLO();
    List<String> nombresMaterias = new ArrayList<>();
    List<String> nombresMateriasAlumno = new ArrayList<>();
    
    public AlumnosWindow() {
        initComponents();
        setLocationRelativeTo(null);
        studentBLO.load();
        
        subjectBLO.load();
        
        
        for(int i = 0; i < subjectBLO.findAll().size(); i++)
        {
            nombresMaterias.add(subjectBLO.findAll().get(i).getNombre());
        }
        
        
        cbMaterias.setModel(new DefaultComboBoxModel(nombresMaterias.toArray()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfEstado = new javax.swing.JTextField();
        tfPrimerNombre = new javax.swing.JTextField();
        tfSegundoNombre = new javax.swing.JTextField();
        tfApellidoPaterno = new javax.swing.JTextField();
        tfApellidoMaterno = new javax.swing.JTextField();
        tfFechaNacimiento = new javax.swing.JTextField();
        tfGenero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlumnos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMaterias = new javax.swing.JTable();
        cbMaterias = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfCURP = new javax.swing.JTextField();
        bExit = new javax.swing.JButton();
        bDelete = new javax.swing.JToggleButton();
        bUpdate = new javax.swing.JToggleButton();
        bSearch = new javax.swing.JToggleButton();
        bSave = new javax.swing.JToggleButton();
        bRefresh = new javax.swing.JButton();
        bSignUpSubject = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(tfEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 150, -1));
        getContentPane().add(tfPrimerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 150, -1));
        getContentPane().add(tfSegundoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 150, -1));
        getContentPane().add(tfApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 150, -1));
        getContentPane().add(tfApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 150, -1));
        getContentPane().add(tfFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 150, -1));
        getContentPane().add(tfGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 150, -1));

        jLabel1.setText("Estado:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, -1, 20));

        jLabel2.setText("Primer Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, 20));

        jLabel3.setText("Apellido Paterno:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, 20));

        jLabel4.setText("Apellido Materno:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, 20));

        jLabel5.setText("Segundo Nombre:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, 20));

        jLabel6.setText("Registrar en materia:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, -1, 20));

        jLabel7.setText("Género:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, -1, 20));

        tblAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CURP", "Nombre(s)", "Apellido(s)", "Fecha de Nacimiento", "Género", "Estado"
            }
        ));
        tblAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAlumnos);
        if (tblAlumnos.getColumnModel().getColumnCount() > 0) {
            tblAlumnos.getColumnModel().getColumn(2).setHeaderValue("Apellido(s)");
            tblAlumnos.getColumnModel().getColumn(3).setHeaderValue("Fecha de Nacimiento");
            tblAlumnos.getColumnModel().getColumn(4).setResizable(false);
            tblAlumnos.getColumnModel().getColumn(4).setHeaderValue("Género");
            tblAlumnos.getColumnModel().getColumn(5).setHeaderValue("Estado");
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 670, 240));

        tblMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Docente"
            }
        ));
        jScrollPane2.setViewportView(tblMaterias);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 230, 240));

        getContentPane().add(cbMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 150, -1));

        jLabel8.setText("Fecha de Nacimiento (YY-MM-DD):");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, 20));

        jLabel9.setText("CURP:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        tfCURP.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tfCURPPropertyChange(evt);
            }
        });
        getContentPane().add(tfCURP, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 360, -1));

        bExit.setText("Save & Exit");
        bExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExitActionPerformed(evt);
            }
        });
        getContentPane().add(bExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 40));

        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(bDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 80, -1));

        bUpdate.setText("Update");
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(bUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 200, 40));

        bSearch.setText("Search");
        bSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearchActionPerformed(evt);
            }
        });
        getContentPane().add(bSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 80, -1));

        bSave.setText("Save");
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });
        getContentPane().add(bSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 200, 40));

        bRefresh.setText("Refresh");
        bRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRefreshActionPerformed(evt);
            }
        });
        getContentPane().add(bRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, 940, 50));

        bSignUpSubject.setText("Registrar en Materia");
        bSignUpSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSignUpSubjectActionPerformed(evt);
            }
        });
        getContentPane().add(bSignUpSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
        // TODO add your handling code here:
        String firstName = tfPrimerNombre.getText();
        String secondName = tfSegundoNombre.getText();
        String fathersLastName = tfApellidoPaterno.getText();
        String mothersLastName = tfApellidoMaterno.getText();
        String state = tfEstado.getText();
        String sex = tfGenero.getText();
        String birthDate = tfFechaNacimiento.getText();
        
        
        if(!firstName.isEmpty() || !secondName.isEmpty())
        {
            if(!fathersLastName.isEmpty() && !mothersLastName.isEmpty() && !state.isEmpty() && !sex.isEmpty() && !birthDate.isEmpty())
            {
                Student student = new Student(firstName, secondName, fathersLastName, mothersLastName, birthDate, state, sex);
                studentBLO.save(student);
                
                List<Student> studentList = studentBLO.findAll();
                refreshTable(studentList);
            }
        }
    }//GEN-LAST:event_bSaveActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
        // TODO add your handling code here:
        
        String CURP = tfCURP.getText();
        String firstName = tfPrimerNombre.getText();
        String secondName = tfSegundoNombre.getText();
        String fathersLastName = tfApellidoPaterno.getText();
        String mothersLastName = tfApellidoMaterno.getText();
        String state = tfEstado.getText();
        String sex = tfGenero.getText();
        String birthDate = tfFechaNacimiento.getText();
        
        
        if(!CURP.isEmpty())
        {
            if(!firstName.isEmpty() || !secondName.isEmpty())
            {
                if(!fathersLastName.isEmpty() && !mothersLastName.isEmpty() && !state.isEmpty() && !sex.isEmpty() && !birthDate.isEmpty())
                {
                    List<Student> student = studentBLO.findByCurp(CURP);
                    Student studentToUpdate = student.get(0);

                    studentToUpdate.setNombre(firstName);
                    studentToUpdate.setSegundoNombre(secondName);
                    studentToUpdate.setApellidoPaterno(fathersLastName);
                    studentToUpdate.setApellidoMaterno(mothersLastName);
                    studentToUpdate.setEstado(state);
                    studentToUpdate.setFechaNacimiento(birthDate);
                    studentToUpdate.setSexo(sex);
                    
                    studentBLO.update(studentToUpdate);
                    
                    List<Student> studentList = studentBLO.findAll();
                    refreshTable(studentList);
                }
            }
        }
        
    }//GEN-LAST:event_bUpdateActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        // TODO add your handling code here:
        String CURP = tfCURP.getText();
        
        if(!CURP.isEmpty())
        {
            List<Student> student = studentBLO.findByCurp(CURP);
            
            
            List<Subject> subjectList = subjectBLO.findAll();
        
            for(int i = 0; i < subjectList.size(); i++)
            {
                List<Student> students = subjectList.get(i).getAlumnos();
                for(int j = 0; j < students.size(); j++)
                {
                    if(students.get(j).getCurp().equals(CURP))
                    {
                        students.remove(subjectBLO.findAll().get(i).getAlumnos().get(j));
                    }
                }
            }
            
            
            
            studentBLO.delete(student.get(0));
            
            List<Student> studentList = studentBLO.findAll();
            refreshTable(studentList);
            
            
            
        }
        
    }//GEN-LAST:event_bDeleteActionPerformed

    private void bSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearchActionPerformed
        // TODO add your handling code here:
        String CURP = tfCURP.getText();
        
        List<Student> studentList = studentBLO.findByCurp(CURP);
        if(!studentList.isEmpty())
        {
            refreshTable(studentList);
        }
        
        
    }//GEN-LAST:event_bSearchActionPerformed

    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExitActionPerformed
        // TODO add your handling code here:
        studentBLO.commitChanges();
        subjectBLO.commitChanges();
        this.dispose();
        
        MainWindow window = new MainWindow();
        window.setVisible(true);
    }//GEN-LAST:event_bExitActionPerformed

    private void tblAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlumnosMouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel dtm = (DefaultTableModel) tblAlumnos.getModel();
        int selectedRowIndex = tblAlumnos.getSelectedRow();
        String CURP = (String) dtm.getValueAt(selectedRowIndex, 0);
        List<Student> studentList = studentBLO.findByCurp(CURP);
        Student student = studentList.get(0);
        
        String firstName = student.getNombre();
        String secundName = student.getSegundoNombre();
        String fathersLastName = student.getApellidoPaterno();
        String mothersLastName = student.getApellidoMaterno();
        String birthDate = student.getFechaNacimiento();
        String sex = student.getSexo();
        String state = student.getEstado();
       
        tfCURP.setText(CURP);
        tfPrimerNombre.setText(firstName);
        tfSegundoNombre.setText(secundName);
        tfApellidoPaterno.setText(fathersLastName);
        tfApellidoMaterno.setText(mothersLastName);
        tfEstado.setText(state);
        tfGenero.setText(sex);
        tfFechaNacimiento.setText(birthDate);
        
        List<Subject> subjectList = studentList.get(0).getMaterias();
        
        List<String> nombreMateriasAlumno = new ArrayList<>();
        
        for(int i = 0; i < subjectList.size(); i++)
        {
            nombreMateriasAlumno.add(subjectList.get(i).getNombre());
        }
        
        for(int i = 0; i < nombreMateriasAlumno.size(); i++)
        {
            if(nombresMaterias.contains(nombreMateriasAlumno.get(i)))
            {
                nombresMaterias.remove(nombreMateriasAlumno.get(i));
            }
        }
        
        cbMaterias.setModel(new DefaultComboBoxModel(nombresMaterias.toArray()));
        refreshSubjectsTable(subjectList);
        
    }//GEN-LAST:event_tblAlumnosMouseClicked

    private void bRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRefreshActionPerformed
        // TODO add your handling code here:
         refreshTable(studentBLO.findAll());
         clearSubjectsTable();
    }//GEN-LAST:event_bRefreshActionPerformed

    private void tfCURPPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tfCURPPropertyChange
        // TODO add your handling code here:
        for(int i = 0; i < nombresMateriasAlumno.size(); i++)
        {
            if(!nombresMaterias.contains(nombresMateriasAlumno.get(i)))
            {
                nombresMaterias.set(i, "");
            }
        }
        
        cbMaterias.setModel(new DefaultComboBoxModel(nombresMaterias.toArray()));
    }//GEN-LAST:event_tfCURPPropertyChange

    private void bSignUpSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSignUpSubjectActionPerformed
        // TODO add your handling code here:
        String subjectName = cbMaterias.getSelectedItem().toString();
        String CURP = tfCURP.getText();
        
        List<Subject> subjects = subjectBLO.findByName(subjectName);
        Subject subject = subjects.get(0);
        List<Student> students = studentBLO.findByCurp(CURP);
        Student student = students.get(0);
        
        student.getMaterias().add(subject);
        refreshSubjectsTable(student.getMaterias());
        
        
        Student auxStudent = new Student(student.getNombre(), student.getSegundoNombre(), student.getApellidoPaterno(), student.getApellidoMaterno(), student.getFechaNacimiento(), student.getEstado(), student.getSexo(), student.getCurp());
        subject.getAlumnos().add(auxStudent);
        
    }//GEN-LAST:event_bSignUpSubjectActionPerformed

    private void refreshTable(List<Student> studentList)
    {
        clearTable();
        
        DefaultTableModel dtm = (DefaultTableModel) tblAlumnos.getModel();
        Object[] emptyRow = {""};
        
        for (int i = 0; i < studentList.size(); i++) {
            dtm.addRow(emptyRow);
            dtm.setValueAt(studentList.get(i).getCurp(), i, 0);
            dtm.setValueAt(studentList.get(i).getNombre() + " " + studentList.get(i).getSegundoNombre() , i, 1);
            dtm.setValueAt(studentList.get(i).getApellidoPaterno() + " " + studentList.get(i).getApellidoMaterno() , i, 2);
            dtm.setValueAt(studentList.get(i).getFechaNacimiento(), i, 3);
            dtm.setValueAt(studentList.get(i).getSexo(), i, 4);
            dtm.setValueAt(studentList.get(i).getEstado(), i, 5);
        }
    }
    
    private void refreshSubjectsTable(List<Subject> subjectList)
    {
        clearSubjectsTable();
        
        DefaultTableModel dtm = (DefaultTableModel) tblMaterias.getModel();
        Object[] emptyRow = {""};
        
        for (int i = 0; i < subjectList.size(); i++) {
            dtm.addRow(emptyRow);
            dtm.setValueAt(subjectList.get(i).getNombre(), i, 0);
            dtm.setValueAt(subjectList.get(i).getDocente(), i, 1);
        }
    }
    
    private void clearTable()
    {
        DefaultTableModel dtm = (DefaultTableModel) tblAlumnos.getModel();
        while(dtm.getRowCount()>0)
        {
            dtm.removeRow(0);
        }
    }
    private void clearSubjectsTable()
    {
        DefaultTableModel dtm = (DefaultTableModel) tblMaterias.getModel();
        while(dtm.getRowCount()>0)
        {
            dtm.removeRow(0);
        }
    }
    
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
            java.util.logging.Logger.getLogger(AlumnosWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlumnosWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlumnosWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlumnosWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlumnosWindow().setVisible(true);
            }
        });
    }

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bDelete;
    private javax.swing.JButton bExit;
    private javax.swing.JButton bRefresh;
    private javax.swing.JToggleButton bSave;
    private javax.swing.JToggleButton bSearch;
    private javax.swing.JButton bSignUpSubject;
    private javax.swing.JToggleButton bUpdate;
    private javax.swing.JComboBox<String> cbMaterias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAlumnos;
    private javax.swing.JTable tblMaterias;
    private javax.swing.JTextField tfApellidoMaterno;
    private javax.swing.JTextField tfApellidoPaterno;
    private javax.swing.JTextField tfCURP;
    private javax.swing.JTextField tfEstado;
    private javax.swing.JTextField tfFechaNacimiento;
    private javax.swing.JTextField tfGenero;
    private javax.swing.JTextField tfPrimerNombre;
    private javax.swing.JTextField tfSegundoNombre;
    // End of variables declaration//GEN-END:variables
}