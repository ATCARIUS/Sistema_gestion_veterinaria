/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author EGOGOD
 */
public class Reserva {
    private Date fecha;
    private String rut_cliente;
    private String nombre_cliente;
    private int codigo_mascota;
    
    public Reserva(){
    }

    public Reserva(Date fecha, String rut_cliente, String nombre_cliente, int codigo_mascota) {
        this.fecha = fecha;
        this.rut_cliente = rut_cliente;
        this.nombre_cliente = nombre_cliente;
        this.codigo_mascota = codigo_mascota;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    public int getCodigo_mascota() {
        return codigo_mascota;
    }

    public void setCodigo_mascota(int codigo_mascota) {
        this.codigo_mascota = codigo_mascota;
    }

    @Override
    public String toString() {
        return "Reserva{" + "fecha=" + fecha + ", rut_cliente=" + rut_cliente + ", nombre_cliente=" + nombre_cliente + ", codigo_mascota=" + codigo_mascota + '}';
    }





}
