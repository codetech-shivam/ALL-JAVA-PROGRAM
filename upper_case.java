import java.util.*;
public class upper_case{
    //this function will convert all the first letter to upper case
    public static String touppercase(String s){
        StringBuilder n=new StringBuilder("");
        int l=s.length();
        for(int i=0;i<l;i++){
            if(i==0){
                char u=Character.toUpperCase(s.charAt(i));
                n.append(u);
            }
            else if(s.charAt(i-1)==' '){
            {
                char u=Character.toUpperCase(s.charAt(i));
                n.append(u);
            }
        }
           
            
            else{
                n.append(s.charAt(i));
            }
        }
         
        return n.toString();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string : ");
        String s=sc.nextLine();
        System.out.println(touppercase(s)); 
       
    }
    
}
