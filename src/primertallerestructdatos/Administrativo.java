/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primertallerestructdatos;

/**
 *
 * @author danie
 */
public class Administrativo extends Empleado {

    public Administrativo(String nombre, String apellido, byte edad, float salarioAnual) {
        super(nombre, apellido, edad, salarioAnual);
        this.unidad = "administrative";
    }
    
}
