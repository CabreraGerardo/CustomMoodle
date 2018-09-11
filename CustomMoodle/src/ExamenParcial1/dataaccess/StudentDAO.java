/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenParcial1.dataaccess;

import ExamenParcial1.model.Student;
import java.util.List;

/**
 *
 * @author Gerardo Cabrera
 */
public interface StudentDAO {
    
    public Student save(Student student);
    
    public List<Student> findAll();
    
    public List<Student> findByCurp(String id);
        
    public void delete(Student student);
    
    public void update(Student student);
    
    public void load();
    
    public void commitChanges();
    
}
