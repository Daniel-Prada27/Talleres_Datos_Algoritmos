/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primertallerestructdatos;

/**
 *
 * @author danie
 */
public class Profesor extends Empleado {

    public Profesor(String nombre, String apellido, byte edad, float salario) {
        super(nombre, apellido, edad, salario);
        this.unidad = "academic";
    }


    
}
