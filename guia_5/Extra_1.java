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
public class Extra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un algoritmo que calcule la suma de todos los elementos de 
        //un vector de tamaño N, con los valores ingresados por el usuario.
       Scanner var = new Scanner (System.in);
        System.out.println("Ingrese tamaño del vector: ");
        int N = var.nextInt();
        int cont=0;
        int[] vector = new int[N];
        for (int i = 0; i < N; i++){
            System.out.println("Ingrese el valor del vector en posición " +(i+1));
            vector[i]=var.nextInt();
            cont+=vector[i];            
        }
        System.out.println("La suma de los valores en el vector es igual a "+cont);
    }
    
}
