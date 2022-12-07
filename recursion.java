import java .util.*;
public class recursion{
    public static void number(int n){
        
        if(n==0){
            return;
        }
            
            number(n-1);
            System.out.println(n);
    }
    public static int fab(int n){
        if(n==0){
            return 1;
        }
        return n*fab(n-1);
        
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }

        return n+sum(n-1);
    }
    public static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number : ");
        int n=sc.nextInt();
        System.out.print(fib(n));
    }
}