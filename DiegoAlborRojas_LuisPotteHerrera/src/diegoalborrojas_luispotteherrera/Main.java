/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegoalborrojas_luispotteherrera;

import java.util.ArrayList;



/**
 *
 * @author lpotte
 */
public class Main {
    static ArrayList<Vertice> grafo = new ArrayList<>();
    static int inf = 9999999;
    static int[][] ad = {{0, 1, 1, 0, 1},
                        {1, 0, 1, 1, 1},
                        {1, 1, 0, 1, 1},
                        {0, 1, 1, 0, 0},
                        {1, 1, 1, 0, 0}};
    static int[][] distancia ={{0, 1, 14, inf, 2},
                            {1, 0, 7, 3, 5},
                            {14, 7, 0, 9, 11},
                            {inf, 3, 9, 0, inf},
                            {2, 5, 11, inf, 0}};
    static Object[][] caminos ={{null, 1,    2,    3, 4},
                                {0, null,    2,    3, 4},
                                {0,    1, null,    3, 4},
                                {0,    1,    2, null, 4},
                                {0,    1,    2,    3, null}};
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}