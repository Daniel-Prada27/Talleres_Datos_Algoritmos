/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primertallerestructdatos;

/**
 *
 * @author danie
 */
public class Estudiante extends Persona {
    
    protected byte numCursos;
    protected float promedio;
    protected String programa;
    
    public Estudiante(String nombre, String apellido, byte edad, String programa, byte numCursos) {
        super(nombre, apellido, edad);
        this.programa = programa;
        this.numCursos = numCursos;
    }

    public byte getNumCursos() {
        return numCursos;
    }

    public void setNumCursos(byte numCursos) {
        this.numCursos = numCursos;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    @Override
    public void saludar() {
        System.out.println("Hi, my name's " + nombre + " " + apellido + ", I'm " + edad + " years old and I'm studying an under"
                + "graduate in " + programa);
    }
    
}
