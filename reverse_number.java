import java.util.*;
public class calculator{
    public static void main(String[] args) {
        Scanner dc= new Scanner(System.in);
        System.out.println("enter a number : ");
        int n =dc.nextInt();
        int r=0,a;

        while(n>0){
            a=n%10;
            r=r*10+a;
            n=n/10;

        }
        System.out.println("reverse of this number is : "+r);

    }
}