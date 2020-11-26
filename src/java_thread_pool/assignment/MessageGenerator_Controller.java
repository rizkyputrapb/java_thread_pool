/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_thread_pool.assignment;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rizky
 */
public class MessageGenerator_Controller extends Thread{
    MessageGeneratorUI view;

    public MessageGenerator_Controller() {
    }

    public MessageGenerator_Controller(MessageGeneratorUI view) {
        this.view = view;
    }
    
    @Override
    public void run(){
        //thread pool for update clock
        ExecutorService clockexecutor = Executors.newFixedThreadPool(10);
        //thread pool for sowing message
        ScheduledExecutorService messageexecutor = Executors.newSingleThreadScheduledExecutor();
        int i=0;
        while(i<5){
            try {
                Message clock = clockexecutor.submit(new GenerateMessage()).get();
                //update message every 1 second
                Message message = messageexecutor.schedule(new GenerateMessage(), 1, TimeUnit.SECONDS).get();
                view.getTxt_Date().setText(clock.getDate());
                view.getTxt_Time().setText(clock.getTime());
                view.getMsgPane().setText(view.getMsgPane().getText()+"\n"+message.getTime()
                        +" -> "+message.getMessage());
            } catch (InterruptedException | ExecutionException ex) {
                Logger.getLogger(MessageGenerator_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
