/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vista;

/**
 *
 * @author maxtr
 */
public class Pacientes {

    private String nombre, apellido, especialidad, doctor;
    private long  fecha, cedula, telefono;

    public Pacientes(String nombre, String apellido, String especialidad, String doctor, long cedula, long telefono, long fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.doctor = doctor;
        this.cedula = cedula;
        this.telefono = telefono;
        this.fecha = fecha;
    }

    public Pacientes() {
        this.nombre = "";
        this.apellido = "";
        this.especialidad = "";
        this.doctor = "";
        this.cedula = 0;
        this.telefono = 0;
        this.fecha = 0;
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

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
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

    public long getFecha() {
        return fecha;
    }

    public void setFecha(long fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Pacientes{" + "nombre=" + nombre + ", apellido=" + apellido + ", especialidad=" + especialidad + ", doctor=" + doctor + ", cedula=" + cedula + ", telefono=" + telefono + ", fecha=" + fecha + '}';
    }

}
