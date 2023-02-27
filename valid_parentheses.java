import java.util.*;
public class valid_parentheses {
    public static boolean check_par(String s){
        if(s.length()%2==1){
            return false;
        }

        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));

            }
            else if(s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']'){
                if(stack.isEmpty()){
                    return false;
                }
                if(s.charAt(i)==')'){
                    if(stack.peek()=='('){
                        stack.pop();
                    }
                    else{
                        return false;
                    }

                }
                else if(s.charAt(i)=='}'){
                    if(stack.peek()=='{'){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                    
                }
                else{
                    if(stack.peek()=='['){
                        stack.pop();
                    }
                    else{
                        return false;
                    }

                }
                    
                }
            else{
                return false;
            }
           

        }
        return stack.isEmpty();

    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a parentheses : ");
        String s=sc.next();
        System.out.println(check_par(s));

    }
    
}
