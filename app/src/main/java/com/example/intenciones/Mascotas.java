package com.example.intenciones;

public class Mascotas {

    //variables
    private String nombre, edad,raza,numero;
    private int idImagen;

    public Mascotas(String nombre, String edad, String raza, String numero, int idImagen) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.numero = numero;
        this.idImagen = idImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }

    @Override
    public String toString() {
        return "Mascotas{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", raza='" + raza + '\'' +
                ", numero='" + numero + '\'' +
                ", idImagen=" + idImagen +
                '}';
    }
}
