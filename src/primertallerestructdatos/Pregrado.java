/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primertallerestructdatos;

/**
 *
 * @author danie
 */
public class Pregrado extends Estudiante {

    public Pregrado(String nombre, String apellido, byte edad, String programa, byte numCursos) {
        super(nombre, apellido, edad, programa, numCursos);
        this.educationLevel = "an undergraduate in";
    }

}
