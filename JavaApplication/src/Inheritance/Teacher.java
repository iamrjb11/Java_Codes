
package Inheritance;

/**
 *
 * @author RK Rajib Khan
 */
public class Teacher extends Person {

    String subject;
    
    Teacher(String nm,String sx,String addr,String sub,int age){
        
        super(nm,sx,addr,age);
        
        this.subject=sub;
        
        
    }

    Teacher(String nm,String sx,String addr,String quali,String sub,int age) {
        super(nm,sx,addr,quali,age);
        this.subject=sub;
    }
    
    void varargsExample(String myname,int ... num){
        System.out.println("WELCOME TO Variable Arguments Example");
        int sum=0;
        for(int x: num){
            sum=sum+x;
        }
        
        System.out.println(myname+" : "+sum);
    }
    // @ Method overiding
    @Override
    void display(){
        super.display();
        System.out.println("Subject : "+subject);
        System.out.println("----------------------------------------------");
    }
    @Override
    public String toString(){
        System.out.println("I am toString() method\n");
        
        return super.toString()+"Subject : "+subject+"\n----------------------------------------------\n";
    }
    
    
    //Instance initializer block
    {System.out.println("I am intance initializer block\n\n<---- New Enter : --->");}
}
