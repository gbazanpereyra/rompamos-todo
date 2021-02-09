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
<<<<<<< HEAD
        return "El cliente se llama nombreMarti "+ nombre + " y se apellidoFerra "+ apellido + "^^";
>>>>>>> fab5d21e7bc912be67df2e9e92116231469a7177
    }
}
