/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alvarolobo_lab3p2;

import java.util.ArrayList;

/**
 *
 * @author agln7
 */
public class Edificio extends BienesInmuebles{
    private int locales;
    private String nombre;
    private ArrayList <Apartamento> apartamentos = new ArrayList();

    public Edificio(int locales, String nombre, String direccion, String dimensiones, int id) {
        super(direccion, dimensiones, id);
        this.locales = locales;
        this.nombre = nombre;
    }

    public int getLocales() {
        return locales;
    }

    public void setLocales(int locales) {
        this.locales = locales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Apartamento> getApartamentos() {
        return apartamentos;
    }

    public void setApartamentos(ArrayList<Apartamento> apartamentos) {
        this.apartamentos = apartamentos;
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

    @Override
    public String toString() {
        return "Edificio{" + "locales=" + locales + ", nombre=" + nombre + ", apartamentos=" + apartamentos + '}';
    }
    
}
