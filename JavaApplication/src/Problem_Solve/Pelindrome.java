package Problem_Solve;
import java.util.*;

public class Pelindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any integer number : ");
        int num,save_num,result,remainder,sum=0;
        num=input.nextInt();
        save_num=num;
        
        while(true){
            remainder=num%10;
            sum=sum*10+remainder;
            result=num/10;
            if(result==0) break;
            num=result;
        }
        System.out.println("Input number\tProcessed number");
        System.out.println(save_num+"  <-->  "+sum+"\n");
        if(save_num==sum) System.out.println("YES, Pellindrome number");
        else System.out.println("Not a Pellindrome number");
        
        System.out.println("\n-------------------------\n");
        
        
    }
}
