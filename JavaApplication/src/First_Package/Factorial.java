package First_Package;
import java.util.*;

/**
 *
 * @author RK Rajib Khan
 */
public class Factorial {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        int sum=1;
        for(int i=num;i>0;i--){
            sum=sum*i;
        }
        System.out.println("Factorial of "+num+" is : "+sum);
    }
}
