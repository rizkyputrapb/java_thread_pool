/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author rizky
 */
public class Praktikum1_Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
         for (int i = 0; i < 10; i++) {
             Praktikum1 p1 = new Praktikum1("Task " + i);
             executor.execute(p1);
         }
         executor.shutdown();
    }
    
}
