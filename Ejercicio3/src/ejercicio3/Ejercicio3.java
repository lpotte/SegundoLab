/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author jwalvarez
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea = new Scanner(System.in);
        System.out.print("n: ");
        int n = lea.nextInt();
        long cuantos
        //*********************************
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                for (int c = 1; c <= n; c++) {
                    if (4*a*c <= b*b) {
                        double r1 = (-b + sqrt((b*b)-(4*a*c)))/2*a;
                        double r2 = (-b - sqrt((b*b)-(4*a*c)))/2*a;
                        System.out.println("r1: " + r1 + " || r2: " + r2);
                        System.out.println(" -----> a=" + a + ", b=" + b + ", c=" + c);
                    }
                }
            }
        }

    }

}
