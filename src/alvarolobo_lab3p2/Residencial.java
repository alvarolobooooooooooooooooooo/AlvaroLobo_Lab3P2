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
public class Residencial {
    private String nombre;
    private ArrayList <BienesInmuebles> bienes = new ArrayList();
    public Residencial() {
    }

    public Residencial(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<BienesInmuebles> getBienes() {
        return bienes;
    }

    public void setBienes(ArrayList<BienesInmuebles> bienes) {
        this.bienes = bienes;
    }
    
    public void agregarBienes(){
        Scanner lea = new Scanner(System.in);
        BienesInmuebles b = new BienesInmuebles();
        System.out.println("===========================");
        System.out.println("     Tipo de Bien Inmueble           ");
        System.out.println("===========================");
        System.out.println("");

        System.out.println("1. Casa");
        System.out.println("2. Apartamento");
        System.out.println("3. Edificio");

        System.out.println("Opcion: ");
        int opcion = lea.nextInt();
        
        switch(opcion){
            case 1:
                Casa c = b.agregarCasa();
                bienes.add(c);
                
                break;
                
            case 2:
                Apartamento a = b.agregarApartamento();
                bienes.add(a);
                break;
        }
    }

    @Override
    public String toString() {
        return nombre + " " + bienes;
    }
    
}
