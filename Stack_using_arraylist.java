import java.util.*;
public class Stack_using_arraylist{
      

    public static void main(String args[]){
        stack s=new stack();
        System.out.println(s.isEmpty());
        s.push(1);
        System.out.println(s.isEmpty());
        s.pop();
        System.out.println(s.peak());
        

    }
}


class stack{
    static ArrayList<Integer> list =new ArrayList<>();
    

    //checking the stack
    public boolean isEmpty(){
        return list.size()==0;
    }

    //push
    public void push(int data){
        list.add(data);
    }

    //pop
    public int pop(){
        if(list.size()==0){
            return -1;
        }
        int top=list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }

    //peak
    public int peak(){
        if(list.size()==0){
            return -1;
        }
        return list.get(list.size()-1);
    }
}



 