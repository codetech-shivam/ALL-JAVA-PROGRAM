import java.util.*;

import javax.swing.text.AbstractDocument.LeafElement;
public class Stack_next_greater_element {
    public static void main(String args[]){
        int a[]={6,8,9,11,8};
        int ans[]=new int[a.length];
        Stack<Integer> s=new Stack<>();
        //System.out.println(s.isEmpty());

        for(int i=a.length-1;i>=0;i--){
            while(!s.isEmpty() && a[i]>s.peek()){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i]=-1;
                s.push(a[i]);
                continue;
            }
            else if(a[i]<s.peek()){
                ans[i]=s.peek();
                s.push(a[i]);
            }
            }
            for(int i=0;i<a.length;i++){
                System.out.print(ans[i]+",");
            }
        }
    }
    

