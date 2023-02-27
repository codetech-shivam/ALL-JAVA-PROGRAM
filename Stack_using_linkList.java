import java.util.*;
public class Stack_using_linkList {
    public static void main(String args[]){
        stack s=new stack();
        s.peak();
        s.push(1);
        s.push(2);
        s.pop();
        System.out.println(s.peak());

        

    }
    
}

class stack{
    class Node{
        int data;
        Node next;
            public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;

    //check empty list
    public int isEmpty(){
        if(head==null){
            return -1;
        }
        return 1;
    }

    //push
    public void push(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }

    //pop
    public int pop(){
        if(head==null){
            // System.out.println("empty");
            return -1;
        }
        head=head.next;
        return 1;
    }

    //peak
    public int peak(){
        if(head==null){
            System.out.println("null");
            return -1;
        }
        return head.data;
    }

}