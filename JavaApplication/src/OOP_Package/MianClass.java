package OOP_Package;
import java.util.*;

public class MianClass {
    static{
        System.out.println("I am Static block and i am first!");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("OOP Basic\nDefault");
        
        //Create a Teacher object
        Teacher t1=new Teacher();
        t1.displayNonStatic();
        Teacher.displayStatic();
        
        String save_nm,save_sx;
        int save_age;
        System.out.print("\n------------------------------\nEnter Name : ");
        save_nm=input.nextLine();
        Teacher t2=new Teacher(save_nm);
        t2.displayNonStatic();
        Teacher.displayStatic();
        
        System.out.print("\n------------------------------\nEnter Name : ");
        save_nm=input.nextLine();
        System.out.print("Enter Sex : ");
        save_sx=input.nextLine();
        
        Teacher t3=new Teacher(save_nm,save_sx);
        t3.displayNonStatic();
        Teacher.displayStatic();
        
        System.out.print("\n------------------------------\nEnter Name : ");
        save_nm=input.nextLine();
        System.out.print("Enter Sex : ");
        save_sx=input.nextLine();
        System.out.print("Enter Age : ");
        save_age=input.nextInt();
        
        Teacher t4=new Teacher(save_nm,save_sx,save_age);
        t4.displayNonStatic();
        Teacher.displayStatic();
        
        
        System.out.println("\n\n");
    }
}
