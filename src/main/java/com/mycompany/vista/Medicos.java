/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vista;

/**
 *
 * @author maxtr
 */
public class Medicos {

    private String nombre, apellido, especialidad;
    private long cedula, telefono;
    private int id;

    public Medicos(int id, String nombre, String apellido, String especialidad, long cedula, long telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public Medicos() {
        this.id = 0;
        this.nombre = "";
        this.apellido = "";
        this.especialidad = "";
        this.cedula = 0;
        this.telefono = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    @Override
    public String toString() {
        return "Medicos{" + "nombre=" + nombre + ", apellido=" + apellido + ", especialidad=" + especialidad + ", cedula=" + cedula + ", telefono=" + telefono + '}';
    }

}
