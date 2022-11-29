import java.util.*;

public class bit_question {
    public static void ithbit(int n,int i){//the value of ith bit 0 / 1 :
        int x=(n&(1<<i));
        if(x==0){
            System.out.println(0);
        }
        else{
            System.out.println(1);
        }
    }
    public static void setithbit(int n,int i){//set ith bit =1 :
        int x=(n|(1<<i));
        System.out.println(x);
    }
    public static void clearithbit(int n,int i){//set ith bit =0 :
        int x=(n&~(1<<i));
        System.out.println(x);

    }
    public static void update_ith_bit(int n,int i,int s){//update ith bit 0/1
        int x=(n&~(1<<i));
        s=(s<<i);
        System.out.println(x|s);

    }
    public static void clear_last_ibit(int n,int i){//clear last ith bit
        int x=(n&(~0<<i));
        System.out.println(x);
    }
    public static void number_if_set_bit(int n){//how many number of 1 in this number
        int count=0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        System.out.println("number of 1 is : "+count);
    }
    
    

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number : ");
        int n=sc.nextInt();
        System.out.print("enter the index of bit : ");
        int i=sc.nextInt();
        ithbit(n,i);
        //setithbit(n,i);
        //clearithbit(n,i);
        //update_ith_bit(15,3,0);
        //clear_last_ibit(n,i);
        //number_if_set_bit(16);
        
    }
    
}
