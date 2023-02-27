import java.util.*;
public class stack_question {
    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int t=s.pop();
        pushAtBottom(s, data);
        s.push(t);

    }

    public static String revString(String s){
        Stack<Character> p=new Stack<>();
        int i=0;
       while(i<s.length()){
        p.push(s.charAt(i));
        i++;
       }
       StringBuilder a=new StringBuilder();
       
        while(!p.isEmpty()){
           a.append(p.pop());
        }
        String l=a.toString();
        return l;

    }
    public static void main(String args[]){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        String n = revString("shivakant shukla bainti kala");
        //pushAtBottom(s,4);
        // while(!s.isEmpty()){
        //     System.out.println(s.pop());

        // }
        System.out.println(" "+n);
        
        

    }
    
}
