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
public class Student {
    private String Nombre;
    private String SegundoNombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private String FechaNacimiento;
    private String Estado;
    private String Sexo;
    private String Curp;
    private List<Subject> Materias = new ArrayList<>();

    public Student() {
        
    }  

    
    public Student(String Nombre, String SegundoNombre, String ApellidoPaterno, String ApellidoMaterno, String FechaNacimiento, String Estado, String Sexo, String Curp) {
        this.Nombre = Nombre;
        this.SegundoNombre = SegundoNombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.FechaNacimiento = FechaNacimiento;
        this.Estado = Estado;
        this.Sexo = Sexo;
        this.Curp = Curp;
    }

    public Student(String Nombre, String SegundoNombre, String ApellidoPaterno, String ApellidoMaterno, String FechaNacimiento, String Estado, String Sexo) {
        this.Nombre = Nombre;
        this.SegundoNombre = SegundoNombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.FechaNacimiento = FechaNacimiento;
        this.Estado = Estado;
        this.Sexo = Sexo;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSegundoNombre() {
        return SegundoNombre;
    }

    public void setSegundoNombre(String SegundoNombre) {
        this.SegundoNombre = SegundoNombre;
    }

    public List<Subject> getMaterias() {
        return Materias;
    }

    public void setMaterias(List<Subject> Materias) {
        this.Materias = Materias;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getCurp() {
        return Curp;
    }

    public void setCurp(String Curp) {
        this.Curp = Curp;
    }
    
    
}
