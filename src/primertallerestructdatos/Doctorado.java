/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primertallerestructdatos;

/**
 *
 * @author danie
 */
public class Doctorado extends Posgrado {

    public Doctorado(String nombre, String apellido, byte edad, String programa, byte numCursos) {
        super(nombre, apellido, edad, programa, numCursos);
        this.educationLevel = "a PhD in";
    }

}
