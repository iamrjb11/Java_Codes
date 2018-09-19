
package Inheritance;
import java.util.*;
/**
 *
 * @author RK Rajib Khan
 */
public class MainClass {
    
    
    
    {System.out.println("I am intance initializer block");}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("I am main class");
        Teacher t1 = new Teacher("Rajib","Male","Khulna","CSE",25);
        t1.display();
        
        Teacher t2 = new Teacher("Rajib","Male","Khulna","Bsc in CSE","CSE",25);
        t2.display();
        //For toString() method
        Teacher t3 = new Teacher("Rajib","Male","Khulna","Bsc in CSE","CSE",25);
        System.out.println(t3);// t3.toSting();
        
        
        //For variable arguments
        t1.varargsExample("Total Sum", 1,2,3,4,5,6,7,8,9,10); //Sum : 55
        
        
        
        
        System.out.println("\n\n");
        
    }
}
