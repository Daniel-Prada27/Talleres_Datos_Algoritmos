/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primertallerestructdatos;

/**
 *
 * @author danie
 */
public class Maestria extends Posgrado {

    public Maestria(String nombre, String apellido, byte edad, String programa, byte numCursos) {
        super(nombre, apellido, edad, programa, numCursos);
        this.educationLevel = "a master's in";
    }

}
