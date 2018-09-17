/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegoalborrojas_luispotteherrera;

/**
 *
 * @author lpotte
 */
public class Main {

    static int inf = 9999999;
    static int[][] ad = {
        {0, 1, 1, 0, 1},
        {1, 0, 1, 1, 1},
        {1, 1, 0, 1, 1},
        {0, 1, 1, 0, 0},
        {1, 1, 1, 0, 0}};
    static int[][] distancia = {
        {0, 1, 14, inf, 2},
        {1, 0, 7, 3, 5},
        {14, 7, 0, 9, 11},
        {inf, 3, 9, 0, inf},
        {2, 5, 11, inf, 0}};
    static Object[][] caminos = {
        {null, 1, 2, 3, 4},
        {0, null, 2, 3, 4},
        {0, 1, null, 3, 4},
        {0, 1, 2, null, 4},
        {0, 1, 2, 3, null}};

    public static void FW() {
        int s;
        for (int i = 0; i < distancia.length; i++) {
            for (int j = 0; j < distancia.length; j++) {
                for (int k = 0; k < distancia.length; k++) {
                    s = distancia[i][k] + distancia[k][j];
                    if (s < distancia[i][j]) {
                        distancia[i][j] = s;
                        caminos[i][j] = k;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Matriz de distancia iniical: \n");
        for (int i = 0; i < distancia.length; i++) {
            for (int j = 0; j < distancia.length; j++) {
                System.out.print("\t" + distancia[i][j]);
                if (j == distancia.length - 1) {
                    System.out.println("");
                }
            }
        }
        System.out.println("\n Matriz de menor distanica despues del algoritmo  Floyd-Warshall: \n");
        FW();
        for (int i = 0; i < distancia.length; i++) {
            for (int j = 0; j < distancia.length; j++) {
                System.out.print("\t" + distancia[i][j]);
                if (j == distancia.length - 1) {
                    System.out.println("");
                }
            }
        }
        System.out.println("\n Matriz de camino resultante: \n");
        for (int i = 0; i < caminos.length; i++) {
            for (int j = 0; j < caminos.length; j++) {
                System.out.print("\t" + caminos[i][j]);
                if (j == caminos.length - 1) {
                    System.out.println("");
                }
            }
        }
    }

}
