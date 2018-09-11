/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenParcial1.buisnesslogic;

import ExamenParcial1.dataaccess.SubjectDAO;
import ExamenParcial1.dataaccess.imple.SubjectDAOListImple;
import ExamenParcial1.model.Subject;
import java.util.List;

/**
 *
 * @author Gerardo Cabrera
 */
public class SubjectBLO {
    SubjectDAO subjectDAO;
    
    public SubjectBLO()
    {
        subjectDAO = new SubjectDAOListImple();
    }
    
    public Subject save(Subject subject)
    {
        subjectDAO.save(subject);
        return subject;
    }
    
    public List<Subject> findAll()
    {
        return subjectDAO.findAll();
    }
    
    public List<Subject> findByName(String name)
    {
        return subjectDAO.findByName(name);
    }
    
    public void update(Subject subject)
    {
        subjectDAO.update(subject);
    }
    
    public void load()
    {
        subjectDAO.load();
    }
    
    public void commitChanges()
    {
        subjectDAO.commitChanges();
    }
}
