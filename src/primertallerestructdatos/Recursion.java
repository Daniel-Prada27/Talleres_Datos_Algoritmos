/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primertallerestructdatos;

/**
 *
 * @author danie
 */
public class Recursion {
    
    public static int encontrarSuma(int n) {
        return (n ==1) ? 1 : n + encontrarSuma(n-1);
    }
    
}
