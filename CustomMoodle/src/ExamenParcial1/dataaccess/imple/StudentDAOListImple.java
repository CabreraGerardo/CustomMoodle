/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenParcial1.dataaccess.imple;

import ExamenParcial1.dataaccess.StudentDAO;
import ExamenParcial1.model.Student;
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
public class StudentDAOListImple implements StudentDAO{

     private static List<Student> studentList = new ArrayList<>();  
    
    @Override
    public Student save(Student student) {
        
        String CURP = getCURP(student);
        
        student.setCurp(CURP);
        
        studentList.add(student);
        return student;
    }

    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public List<Student> findByCurp(String CURP) {
        
        List<Student> resStudentList = new ArrayList<>();
        CURP = CURP.toLowerCase().trim();
        
        for(Student student:studentList)
        {
            if(student.getCurp().toLowerCase().contains(CURP))
            {
                resStudentList.add(student);
            }
        }
        return resStudentList;
    }

    @Override
    public void delete(Student student) {
         studentList.remove(student);
    }

    @Override
    public void update(Student student) {
        int pos = studentList.indexOf(student);
        String CURP = getCURP(student);
        student.setCurp(CURP);
        studentList.set(pos , student);
    }

    @Override
    public void load() {
        try{
            Gson gson = new Gson();
            BufferedReader br = new BufferedReader(new FileReader("examStudent.json"));
            
            studentList = gson.fromJson(br, new TypeToken<List<ExamenParcial1.model.Student>>(){
            }.getType());
            br.close();
            
            if(studentList == null)
            {
                studentList = new ArrayList<>();
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
            FileWriter writer = new FileWriter("examStudent.json");
            writer.write(gson.toJson(studentList));
            writer.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    
    //METODO PARA SACAR CURP
    private String getCURP(Student student)
    {
        String name = student.getNombre();
        
        if(name.equals("José") || name.equals("Jose") || name.equals("JOSE") || name.equals("JOSÉ"))
        {
            name = student.getSegundoNombre();
        }
        else if(name.equals("María") || name.equals("Maria") || name.equals("MARÍA") || name.equals("MARIA"))
        {
            name = student.getSegundoNombre();
        }
        
        String[] fechaNacimiento = student.getFechaNacimiento().split("-");
        
        String aPaterno = student.getApellidoPaterno();
        String aMaterno =  student.getApellidoMaterno();
        String diaNac = fechaNacimiento[0];
        String mesNac = fechaNacimiento[1];
        String anoNac = fechaNacimiento[2];
        String estado = student.getEstado();
        
        String genero = student.getSexo();
        
        String inicialAPaterno = Character.toString(aPaterno.charAt(0)).toUpperCase();
        String vocalAPaterno = Character.toString(aPaterno.charAt(1)).toUpperCase();
        String inicialAMaterno = Character.toString(aMaterno.charAt(0)).toUpperCase();
        String inicialNombre = Character.toString(name.charAt(0)).toUpperCase();
        
        String consonantePaterno = Character.toString(aPaterno.charAt(0)).toUpperCase();
        String consonanteMaterno = Character.toString(aMaterno.charAt(0)).toUpperCase();
        String consonanteNombre = Character.toString(name.charAt(0)).toUpperCase();
        
        char aux;
        String aux1;
        for(int i = 1; i < aPaterno.length(); i++)
        {
            aux = aPaterno.charAt(i);
            aux1 = "" + aux;
            if(aux1.equals("a") && aux1.equals("e") && aux1.equals("i") && aux1.equals("o") && aux1.equals("u"))
            {
                vocalAPaterno = Character.toString(aux).toUpperCase();
            }
        }
        
        for(int i = 1; i < aPaterno.length(); i++)
        {
            aux = aPaterno.charAt(i);
            aux1 = "" + aux;
            if(!aux1.equals("a") && !aux1.equals("e") && !aux1.equals("i") && !aux1.equals("o") && !aux1.equals("u"))
            {
                consonantePaterno = Character.toString(aux).toUpperCase();
                i = aPaterno.length();
            }
        }
        for(int i = 1; i < aMaterno.length(); i++)
        {
            aux = aMaterno.charAt(i);
            aux1 = "" + aux;
            if(!aux1.equals("a") && !aux1.equals("e") && !aux1.equals("i") && !aux1.equals("o") && !aux1.equals("u"))
            {
                consonanteMaterno = Character.toString(aux).toUpperCase();
                i = aMaterno.length();
            }
        }
        for(int i = 1; i < name.length(); i++)
        {
            aux = name.charAt(i);
            aux1 = "" + aux;
            if(!aux1.equals("a") && !aux1.equals("e") && !aux1.equals("i") && !aux1.equals("o") && !aux1.equals("u"))
            {
                consonanteNombre = Character.toString(aux).toUpperCase();
                i = name.length();
            }
        }
        
        String CURP;
        
        CURP = inicialAPaterno + vocalAPaterno + inicialAMaterno + inicialNombre + anoNac + mesNac + diaNac + genero + estado + consonantePaterno + consonanteMaterno + consonanteNombre;
        
        return CURP;
    }
    
}
