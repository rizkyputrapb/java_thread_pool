/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_thread_pool.assignment;

/**
 *
 * @author rizky
 */
public class Message {
    private String time;
    private String date;
    private String message;

    public Message() {
    }

    public Message(String time, String date, String message) {
        this.time = time;
        this.date = date;
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
