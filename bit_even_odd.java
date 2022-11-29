import java.util.*;
public class bit_even_odd{
    public static void even(int n){
        
       int t=1;
       if((n&t)==1){
        System.out.println("odd number");
       }
       else{
        System.out.println("even number");
       }
            
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a binary number to check even or odd : ");
        int n=sc.nextInt();
        even(n);
    }
    
}
