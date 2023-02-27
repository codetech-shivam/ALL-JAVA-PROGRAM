import java.util.*;
public class stock_span_problem {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[7];
        a[0]=100;
        a[1]=80;
        a[2]=60;
        a[3]=70;
        a[4]=60;
        a[5]=85;
        a[6]=100;
        int temp=1;
        int ans[]=new int[7];
        for(int i=0;i<a.length;i++){
            for(int j=i-1;j>=0;j--){
                if(a[j]>=a[i]){
                    temp=i-j;
                    break;
                } 
            }
            ans[i]=temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(ans[i]+",");
        }
    }  
}
