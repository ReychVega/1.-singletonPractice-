package Domain;

/**
 *
 * @author reych
 */
public class manipulatingSingleton1 {
    
    public manipulatingSingleton1(){
    
    }
    
    public void increaseCounter(){
        Domain.singletonMethod.getInstance().increaseCounter();
    }
    
}
