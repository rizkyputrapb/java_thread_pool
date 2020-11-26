/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_thread_pool;

import java.util.concurrent.Callable;

/**
 *
 * @author rizky
 */
public class Praktikum2 implements Callable<String> {

    private String name;
    private int [] arr;

    public Praktikum2(String name) {
        this.name = name;
    }

    public Praktikum2(String name, int[] arr) {
        this.name = name;
        this.arr = arr;
    }

    
    @Override
    public String call() throws Exception {
      int total = 0;
         for(int i=0 ; i<arr.length ; i++){
             total += arr[i];
         }
         return name + total;
    }

}
