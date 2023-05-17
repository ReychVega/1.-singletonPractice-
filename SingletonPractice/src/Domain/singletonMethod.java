/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author reych
 */
public class singletonMethod {
    private static singletonMethod  singleton;
    private int counter;
    
    private singletonMethod(){
        this.counter=0;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    
    public static singletonMethod getInstance (){
        if (singleton==null){
            System.out.println("Null instance");
             singleton=new singletonMethod();
        }else{
            System.out.println("Instance created");
        }
        
        return singleton;
        
    }
    
    public void increaseCounter() {
        this.counter++;
    }
          
}
