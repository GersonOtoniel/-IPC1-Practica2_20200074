/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2;

/**
 *
 * @author Gerson
 */
public class Seleccion {
    
    
     public void seleccion(int arreglo[]){
       
        
        for(int i=0; i<arreglo.length-1 ;i++){
        int minimo=i;
        
        
        for(int j=i+1; j<arreglo.length;j++){
            
            if(arreglo[j]<arreglo[minimo]){
                
                minimo = j;
                
            
            }
        }
        
        int aux = arreglo[i];
        arreglo[i] = arreglo[minimo];
        arreglo[minimo] = aux;
        }
        mostrar(arreglo);
    }
    
    
  
    
    public void mostrar(int arreglo[]) {
        int s;
        for (s = 0; s < arreglo.length; s++) {
            System.out.print("{" + arreglo[s] + "}");
        }

        System.out.println();
    }
    
    
    
}
