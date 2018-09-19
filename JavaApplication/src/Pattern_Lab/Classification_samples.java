package Pattern_Lab;
import java.util.*;

public class Classification_samples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numA,numB;
        ArrayList<Double> arA=new ArrayList<>();
        ArrayList<Double> arB=new ArrayList<>();
        
        System.out.print("Number of samples in Class A : ");
        numA=input.nextInt();
        System.out.print("Class A : ");
        for(int i=0;i<numA;i++){
            arA.add( input.nextDouble() );
        }
        System.out.print("Number of samples in Class A : ");
        numB=input.nextInt();
        System.out.print("Class B : ");
        for(int i=0;i<numB;i++){
            arB.add( input.nextDouble() );
        }
        System.out.println("Class A : "+arA);
        System.out.println("Class B : "+arB);
        
        double target;
        System.out.print("Enter target sample value : ");
        target=input.nextDouble();
        int floor,ceil;
        floor=(int)target;
        ceil=floor+1;
        System.out.println("Floor : "+floor+"   Ceil : "+ceil);
        
        //Work
        
        System.out.println("\n-------------ENDED------------\n");
    }
}
