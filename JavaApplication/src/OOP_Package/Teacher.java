
package OOP_Package;

public class Teacher {
   String name,sex;
   int age;
   static String school_name,head_sir_name;
   //Constructor
   Teacher(){
       name="Rajib";
       sex="Male";
       age=25;
   }
   //Overloading Constructor
   Teacher(String nm){
       name=nm;
   }
   //Overloading Constructor
   Teacher(String nm,String sx){
       name=nm;
       sex=sx;
   }
   //Overloading Constructor
   Teacher(String nm,String sx,int ag){
       name=nm;
       sex=sx;
       age=ag;
   }
   //Static Block
   static{
       school_name="Rotary School";
       head_sir_name="Rafiqul Islam";
   }
   static void displaySchool_name(){
       System.out.println("School Name : "+school_name);
   }
   static void displayHead_sir_name(){
       System.out.println("School Name : "+head_sir_name);
   }
   void displayNonStatic(){
       if(!(name.isEmpty())) System.out.println("\tName : "+name);
       
       //if(sex.equals(null)){}
       if(sex!=null) System.out.println("\tSex : "+sex);
       if(age!=0) System.out.println("\tAge : "+age);
   }
   static void displayStatic(){
       
       System.out.println("\tSchool_name : "+school_name);
       System.out.println("\tHead_sir_name : "+head_sir_name);
   }
   void setName(String p_name){
       this.name=p_name;
   }
   String getName(){
       return this.name;
   }
   void setSex(String p_sex){
       this.sex=p_sex;
   }
   void setAge(int p_age){
       this.age=p_age;
   }
}
