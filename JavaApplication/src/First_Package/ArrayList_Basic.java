package First_Package;
import java.util.*;

public class ArrayList_Basic {
    public static void main(String[] args){
        
        Scanner input =new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        System.out.print("Enter number of elements : ");
        int sz = input.nextInt();
        System.out.print("\nEnter array list values : ");
        for(int i=0;i<sz;i++){
            nums.add(input.nextInt());
        }
        System.out.println("\nPrint Data");
        for(int x : nums){
            System.out.print(x+" ");
        }
        int pos = nums.indexOf(11);
        System.out.println("\n\nIndex number of 11 is : "+pos);
        nums.set(3, 100);
        //System.out.println("");
        System.out.println("\nUpdate Print Data");
        for(int x : nums){
            System.out.print(x+" ");
        }
        int cool=nums.get(0);
        
        nums.clear();
        System.out.println("\n\nNew Print Data");
        for(int x : nums){
            System.out.print(x+" ");
        }
        System.out.println("");
        if(nums.isEmpty()) System.out.println("True");
        else System.out.println("False");
        
    }
}
