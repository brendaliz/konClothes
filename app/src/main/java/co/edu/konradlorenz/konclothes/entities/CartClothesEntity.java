package co.edu.konradlorenz.konclothes.entities;

public class CartClothesEntity {
    private int imgFoto;
    private String nombre;
    private String descripcion;
    private String precio;

    public CartClothesEntity(int imgFoto, String nombre, String descripcion, String precio) {
        this.imgFoto = imgFoto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getImgFoto() {
        return imgFoto;
    }

    public void setImgFoto(int imgFoto) {
        this.imgFoto = imgFoto;
    }

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

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
