/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primertallerestructdatos;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author danie
 */
public class Recursion {

    public static int encontrarSuma(int n) {
        return (n == 1) ? 1 : n + encontrarSuma(n - 1);
    }

    private static Map<Integer, Integer> map = new HashMap();

    public static int fib(int n) {

        if (n < 0) {
            System.out.println("La secuencia no tiene posiciones negativas");
            return 0;
        }

        if (n < 2) {
            return n;
        }

        if (map.containsKey(n)) {
            return map.get(n);
        }
        System.out.println("Ejecutando fib(" + n + ")");
        int result = fib(n - 1) + fib(n - 2);
        map.put(n, result);

        return result;
    }

}
