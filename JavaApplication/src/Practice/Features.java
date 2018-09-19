/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

/**
 *
 * @author RK Rajib Khan
 */
public class Features {
    String name,model,color;
    int price;
    Features(){
        
    }
    // Method Overloading 
    Features(String nm){
        this.name = nm;
    }
    // Method Overloading 
    Features(String nm,String modl){
        
        this(nm); // to calling previous constructor with one parameter
        this.model=modl;
    }
    // Method Overloading 
    Features(String nm,String modl,String colr){
        this(nm,modl);
        this.color=colr;
    }
    // Method Overloading 
    Features(String nm,String modl,String colr,int prc){
        this(nm,modl,colr);
        this.price=prc;
    }
    void display(){
        System.out.println("I am display method(Features Class)");
    }
    @Override
    public String toString(){
        String show="";
        if(name!=null) show+="Name : "+name+"\n";
        if(model!=null) show+="Model : "+model+"\n";
        if(color!=null) show+="Color : "+color+"\n";
        if(price!=0) show+="Price : "+price+"\n";
        return show;
    } 
    
    
    
    
    {System.out.println("I am Features class instance initializer block");}
}
