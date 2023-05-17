package Main;

import Domain.*;

/**
 * @author reych
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
     // TODO code application logic here
     
     //Testing the singleton pattern
     Domain.singletonMethod.getInstance();
     Domain.singletonMethod.getInstance();
          System.out.println("Counter: "+ Domain.singletonMethod.getInstance().getCounter());

     //Testing manipulatingSingleton1  
     manipulatingSingleton1 firstTest=new manipulatingSingleton1();
         firstTest.increaseCounter();
            System.out.println("Counter: "+ Domain.singletonMethod.getInstance().getCounter());

     //Testing manipulatingSingleton2
     manipulatingSingleton2 secondTest=new manipulatingSingleton2();
            System.out.println("Counter: "+ Domain.singletonMethod.getInstance().getCounter());

    }
}