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
        ArrayList <Cliente> clientes = new ArrayList();
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
            System.out.println("3. Crear cliente");
            System.out.println("4. Reporte ");
            System.out.println("5. Vender");
            System.out.println("6. Listar bienes");
            
            System.out.print("Opcion: ");
            opcion = lea.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.print("Nombre de la Residencial: ");
                    lea.nextLine();
                    String nombre = lea.nextLine();
                    r = new Residencial(nombre);
                    residenciales.add(r);
                    break;
                    
                case 2:
                    for (int i = 0; i < residenciales.size(); i++) {
                        System.out.println(i + " - " + residenciales.get(i));
                    }
                    System.out.println("");
                    System.out.println("En que Residencial desea agregar un bien (posicion): ");
                    opcion = lea.nextInt();
                    
                    residenciales.get(opcion).agregarBienes();
                    System.out.println(r);
                    break;
                    
                case 3:
                    System.out.print("Nombre: ");
                    lea.nextLine();
                    nombre = lea.nextLine();
                    
                    System.out.print("Edad: ");
                    int edad = lea.nextInt();
                    
                    System.out.print("ID: ");
                    int id = lea.nextInt();
                    
                    System.out.print("Usuario: ");
                    lea.nextLine();
                    Object Usuario = lea.nextLine();
                    
                    System.out.print("Contrasena: ");
                    Object pass = lea.nextLine();
                    
                    Cliente c = new Cliente(nombre, edad, id, nombre, pass);
                    clientes.add(c);
                    break;
                    
                case 4:
                    System.out.println(clientes);
                    break;
                    
                case 5:
                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.println(i + " - " + clientes.get(i).getNombre());
                    }
                    System.out.print("Numero de cliente que obtendra un bien: ");
                    opcion = lea.nextInt();
                    
                    for (int i = 0; i < r.getBienes().size(); i++) {
                        System.out.println(i + " - " + r.getBienes().get(i));
                    }
                    
                    int opcionB = lea.nextInt();
                    Cliente c2 = new Cliente();
                    c2.setBien(r.getBienes().get(opcionB));
                    break;
                
                case 6:
                    System.out.println(residenciales);
                    break;
                
            }
        }
    }
    
}
