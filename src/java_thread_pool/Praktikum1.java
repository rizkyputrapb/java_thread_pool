/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_thread_pool;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rizky
 */
public class Praktikum1 implements Runnable{

    private String nama;

    public Praktikum1() {
    }

    public Praktikum1(String nama) {
        this.nama = nama;
    }
    
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
             System.out.println("" + nama + " result: " + i);
             Long delay = (long) (Math.random() * 10);
             try {
                 TimeUnit.SECONDS.sleep(delay);
             } catch (InterruptedException ex) {
                 Logger.getLogger(Praktikum1.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
    }
    
}
