import java.util.*;
class Node{
    int data;
    Node next;
    Node(){}
    Node(int data){
        this.data=data;
    }
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
}
class CeateLinkedList{
    Node list,nptr,tptr;
    public void addNode(int dt){
        nptr=new Node(dt);
        if(list==null){
            list=nptr;
            tptr=nptr;
        }
        else{
            tptr.next=nptr;
            tptr=nptr;
        }
    }
    public void show(){
        Node tptr=list;
        while(tptr!=null){
            System.out.print(tptr.data+" ");
            tptr=tptr.next;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        CeateLinkedList obj=new CeateLinkedList();
        obj.addNode(23);
        obj.addNode(2);
        obj.addNode(21);
        obj.addNode(43);
        obj.show();
    }
}
