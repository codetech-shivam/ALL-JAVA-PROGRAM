import java.util.*;
public class power_using_recursion {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }

        return x*power(x,n-1);


    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(power(2,9));


    }
    
}
