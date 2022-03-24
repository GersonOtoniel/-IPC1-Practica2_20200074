/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Gerson
 */
public class Archivos {
     public void crearArchivo(String texto, String curso){
        
        File nuevo = new File(texto);
        
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(nuevo));
            bw.write(curso);
            bw.close();
            Desktop.getDesktop().open(nuevo);
        } catch(IOException a){
        
        } 
    }
        
        
        
        public String obtenerArchivo(String ruta){
            
            String text ="";
            String encabezado="Curso,Nota";
            try{
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            String linea;
            while((linea = br.readLine()) != null){
                
                if((linea).equals(encabezado)){
                
                
                }else{
                
                    String[] filas = linea.split("\n");
                String[] columnas=filas[0].split(",");
                 //System.out.println(Arrays.toString(filas));
                 Datos dat = new Datos(columnas[0],columnas[1]);
                   // System.out.println(dat.getCurso());
                    System.out.println(dat.getNota());
                
                }
                
            
            
            }
            br.close();
            
            }catch(IOException a){
            }
        
            return text;
        }
}
