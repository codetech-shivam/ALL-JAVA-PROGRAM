import java.util.*;
public class ternary_odd_even{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number for even or odd print : ");
        int n=sc.nextInt();
        String ans=n%2==0?"even":"odd";
        System.out.println(ans);
    }
}