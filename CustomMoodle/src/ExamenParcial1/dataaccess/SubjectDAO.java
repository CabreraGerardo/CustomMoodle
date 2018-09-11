/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenParcial1.dataaccess;

import ExamenParcial1.model.Subject;
import java.util.List;

/**
 *
 * @author Gerardo Cabrera
 */
public interface SubjectDAO {
    
    public Subject save(Subject subject);
    
    public List<Subject> findAll();
    
    public List<Subject> findByName(String name);
    
    public void update(Subject subject);
    
    public void load();
    
    public void commitChanges();
    
}
