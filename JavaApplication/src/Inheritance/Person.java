/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author RK Rajib Khan
 */
public class Person {
    String name,sex,address,qualification;
    int age;
    Person(){
        
    }
    Person(String nm,String sx,String addr,int age){
        this.name=nm;
        this.sex=sx;
        this.address=addr;
        this.age=age;
        System.out.println("I am Person Class 1st Constructor!");
    }
    Person(String nm,String sx,String addr,String quali,int age){
        this.name=nm;
        this.sex=sx;
        this.address=addr;
        this.qualification=quali;
        this.age=age;
        
        System.out.println("I am Person Class 2nd Constructor!");
    }
    
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Sex : "+sex);
        System.out.println("Address : "+address);
        if(this.qualification!=null) System.out.println("Qualification : "+qualification);
        System.out.println("Age : "+age);
    }
    @Override
    public String toString(){
        System.out.println("I am in!");
        String dis ="Name : "+name+"\n"+"Sex : "+sex+"\n"+"Address : "+address+"\n";
        if(this.qualification!=null)  dis=dis+"Qualification : "+qualification+"\n";
        return dis+"Age : "+age+"\n";
    }
}
