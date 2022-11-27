import java.util.*;
public class PALINDROME_STRING {
    public static void pal(String s){
        String n="";
        for(int i=s.length()-1;i>=0;i--){
            n=n+s.charAt(i);

        }
        if(s.equals(n)){
            System.out.println("palandrome");
        }
        else{
            System.out.println("not palandrome");
        }

    }  
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string to check it palandrome or not : ");
        String name=sc.nextLine();
        
        
        pal(name);

    }
    
}
