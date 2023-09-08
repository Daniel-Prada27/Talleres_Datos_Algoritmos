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

    protected float salario;
    protected String unidad;
    protected byte añosTrabajando;

    public Empleado(String nombre, String apellido, byte edad, float salario) {
        super(nombre, apellido, edad);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
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
        System.out.println("Hi, my name's " + nombre + " " + apellido + ", I'm " + edad + " years old and I'm working on the "
                + unidad + " unit ");
    }
    
}
