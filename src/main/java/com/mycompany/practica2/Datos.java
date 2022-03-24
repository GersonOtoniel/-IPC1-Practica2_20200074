/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2;

/**
 *
 * @author Gerson
 */
class Datos {
    
    private String Curso;
    private int Nota;
    
    public Datos(String Curso, int Nota){
    
        this.Curso = Curso;
        this.Nota = Nota;
    
    }
    public Datos(String Curso, String Nota){
        this.Curso=Curso;
        this.Nota=Integer.parseInt(Nota);
    
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public int getNota() {
        return Nota;
    }

    public void setNota(int Nota) {
        this.Nota = Nota;
    }
    
}
