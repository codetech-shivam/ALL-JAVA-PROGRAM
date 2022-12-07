import java.util.*;
public class tilling_problem {
    public static int tile_way(int n){
        if(n==0 || n==1){
            return 1;
        }
        
       
        int verticle=tile_way(n-1);
        int horizontal=tile_way(n-2);
        return verticle+horizontal;

 
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(tile_way(6));

    }
    
}
