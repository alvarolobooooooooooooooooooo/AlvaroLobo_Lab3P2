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
public class Cliente {
    String nombre;
    int edad;
    int id;
    String usuario;
    Object pass;
    BienesInmuebles bien;

    public Cliente() {
    }
    

    public Cliente(String nombre, int edad, int id, String usuario, Object pass) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.usuario = usuario;
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Object getPass() {
        return pass;
    }

    public void setPass(Object pass) {
        this.pass = pass;
    }

    public BienesInmuebles getBien() {
        return bien;
    }

    public void setBien(BienesInmuebles bien) {
        this.bien = bien;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", edad=" + edad + ", id=" + id + ", usuario=" + usuario + ", pass=" + pass + '}';
    }
    
    
}
