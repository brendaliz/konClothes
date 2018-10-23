package co.edu.konradlorenz.konclothes.entities;

import android.media.Image;

import java.util.ArrayList;

public class Categoria {
    private int nombre;
    private int imagen;
    private ArrayList<Prenda> prendas;
    private String descripcion;

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public ArrayList<Prenda> getPrendas() {
        return prendas;
    }

    public void setPrendas(ArrayList<Prenda> prendas) {
        this.prendas = prendas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Categoria(int nombre, int imagen, String descripcion) {

        this.nombre = nombre;
        this.imagen = imagen;
        this.prendas = new ArrayList<>();
        this.descripcion = descripcion;
    }
}
