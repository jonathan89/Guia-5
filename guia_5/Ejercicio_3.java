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
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un algoritmo que llene un vector de tamaño N con 
        //valores aleatorios y le pida al usuario un número a buscar en el
        //vector. El programa mostrará dónde se encuentra el numero y si se encuentra repetido
        Scanner var=new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector: ");
        int N = var.nextInt();
        int[] vector = new int[N];
        int cont=0;        
        for (int i = 0; i < N; i++) {            
           vector[i]= (int)(Math.random()*100);  
            System.out.println(vector[i]);
            }
         System.out.println("Ingrese el número que desea buscar: ");
            int num= var.nextInt();
         for (int i = 0; i < N; i++) {
             
             if (vector[i]== num){
               cont++;
               System.out.println("El número se encuentra en la posición "+ i);
             }
         }
         System.out.println("El número se repitió "+cont+" veces.");
        }
 
    }
    
    
