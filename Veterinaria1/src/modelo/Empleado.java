/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author EGOGOD
 */
public class Empleado {
 private int codigo_empleado;
 private String nombre_empleado;
 private String rut_empleado;
 private int telefono_empleado;
 
public Empleado(){
 }

    public Empleado(int codigo_empleado, String nombre_empleado, String rut_empleado, int telefono_empleado) {
        this.codigo_empleado = codigo_empleado;
        this.nombre_empleado = nombre_empleado;
        this.rut_empleado = rut_empleado;
        this.telefono_empleado = telefono_empleado;
    }

    public int getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(int codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public String getRut_empleado() {
        return rut_empleado;
    }

    public void setRut_empleado(String rut_empleado) {
        this.rut_empleado = rut_empleado;
    }

    public int getTelefono_empleado() {
        return telefono_empleado;
    }

    public void setTelefono_empleado(int telefono_empleado) {
        this.telefono_empleado = telefono_empleado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "codigo_empleado=" + codigo_empleado + ", nombre_empleado=" + nombre_empleado + ", rut_empleado=" + rut_empleado + ", telefono_empleado=" + telefono_empleado + '}';
    }
 




}
