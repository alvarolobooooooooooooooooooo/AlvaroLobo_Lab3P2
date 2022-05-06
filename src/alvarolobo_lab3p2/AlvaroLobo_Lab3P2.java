/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alvarolobo_lab3p2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author agln7
 */
public class AlvaroLobo_Lab3P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea = new Scanner(System.in);
        Residencial r = null;
        ArrayList <Residencial> residenciales = new ArrayList();
        int opcion = 1;
        while(opcion != 0){
            System.out.println("=====================================");
            System.out.println("                Menu                    ");
            System.out.println("=====================================");
            System.out.println("");
            System.out.println("1. Agregar Residencial");
            System.out.println("2. Agregar Bien Inmueble");
            
            System.out.print("Opcion: ");
            opcion = lea.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.print("Nombre de la Residencial: ");
                    lea.nextLine();
                    String nombre = lea.nextLine();
                    r = new Residencial(nombre);
                    residenciales.add(r);
                    System.out.println(residenciales);
                    break;
                    
                case 2:
                    r.agregarBienes();
                    //System.out.println(r.getBienes().get(0).direccion);
                    System.out.println(r);
                    
                    break;
                
            }
        }
    }
    
}
