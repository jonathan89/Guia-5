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
public class Extra_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un programa que llene una matriz de tamaño NxM 
        //con valores aleatorios y muestre la suma de sus elementos.
        Scanner var =new Scanner (System.in);
        System.out.println("Ingrese la cantidad de filas");
        int f=var.nextInt();
        System.out.println("Ingrese la cantidad de columnas");
        int c=var.nextInt();
        int cont=0;
        int [][] matriz = new int[f][c];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int)(Math.random()*10+1); 
                cont+=matriz[i][j];
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("La suma de los elementos de la matriz es de "+cont);
    }
    
}
