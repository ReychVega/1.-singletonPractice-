/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author reych
 */
public class manipulatingSingleton2 {
 
    public manipulatingSingleton2(){
        Domain.singletonMethod.getInstance();//accesso directo.
    }
    
    public void increaseCounter(){
        Domain.singletonMethod.getInstance().increaseCounter();
    }
    
}
