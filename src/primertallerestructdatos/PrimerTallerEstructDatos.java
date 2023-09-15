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

        // Instancia de Persona
        Persona person = new Persona("Alex", "Perez", (byte) 13);

        // Instancia de Estudiante y Empleado
        Estudiante estudent = new Estudiante("Jorge", "Peralta", (byte) 19, "medicine", (byte) 6);
        Empleado employee = new Empleado("Harvey", "Specter", (byte) 39, 400000);

        //  Instancia de Pregrado y Posgrado
        Pregrado pregraduate = new Pregrado("Daniel", "Prada", (byte) 18, "systems engineering", (byte) 5);
        Posgrado postgraduate = new Posgrado("Guillermo", "Jaimes", (byte) 27, "computer science", (byte) 3);

        //Instancia de Profesor y Administrativo
        Profesor teacher = new Profesor("Hoover", "Rueda", (byte) 30, 6000000);
        Administrativo admin = new Administrativo("Carolina", "Cherry", (byte) 40, 8000000);

        //Instancia de Maestria y Posgrado
        Maestria master = new Maestria("Victor", "Bach", (byte) 37, "data analytics", (byte) 3);
        Doctorado doctor = new Doctorado("Raymond", "Holt", (byte) 57, "cybersecurity", (byte) 3);

        // Establecer atributos
        estudent.setPromedio((float) 3.9);
        pregraduate.setEdad((byte) 18);
        pregraduate.setPromedio((float) 4.5);
        postgraduate.setPromedio((float) 4.3);
        postgraduate.setSemester((byte) 5);
        master.setPromedio((float) 4.7);
        master.setSemester((byte) 7);
        doctor.setSemester((byte) 2);
        doctor.setPromedio((float) 4.1);
        employee.setAñosTrabajando((byte) 3);
        admin.setAñosTrabajando((byte) 7);
        teacher.setAñosTrabajando((byte) 1); // Por defecto, los años que lleva trabajando son cero (0)

        // Saludos
        System.out.print("Persona:  ");
        person.saludar();
        System.out.print("\n\nEstudiante:  ");
        estudent.saludar();
        System.out.print("\nPregrado:  ");
        pregraduate.saludar();
        System.out.print("\nPosgrado:  ");
        postgraduate.saludar();
        System.out.print("\nMaestria:  ");
        master.saludar();
        System.out.print("\nDoctorado:  ");
        doctor.saludar();
        System.out.print("\nEmpleado:  ");
        employee.saludar();
        System.out.print("\nProfesor:  ");
        teacher.saludar();
        System.out.print("\nAdministrativo:  ");
        admin.saludar();

        // Sección de ordenamiento
        System.out.println("\nListas ordenadas:");
        int[] list = {1, 4, 2, 5, 3};
        System.out.println(Arrays.toString(ordenarNumeros(list, "ascendente")));

        // Lo desordenamos de nuevo;
        int[] secondList = {1, 2, 4, 5, 3};
        System.out.println(Arrays.toString(ordenarNumeros(secondList, "descendente")));

        String[] strings = {"aa", "b", "abcc", "ccc"};
        System.out.println(Arrays.toString(ordenarStrings(strings, "ascendente")));

        // Sección de ordenamiento de strings
        System.out.println("\nStrings ordenados");
        String[] segundoStrings = {"aa", "b", "abcc", "ccc"};
        System.out.println(Arrays.toString(ordenarStrings(segundoStrings, "descendente")));

        // Suma recursiva
        System.out.println("\nSuma(4) = " + Recursion.encontrarSuma(4));
        
        
        // Punto 1.3
        int[] notasAlumnos = {100, 100, 78, 71, 89, 7, 42, 99, 3, 20, 74, 48, 67, 95, 14, 5, 60, 86, 29, 1, 91, 39, 50, 25, 8, 70, 61, 16, 84, 73, 2, 69, 88, 10, 45, 26, 64, 30, 76, 93, 55, 12, 80, 37, 58, 27, 68, 96, 21, 9, 47, 83, 72, 6, 40, 85, 19, 71, 54, 13, 81, 34, 53, 23, 82, 66, 15, 44, 97, 4, 62, 35, 87, 51, 33, 63, 31, 79, 28, 59, 22, 90, 38, 75, 17, 77, 98, 43, 65, 41, 94, 49, 24, 0, 52};
        System.out.println("\nFrecuencia de notas por encima de 70, siendo el primer elemento la cantidad de 71's");
        freq(notasAlumnos);
        
        // Ejecucion de fibonacci optimizado
        System.out.println("");
        System.out.println("\nResultado: " + Recursion.fib(6));
    }

    public static int[] ordenarNumeros(int[] vector, String tipoOrden) {

//        Aprendí insertion sort leyendo Introduction to Algorithms Fourth Edition de Thomas H. Cormen, Charles E. Leiserson,
//        Ronald L. Rivest, Clifford Stein
        switch (tipoOrden) {
            case "ascendente" -> {
                for (int i = 1; i < vector.length; i++) {
                    int picked = vector[i];
                    int prev = i - 1;

                    while ((prev >= 0) && (picked < vector[prev])) {
                        vector[prev + 1] = vector[prev];
                        prev--;
                    }

                    vector[prev + 1] = picked;
                }
            }
            case "descendente" -> {
                for (int i = 1; i < vector.length; i++) {
                    int picked = vector[i];
                    int prev = i - 1;
                    // El cambio está en picked > vector[prev]
                    while ((prev >= 0) && (picked > vector[prev])) {
                        vector[prev + 1] = vector[prev];
                        prev--;
                    }

                    vector[prev + 1] = picked;
                }
            }
            default ->
                System.out.println("Especifiacion de ordenamiento no valida, el vector no sera alterado");
        }

        return vector;
    }

    //Misma lógica que ordenarNumeros, pero con distinto tipo de dato
    public static String[] ordenarStrings(String[] vector, String tipoOrden) {

        switch (tipoOrden) {

            case "ascendente" -> {

                for (int i = 1; i < vector.length; i++) {
                    String picked = vector[i];
                    int prev = i - 1;

                    while ((prev >= 0) && (picked.length() < vector[prev].length())) {
                        vector[prev + 1] = vector[prev];
                        prev--;
                    }

                    vector[prev + 1] = picked;
                }

            }

            case "descendente" -> {

                for (int i = 1; i < vector.length; i++) {
                    String picked = vector[i];
                    int prev = i - 1;
                    // El cambio está en picked > vector[prev]
                    while ((prev >= 0) && (picked.length() > vector[prev].length())) {
                        vector[prev + 1] = vector[prev];
                        prev--;
                    }

                    vector[prev + 1] = picked;
                }
            }
            default ->
                System.out.println("Especifiacion de ordenamiento no valida, el vector no sera alterado");
        }

        return vector;

    }

    public static void freq(int[] notas) {

        Integer[] result = new Integer[30];
        for (int i = 0; i < result.length; i++) {
            result[i] = 0;
        }

        for (int i = 0; i < notas.length; i++) {
            if ((notas[i] > 70) && (notas[i] < 101)) {
                result[notas[i] - 71] += 1;
            }
        }

        System.out.println(Arrays.toString(result));

    }
}
