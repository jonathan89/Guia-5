/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5;

import java.util.Scanner;

/**
 *
 * @author Yesica Rocio Gill
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un algoritmo que llene un vector con los 100 primeros números 
        //enteros y los muestre por pantalla en orden descendente.
        Scanner var=new Scanner(System.in);
        int[] vector = new int[100];        
        for (int i = 0; i < 100; i++) {            
            vector[i]= (i+1);
                    }
   	 for (int i = 0; i < 100; i++) {
        	System.out.println("[" +(100-vector[i]) + "]");
    
    }}
    }

   
   
    
