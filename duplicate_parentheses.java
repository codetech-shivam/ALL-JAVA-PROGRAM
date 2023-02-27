import java.util.*;
public class duplicate_parentheses{
    public static boolean check_duplicate(String s){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==')'){
                int count=0;
                while(stack.peek()!='('){
                    stack.pop();
                    count++;

                }
                if(count!=0){
                    stack.pop();
                    return false;
                }
                

            }
            else{
                stack.push(c);
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a expression : ");
        String s=sc.next();

        System.out.println(check_duplicate(s));

    }

}