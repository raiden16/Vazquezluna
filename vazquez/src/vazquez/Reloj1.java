
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;


public class Reloj1 {

   
    public static void main(String[] args) {
        
        Thread t1=new Thread(new Runnable(){
            public void run(){
                while(true){
                try {
                    Thread.sleep(1000);
                     //Crearemos un objeto que se llama calendar 
                    Calendar cal=Calendar.getInstance();
                    int hora=cal.get(Calendar.HOUR);
                    int min=cal.get(Calendar.MINUTE);
                    int seg=cal.get(Calendar.SECOND);
                    String time=hora+":"+min+":"+seg;
                    System.out.println(time);
                } catch (InterruptedException ex) {
                    
                }
            }}
        });
       
        
        t1.start();
        
        
    }
    
    }
    

