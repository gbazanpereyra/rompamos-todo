package com.assassins.todoroto.entities;

import java.util.List;

//Lucho
public class Factura {
    private String id;
    private String nombre;
    private List<String> productos;
    private Double total;

    public Factura(String id, String nombre, List<String> producto, Double total) {
        this.id = id;
        this.nombre = nombre;
        this.productos = producto;
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
        return productos;
    }

    public void setProducto(List<String> producto) {
        this.productos = producto;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
