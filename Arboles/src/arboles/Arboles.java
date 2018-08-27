/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

/**
 *
 * @author jbojato
 */
public class Arboles {

    /**
     * @param args the command line arguments
     */
    class Nodo {
   Nodo raiz;
   Nodo info;
   Nodo izq;
   Nodo der;
    }
    
    void Preorden(Nodo raiz){
    if(raiz!=null){
        System.out.println(raiz.info);
        Preorden(raiz.izq);
        Preorden(raiz.der);
    }
    
    }
    public static void main(String[] args) {
                                                     
    }
    
}
