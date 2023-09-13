/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primertallerestructdatos;

/**
 *
 * @author danie
 */
public abstract class Empleado extends Persona{

    protected float salarioAnual;
    protected String unidad;
    protected byte añosTrabajando;

    public Empleado(String nombre, String apellido, byte edad, float salarioAnual) {
        super(nombre, apellido, edad);
        this.salarioAnual = salarioAnual;
        this.añosTrabajando = 0;
    }

    public float getSalario() {
        return salarioAnual;
    }

    public void setSalario(float salarioAnual) {
        this.salarioAnual = salarioAnual;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public byte getAñosTrabajando() {
        return añosTrabajando;
    }

    public void setAñosTrabajando(byte añosTrabajando) {
        this.añosTrabajando = añosTrabajando;
    }
    
    @Override
    public void saludar() {
        String piece = (añosTrabajando == 1 ? "a year " : añosTrabajando + " years ");
        System.out.println("Hi, my name's " + nombre + " " + apellido + ", I'm " + edad + " years old and I'm working on the "
                + unidad + " unit making " + salarioAnual + " a year. I have been working for " + piece + "in here.");
    }
    
}
