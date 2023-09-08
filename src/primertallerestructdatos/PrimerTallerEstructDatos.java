/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primertallerestructdatos;

/**
 *
 * @author danie
 */
public class PrimerTallerEstructDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Estudiante e = new Estudiante("Daniel", "Prada", (byte)18, "systems engineering", (byte)5);
            e.saludar();
            e.setEdad((byte)18);
            System.out.println(e.getEdad());
            System.out.println(e.getApellido());
    }
    
}
