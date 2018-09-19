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
public class TV extends Features {
    int channel_capacity;
    TV(){
        super();
    }
    TV(String nm,int chn){
        super(nm);
        this.channel_capacity=chn;
    }
    TV(String nm,String modl,int chn){
        super(nm,modl);
        this.channel_capacity=chn;
    }
    TV(String nm,String modl,String colr,int chn){
        super(nm,modl,colr);
        this.channel_capacity=chn;
    }
    TV(String nm,String modl,String colr,int prc,int chn){
        super(nm,modl,colr,prc);
        this.channel_capacity=chn;
    }
    
    @Override
    void display(){
        super.display();
        System.out.println("I am display method(TV Class)");
    }
    
    @Override
    public String toString(){
        String show;
        show=super.toString();
        if(channel_capacity!=0) show+="Channel Capacity : "+channel_capacity+"\n";
        return show;
    }
}
