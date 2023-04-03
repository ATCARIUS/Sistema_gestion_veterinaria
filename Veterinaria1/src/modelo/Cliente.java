/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author EGOGOD
 */
public class Cliente {
    private String rut_cliente;
    private String nombre_cliente;
    private int telefono_cliente;
    private String direccion_cliente;
    private int codigo_mascota;
     public Cliente(){
         
     }

    public Cliente(String rut_cliente, String nombre_cliente, int telefono_cliente, String direccion_cliente, int codigo_mascota) {
        this.rut_cliente = rut_cliente;
        this.nombre_cliente = nombre_cliente;
        this.telefono_cliente = telefono_cliente;
        this.direccion_cliente = direccion_cliente;
        this.codigo_mascota = codigo_mascota;
    }

    public String getRut_cliente() {
        return rut_cliente;
    }

    public void setRut_cliente(String rut_cliente) {
        this.rut_cliente = rut_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public int getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(int telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public String getDireccion_cliente() {
        return direccion_cliente;
    }

    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }

    public int getCodigo_mascota() {
        return codigo_mascota;
    }

    public void setCodigo_mascota(int codigo_mascota) {
        this.codigo_mascota = codigo_mascota;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut_cliente=" + rut_cliente + ", nombre_cliente=" + nombre_cliente + ", telefono_cliente=" + telefono_cliente + ", direccion_cliente=" + direccion_cliente + ", codigo_mascota=" + codigo_mascota + '}';
    }

     





}
