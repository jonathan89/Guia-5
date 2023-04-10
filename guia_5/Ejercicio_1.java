/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5;

import java.util.Scanner;
import org.omg.CORBA.UnionMemberHelper;

/**
 *
 * @author Yesica Rocio Gill
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner (System.in);
        String[] Equipo = new String[8];
        String nombre;
        for (int i = 0; i < 8; i++) {
            System.out.println("Ingrese el nombre del integrante n°"+(i+1));
            nombre = leer.nextLine();
            Equipo[i]= nombre;
        }
        for (int i = 0; i < 8; i++) {
        	System.out.println("[" + Equipo[i] + "]");
    	}
   	 
}

    }
    

