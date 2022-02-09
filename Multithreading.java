/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multithreading;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anas1
 */
public class Multithreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        multithread m1=new multithread();
        multithread m2=new multithread();
        Thread t1=new Thread(m1);
        Thread t2=new Thread(m2);
               
        t1.start();
        t2.start();
    }
    
}
class multithread implements Runnable
{
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            try {
                //            System.out.println("w");
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(multithread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
