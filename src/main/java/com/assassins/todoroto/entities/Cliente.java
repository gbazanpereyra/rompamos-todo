package com.assassins.todoroto.entities;

//Martina
public class Cliente {
//HOLA
    private int id;
    private String nombre;
    private String apellido;

    public Cliente(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "CLIENTE: |[" + "nombreMarti = '" + nombre + "', apellidoFerra = '" + apellido + "']|";
    }
}
