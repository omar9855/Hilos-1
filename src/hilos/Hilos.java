/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author sonicomar98
 */
public class Hilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       HiloNumeroLetras h1 = new HiloNumeroLetras(1);
       HiloNumeroLetras h2 = new HiloNumeroLetras(2);
       
       Thread t1 = new Thread (h1);
        Thread t2 = new Thread (h2);
     
       t1.start();
       t2.start();
      
      
        
    }
    
}
