/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenParcial1.buisnesslogic;

import ExamenParcial1.dataaccess.StudentDAO;
import ExamenParcial1.dataaccess.imple.StudentDAOListImple;
import ExamenParcial1.model.Student;
import java.util.List;

/**
 *
 * @author Gerardo Cabrera
 */
public class StudentBLO {
    private StudentDAO studentDAO;

    public StudentBLO() {
        studentDAO = new StudentDAOListImple();
    }
    
    public Student save(Student student)
    {
        return studentDAO.save(student);
    }
    
    public List<Student> findAll()
    {
        return studentDAO.findAll();
    }
    
    public List<Student> findByCurp(String Curp)
    {
        return studentDAO.findByCurp(Curp);
    }
    
    public void delete(Student student)
    {
        studentDAO.delete(student);
    }
    
    public void update(Student student)
    {
        studentDAO.update(student);
    }
    
    public void load()
    {
        studentDAO.load();
    }
    
    public void commitChanges()
    {
        studentDAO.commitChanges();
    }
}
