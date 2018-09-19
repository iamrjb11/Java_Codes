/*Write a Java program to count the letters,
spaces, numbers and other characters of an input string
*/

package Problem_Solve;
import java.util.*;
public class Find_out_space_char_num_from_String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentance : ");
        String s = input.nextLine();
        int len = s.length();
        System.out.println("Len : "+len);
        
        int[] count = new int[4];//0-char , 1-num,2-space,3-other
        Arrays.fill(count,0);
        for(int i=0;i<s.length();i++){
            int num=Character.getNumericValue(s.charAt(i));
            if( (s.charAt(i)>='a' && s.charAt(i)<='z') ||((s.charAt(i)>='A' && s.charAt(i)<='Z')) ){
                count[0]+=1;
            }
            
            else if(num>=0 && num<=9) count[1]+=1;
            else if(s.charAt(i)==' ') count[2]+=1;
            else count[3]+=1;
            
        }
        System.out.println("Character count : "+count[0]);
        System.out.println("Number count : "+count[1]);
        System.out.println("Space count : "+count[2]);
        System.out.println("Other count : "+count[3]);
        
        
        System.out.println("\n----------ENDED------------\n\n");
        
    }
}
