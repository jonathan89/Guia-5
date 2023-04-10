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
public class Extra_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa que averigüe si dos vectores de N enteros 
        //son iguales (la comparación deberá detenerse en cuanto se detecte
        //alguna diferencia entre los elementos).
    Scanner var = new Scanner (System.in);
        System.out.println("Ingrese tamaño de los vectores: ");
        int N = var.nextInt();
        int cont=0;
        int[] vector = new int[N];
        for (int i = 0; i < N; i++){
            vector[i]=(int)(Math.random()*10);
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");
        System.out.println("***************");
        int[] vector2 = new int[N];
        for (int i = 0; i < N; i++){
            vector2[i]=(int)(Math.random()*10);
            System.out.print("["+vector2[i]+"]");
        }
        System.out.println("");
        
      
 {                
        for (int i=0 ; i < N; i++) {
            if (vector[i]== vector2[i]){
                System.out.println("Los vectores son iguales en la posición "+(i+1));
                System.out.println("["+vector[i]+"]"+"["+vector2[i]+"]");
            } else {
                System.out.println("Los vectores no son iguales en la posición "+(i+1));
                N=i;
            }}}}}
    
