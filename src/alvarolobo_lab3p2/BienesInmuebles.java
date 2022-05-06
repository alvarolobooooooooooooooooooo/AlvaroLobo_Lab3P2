/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alvarolobo_lab3p2;

import java.util.Scanner;

/**
 *
 * @author agln7
 */
public class BienesInmuebles {
    protected String direccion;
    protected String dimensiones;
    protected int id;

    

    public BienesInmuebles() {
    }

    public BienesInmuebles(String direccion, String dimensiones, int id) {
        this.direccion = direccion;
        this.dimensiones = dimensiones;
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Casa agregarCasa(){
        Scanner lea = new Scanner(System.in);

        System.out.print("Direccion: ");
        String direccion = lea.nextLine();
        
        System.out.print("Dimensiones: ");
        String dimensiones = lea.nextLine();
        
        System.out.print("ID: ");
        int id = lea.nextInt();
        
        System.out.print("Numero: ");
        int numero = lea.nextInt();
        
        System.out.print("Referencia: ");
        lea.nextLine();
        String referencia = lea.nextLine();
        
        Casa c = new Casa(numero, referencia, direccion, dimensiones, id);
        
        return c;
        
    }
    
    public Apartamento agregarApartamento(){
        Scanner lea = new Scanner(System.in);

        System.out.print("Direccion: ");
        String direccion = lea.nextLine();
        
        System.out.print("Dimensiones: ");
        String dimensiones = lea.nextLine();
        
        System.out.print("ID: ");
        int id = lea.nextInt();
        
        System.out.print("Numero: ");
        int numero = lea.nextInt();
        
        System.out.println("Referencia: ");
        lea.nextLine();
        String referencia = lea.nextLine();
        
        Apartamento a = new Apartamento(numero, referencia, direccion, dimensiones, id);
        return a;
    }
    
    public Edificio agregarEdificio(){
        Scanner lea = new Scanner(System.in);

        System.out.print("Direccion: ");
        String direccion = lea.nextLine();
        
        System.out.print("Dimensiones: ");
        String dimensiones = lea.nextLine();
        
        System.out.print("ID: ");
        int id = lea.nextInt();
        
        System.out.print("Numero de locales: ");
        int numero = lea.nextInt();
        
        System.out.print("Nombre del Edificio: ");
        lea.nextLine();
        String nombre = lea.nextLine();
        
        Edificio e = new Edificio(numero, nombre, direccion, dimensiones, id);
        
        return e;
    }

    @Override
    public String toString() {
        return "Bien{" + "direccion=" + direccion + ", dimensiones=" + dimensiones + ", id=" + id + '}';
    }
    
    
}
