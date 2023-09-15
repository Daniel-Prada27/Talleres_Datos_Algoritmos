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

    private byte numCursos;
    private float promedio;
    private String programa;
    protected String educationLevel;
    private byte semester;

    public Estudiante(String nombre, String apellido, byte edad, String programa, byte numCursos) {
        super(nombre, apellido, edad);
        this.programa = programa;
        this.numCursos = numCursos;
        this.promedio = 0;
        this.educationLevel = "\b";
        this.semester = 1;
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

    public byte getSemester() {
        return semester;
    }

    public void setSemester(byte semester) {
        this.semester = semester;
    }

    @Override
    public void saludar() {
        super.saludar();
        System.out.println(" and I'm studying " + educationLevel + " " + programa + ", currently taking " + numCursos +
                " courses on the " + semester + " semester, with an average of " + promedio);
    }

}
