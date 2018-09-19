package Pattern_Lab;
import java.util.*;

public class Classification_samples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Double> arA=new ArrayList<>();
        ArrayList<Double> arB=new ArrayList<>();
        double pA,pB;
        System.out.print("Enter P(A) : ");
        pA=input.nextDouble();
        
        System.out.print("Enter P(B) : ");
        pB=input.nextDouble();
        int numA,numB;
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
        //System.out.println("Class A : "+arA);
        //System.out.println("Class B : "+arB);
        
        double target;
        System.out.print("\nEnter target sample value : ");
        target=input.nextDouble();
        int floor,ceil;
        floor=(int)target;
        ceil=floor+1;
        System.out.println("\nRange : "+floor+" - "+ceil);
        
        //Work
        int countA=0;
        for(int i=0;i<numA;i++){
            if(arA.get(i)>=floor && arA.get(i)<=ceil) countA+=1;
        }
        System.out.println("p("+target+"|A) : "+countA+"/"+numA);
        int countB=0;
        for(int i=0;i<numB;i++){
            if(arB.get(i)>=floor && arB.get(i)<=ceil) countB+=1;
        }
        System.out.println("p("+target+"|B) : "+countB+"/"+numB);
        
        //Using Bayes Theorem
        System.out.println("\nUsing Bayes Theorem :");
        double pclassA,pclassB;
        double totalA,totalB;
        totalA=pA*( ((double)countA) / ((double)numA) );
        //System.out.println("->>" +totalA);
        totalB=pB*( ((double)countB) / ((double)numB) );
        pclassA=totalA / (totalA+totalB);
        pclassB=totalB / (totalA+totalB);
        System.out.println("P(A|"+target+") : "+pclassA);
        System.out.println("P(B|"+target+") : "+pclassB);
        System.out.println("\nDecision :");
        if(pclassA>pclassB) System.out.println("The sample should be classified into class A");
        else System.out.println("The sample should be classified into class B");
        
        
        System.out.println("\n-------------ENDED------------\n");
    }
}
