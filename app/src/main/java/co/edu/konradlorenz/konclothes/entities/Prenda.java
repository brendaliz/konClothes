package co.edu.konradlorenz.konclothes.entities;

import java.util.ArrayList;

public class Prenda {

    private String nombre;
    private String descripcion;
    private int imagen;
    private int valor;
    private ArrayList<String> colores;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public ArrayList<String> getColores() {
        return colores;
    }

    public void setColores(ArrayList<String> colores) {
        this.colores = colores;
    }

    public Prenda(String nombre, String descripcion, int imagen, int valor, ArrayList<String> colores) {

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.valor = valor;
        this.colores = colores;
    }
}
