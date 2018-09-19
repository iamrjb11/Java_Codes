package First_Package;
import java.util.*;
public class JavaApplication {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("<------ WELCOME ------>\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String mystr=input.nextLine();
        System.out.println("Your string is : "+mystr);
        System.out.print("Enter a integer number : ");
        int num1 = input.nextInt();
        System.out.println("Your integer number is : "+num1);
        System.out.print("Enter a float number : ");
        float num2=input.nextFloat();
        System.out.println("Your float number is : "+num2);
        System.out.print("Enter a double number : ");
        double num3=input.nextDouble();
        System.out.println("Your double number is : "+num3);
        System.out.print("Enter a charectar : ");
        char ch=input.next().charAt(0);
        System.out.println("Your charectar is : "+ch);
        
    }
    
}
