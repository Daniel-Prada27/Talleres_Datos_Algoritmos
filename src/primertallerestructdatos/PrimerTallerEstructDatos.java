/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primertallerestructdatos;

import java.util.Arrays;

/**
 *
 * @author danie
 */
public class PrimerTallerEstructDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Estudiante est = new Estudiante("Daniel", "Prada", (byte)18, "systems engineering", (byte)5);
            Profesor prof = new Profesor("Hoover", "Rueda", (byte)30, 6000000);
            est.saludar();
            est.setEdad((byte)18);
            System.out.println(est.getEdad());
            System.out.println(est.getApellido());
            
            prof.saludar();
            
            int[] list = {1,4,2,5,3};
            System.out.println(Arrays.toString(ordenarNumeros(list, "ascendente")));
            
            // Lo desordenamos de nuevo;
            int[] secondList = {1,2,4,5,3};
            System.out.println(Arrays.toString(ordenarNumeros(secondList, "descendente")));
            
    }
    
    public static int[] ordenarNumeros(int[] vector, String tipoOrden) {
        
//        Aprendí insertion sort leyendo Introduction to Algorithms Fourth Edition de Thomas H. Cormen, Charles E. Leiserson,
//        Ronald L. Rivest, Clifford Stein
        switch (tipoOrden) {
            case "ascendente" -> {
                for (int i = 1; i < vector.length; i++) {
                    int picked = vector[i];
                    int prev = i-1;
                    
                    while ( (prev >= 0) && (picked < vector[prev]) ) {
                        vector[prev+1] = vector[prev];
                        prev--;
                    }
                    
                    vector[prev+1] = picked;
                }
            }
            case "descendente" -> {
                for (int i = 1; i < vector.length; i++) {
                    int picked = vector[i];
                    int prev = i-1;
                    // El cambio está en picked > vector[prev]
                    while ( (prev >= 0) && (picked > vector[prev]) ) {
                        vector[prev+1] = vector[prev];
                        prev--;
                    }
                    
                    vector[prev+1] = picked;
                }
            }
            default -> System.out.println("Especifiacion de ordenamiento no valida, el vector no sera alterado");
        }
        
        return vector;
    }
    
}
