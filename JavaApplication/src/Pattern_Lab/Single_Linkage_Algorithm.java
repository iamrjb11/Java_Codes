package Pattern_Lab;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Single_Linkage_Algorithm {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        File file = new File("D:/Java/NetBeansProjects/JavaApplication/src/Pattern_Lab/clustering.txt");
        Scanner inputFile = new Scanner(file);
        
        ArrayList<Double> arX=new ArrayList<>();
        ArrayList<Double> arY=new ArrayList<>();
        int numOfsample;
        numOfsample = Integer.parseInt(inputFile.next());
        for(int i=0;i<numOfsample;i++){
            arX.add( Double.parseDouble(inputFile.next()) );
            arY.add( Double.parseDouble(inputFile.next()) );
        }
        /*for(int i=0;i<numOfsample;i++){
            System.out.print(""+arX.get(i)+" ");
            System.out.println(""+arY.get(i)+" ");
        }*/
        
        
        
    }
}
