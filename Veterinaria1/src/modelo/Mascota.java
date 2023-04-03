/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author EGOGOD
 */
public class Mascota {

    private String raza;
    private String color;
    private int peso;
    private int codigo_mascota;
    private String nombre_mascota;
    public Mascota() {
    }

    public Mascota(String raza, String color, int peso, int codigo_mascota, String nombre_mascota) {
        this.raza = raza;
        this.color = color;
        this.peso = peso;
        this.codigo_mascota = codigo_mascota;
        this.nombre_mascota = nombre_mascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getCodigo_mascota() {
        return codigo_mascota;
    }

    public void setCodigo_mascota(int codigo_mascota) {
        this.codigo_mascota = codigo_mascota;
    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    @Override
    public String toString() {
        return "Mascota{" + "raza=" + raza + ", color=" + color + ", peso=" + peso + ", codigo_mascota=" + codigo_mascota + ", nombre_mascota=" + nombre_mascota + '}';
    }




}
    

    
