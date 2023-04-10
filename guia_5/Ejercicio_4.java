/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Yesica Rocio Gill
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Recorrer un vector de N enteros contabilizando cuántos números 
        // son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
        Scanner leer=new Scanner(System.in);
    
        int[] vector;
        int n;
        Random random = new Random();

        System.out.println("Ingrese el tamaño del vector");
        n = leer.nextInt();
        vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = random.nextInt(1000);
            System.out.println("V[" + i + "] =" + vector[i]);
          
        }
            String tamanio;
            int uno = 0;
            int dos = 0;
            int tres = 0;
            int cuatro= 0;
            int cinco = 0;
        for (int i = 0; i < n; i++) {
            tamanio = String.valueOf(vector[i]);
            switch (tamanio.length()) {
                case 1:
                    uno++;
                    break;
                case 2:
                    dos += 1;
                    break;
                case 3:
                    tres += 1;
                    break;
                case 4:
                    cuatro += 1;
                    break;
                case 5:
                    cinco += 1;
                    break;
            }
        }
        System.out.println("");
        System.out.println("cantidad de numeros de un digito = " + uno);
        System.out.println("cantidad de numeros de dos digitos = " + dos);
        System.out.println("cantidad de numeros de tres digitos = " + tres);
        System.out.println("cantidad de numeros de cuatro digitos = " + cuatro);
        System.out.println("cantidad de numeros de cinco digitos = " + cinco);

    }
}
