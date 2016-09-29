/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recreation;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class SumSquaredDivisors {

    public static String listSquared(long m, long n) {
        // your code
        StringBuilder result = new StringBuilder("[");
        boolean first=true;
        for (long i = m; i <= n; i++) {
            double somaQuadratica = divisores(i).stream().mapToDouble((Long value) -> Math.pow(value, 2)).sum();
            if (String.valueOf(Math.sqrt(somaQuadratica)).matches("\\d*\\.0")) {
                if (first) {
                    result.append("[").append(i).append(", ").append((long)somaQuadratica).append("]");
                    first=false;
                }else{
                result.append(", [").append(i).append(", ").append((long)somaQuadratica).append("]");
                }
            }
        }
        result.append("]");
        return result.toString();
    }

    public static List<Long> divisores(long numero) {
        List<Long> divisores = new ArrayList<>();
        for (long i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores.add(i);
            }
        }
        return divisores;
    }

    public static boolean raizInteira(double numero) {
        for (int i = 1; i < (numero / 2) + 1; i++) {
            if (i * i == numero) {
                return true;
            }
        }
        return false;
    }

}
