/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_thread_pool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rizky
 */
public class Praktikum2_Main {
      public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ExecutorService executor = Executors.newFixedThreadPool(5);
         try {
            for(int i=0; i<10;i++){
                Praktikum2 p2 = new Praktikum2("GET -> ", new int[]{0,1,2,3,4});
                System.out.println(executor.submit(p2).get(1, TimeUnit.SECONDS));
            }
        } catch (InterruptedException | ExecutionException | TimeoutException ex) {
            Logger.getLogger(Praktikum2.class.getName()).log(Level.SEVERE, null, ex);
        }
         executor.shutdown();
    }
}
