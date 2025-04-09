/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compuwork2;

/**
 *
 * @author Tecnologia
 */
import java.time.LocalDate;

public class EmpleadoFijo extends Empleado {
    private int añoIngreso;

    public EmpleadoFijo(int idEmpleado, String nombreCompleto, String direccion, String telefono, float salario, Contrato contrato, int añoIngreso) {
        super(idEmpleado, nombreCompleto, direccion, telefono, salario, contrato);
        this.añoIngreso = añoIngreso;
    }

    @Override
    public int calcularAntiguedad() {
        int añoActual = LocalDate.now().getYear(); // Obtener el año actual usando LocalDate
        return añoActual - añoIngreso;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }
}
