/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenParcial1.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gerardo Cabrera
 */
public class Subject {
    private String Nombre;
    private String Docente;
    private List<Student> Alumnos = new ArrayList<>();

    public Subject() {
    }

    public Subject(String Nombre) {
        this.Nombre = Nombre;
    } 

    public Subject(String Nombre, String Docente) {
        this.Nombre = Nombre;
        this.Docente = Docente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }  
    
    public String getDocente() {
        return Docente;
    }

    public void setDocente(String Docente) {
        this.Docente = Docente;
    }

    public List<Student> getAlumnos() {
        return Alumnos;
    }

    public void setAlumnos(List<Student> Alumnos) {
        this.Alumnos = Alumnos;
    }
    
    
    
}
