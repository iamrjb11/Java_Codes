package Pattern_Lab;
import java.util.*;
import java.io.File;
import static java.lang.Math.*;
import java.io.FileNotFoundException;
public class Single_Linkage_Algorithm {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        File file = new File("D:/Java/NetBeansProjects/JavaApplication/src/Pattern_Lab/clustering.txt");
        Scanner inputFile = new Scanner(file);
        
        ArrayList<Double> arX=new ArrayList<>();
        ArrayList<String> clusterS=new ArrayList<>();
        int numOfsample;
        
        numOfsample = Integer.parseInt(inputFile.next());
        //2D array
        double[][] samples = new double[numOfsample+1][numOfsample+1];
        double[][] distance = new double[numOfsample+1][numOfsample+1];
        int[] clusterSample = new int[numOfsample+1];
        
        for(int i=1;i<=numOfsample;i++){
            samples[i][0] = Double.parseDouble(inputFile.next());
            samples[i][1] = Double.parseDouble(inputFile.next());
        }
        int clusterV = 1;
        double min=1000;
        int min_i=0,min_j=0;
        for(int i=1;i<=numOfsample;i++){
            clusterSample[i]=0;
            for(int j=1;j<=numOfsample;j++){
                
                double temp = pow((samples[i][0]-samples[j][0]),2)+pow((samples[i][1]-samples[j][1]),2);
                distance[i][j]=sqrt(temp);
                if(min>distance[i][j] && distance[i][j]!=0){
                    min= distance[i][j];
                    min_i = i;
                    min_j = j;
                }
                //System.out.println(""+(i+1)+","+(j+1+" : "+distance[i][j]));
            }
        }
        for(int i=1;i<=numOfsample;i++){
            for(int j=1;j<=numOfsample;j++){
            }
        }
            
        /*for(int i=0;i<numOfsample;i++){
            System.out.print(""+samples[i][0]+" ");
            System.out.println(""+samples[i][1]+" ");
        }*/
        
        System.out.println("i : "+min_i+" j : "+min_j);
        //System.out.println("-> "+clust);
        int setV=0,ch=1;
        for(int i=1;i<=numOfsample;i++){
            if(clusterSample[min_i]!=0 && clusterSample[min_i]!=-1){
                setV=clusterSample[min_i];
                ch=0;
                break;
            }
            
        }
        if(ch==0){
            clusterSample[min_j]=setV;
        }
        else{
            //System.out.println("IN");
            clusterSample[min_i]=clusterV;
            clusterSample[min_j]=clusterV;
            clusterV+=1;
        }
        int[] temp = new int[numOfsample+1];
        for(int i=1;i<=numOfsample;i++){
            temp[i] = clusterSample[i];
            System.out.print(""+temp[i]+" ");
        }
        System.out.println("");
        for(int i=1;i<=numOfsample;i++){
            if(temp[i]!=0 && temp[i]!=-1){
                //System.out.println("IN");
                int out = temp[i];
                //System.out.println("Out : "+out);
                for(int j=1;j<=numOfsample;j++){
                    if(temp[j]==out){
                        System.out.print(""+j+" ");
                        temp[j]=-1;
                    }
                }
                System.out.println("");
            }
            else{
                if(temp[i]==0){
                    System.out.println(""+i+" ");
                }
            }
            
        }
        System.out.println("---------------------------");
        
        
        
    }

    
}
