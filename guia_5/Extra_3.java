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
public class Extra_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear una función rellene un vector con números aleatorios, pasándole
        //un arreglo por parámetro. Después haremos otra función o procedimiento
        //que imprima el vector.
       Scanner var=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int N=var.nextInt();
        int []vector = new int[N];
        llenarVector(vector);
         System.out.println("***************************");
        mostrarVector(vector);
    }
    public static void llenarVector(int[]vector){
        for (int i = 0; i < vector.length; i++) {
                vector[i] = (int)(Math.random()*10); 
                
            }
        }
    public static void mostrarVector(int []vector){
      
        for (int elemento:vector) {
                System.out.print(elemento + "\t"); }
                          
        }
    }
    
    
   

