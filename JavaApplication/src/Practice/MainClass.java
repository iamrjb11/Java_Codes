/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

/**
 *
 * @author RK Rajib Khan
 */
public class MainClass {
    public static void main(String[] args) {
        
        
        TV tv1 = new TV();
        tv1.display();
        System.out.println(tv1);
        System.out.println("------------------------------------");
        
        TV tv2 = new TV("Sony",120);
        tv2.display();
        System.out.println(tv2);
        System.out.println("------------------------------------");
        
        TV tv3 = new TV("Sony","S-235L","Black",30000,120);
        tv3.display();
        System.out.println(tv3);
        System.out.println("------------------------------------");
    }
}
