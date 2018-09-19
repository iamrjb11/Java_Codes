package First_Package;
import java.util.*;
/**
 *
 * @author RK Rajib Khan
 */
public class Sum_of_digits {
    public static void main(String[] args){
        System.out.print("Enter a integer number : ");
        Scanner input =new Scanner(System.in);
        int num = input.nextInt();
        int sum=0,sum_rev=0,result,remainder,save_num;
        save_num=num;
        int i=1;
        while(true){
            result = num/10;
            remainder=num%10;
            sum+=remainder;
            sum_rev=sum_rev*10+remainder;
            num=result;
            
            if(result==0) break;
        }
        System.out.println("Sum of digits "+save_num+" is : "+sum);
        System.out.println("Reverse of digits : "+save_num+" is :"+sum_rev);
    }
}
