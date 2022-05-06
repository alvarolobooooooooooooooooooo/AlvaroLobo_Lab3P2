/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alvarolobo_lab3p2;

/**
 *
 * @author agln7
 */
public class Casa extends BienesInmuebles {
    private int numero;
    private String referencia;

    public Casa() {
    }

    public Casa(int numero, String referencia, String direccion, String dimensiones, int id) {
        super(direccion, dimensiones, id);
        this.numero = numero;
        this.referencia = referencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
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
        return "Casa{" + "numero=" + numero + ", referencia=" + referencia + '}';
    }
    
    
    
    
    
}
