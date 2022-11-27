import java.util.*;
public class sortest_path {
    
    public static void sortest_distance(String s){
        int x=0,y=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='n'){
                y++;

            }
            if(s.charAt(i)=='s'){
                y--;
            }
            if(s.charAt(i)=='e'){
                x++;
            }
            if(s.charAt(i)=='w'){
                x--;
            }

        }
        float path=(float)Math.sqrt(x*x+y*y);
        System.out.println(x);
        System.out.println(y);
        System.out.print("sortest path is : "+path);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the path in the form of e,w,n,s : ");
        String s=sc.next();

        sortest_distance(s);
    }
    
}
