package First_Package;
import java.util.*;
/**
 *
 * @author RK Rajib Khan
 */
public class Array_Basic {
    public static void main(String[] args){
        System.out.print("Enter array values : ");
        Scanner input =new Scanner(System.in);
        int[] mat = new int[3];
        for(int i=0;i<3;i++){
            mat[i]=input.nextInt();
        }
        System.out.println("For print");
        for(int x : mat){
            System.out.print(x+"\t");
        }
        
        
    }
}
