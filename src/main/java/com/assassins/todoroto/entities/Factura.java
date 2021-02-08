package com.assassins.todoroto.entities;

import java.util.List;

//Lucho
public class Factura {
    private String id;
    private String nombre;
    private List<String> producto;
    private Double total;

    public Factura(String id, String nombre, List<String> producto, Double total) {
        this.id = id;
        this.nombre = nombre;
        this.producto = producto;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getProducto() {
        return producto;
    }

    public void setProducto(List<String> producto) {
        this.producto = producto;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
