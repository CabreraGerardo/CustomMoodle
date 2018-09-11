/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenParcial1.dataaccess.imple;

import ExamenParcial1.dataaccess.SubjectDAO;
import ExamenParcial1.model.Subject;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gerardo Cabrera
 */
public class SubjectDAOListImple implements SubjectDAO{

    List<Subject> subjectList = new ArrayList<>();
    

    @Override
    public Subject save(Subject subject) {
        subjectList.add(subject);
        return subject;
    }
    
    @Override
    public List<Subject> findAll() {
        return subjectList;
    }

    @Override
    public List<Subject> findByName(String name) {
        List<Subject> resSubjectList = new ArrayList<>();
        name = name.toLowerCase().trim();
        
        for(Subject subject:subjectList)
        {
            if(subject.getNombre().toLowerCase().contains(name))
            {
                resSubjectList.add(subject);
            }
        }
        return resSubjectList;
    }

    @Override
    public void update(Subject subject) {
        int pos = subjectList.indexOf(subject);
        subjectList.set(pos , subject);
    }

    @Override
    public void load() {
        try{
            Gson gson = new Gson();
            BufferedReader br = new BufferedReader(new FileReader("examSubject.json"));
            
            subjectList = gson.fromJson(br, new TypeToken<List<ExamenParcial1.model.Subject>>(){
            }.getType());
            br.close();
            
            if(subjectList == null)
            {
                subjectList = new ArrayList<>();
            }
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }        
    }

    @Override
    public void commitChanges() {
        try{
            Gson gson = new Gson();
            FileWriter writer = new FileWriter("examSubject.json");
            writer.write(gson.toJson(subjectList));
            writer.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }

    
}
