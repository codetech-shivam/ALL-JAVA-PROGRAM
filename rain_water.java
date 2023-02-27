import java.util.*;
public class rain_water{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int l,max=-700;
        int a[]={9,1,8,0,1,5,2,4};
        l=a.length;
        int x[]=new int[l];
        int y[]=new int[l];
        int i,j,sum=0;
        for(i=0;i<l;i++){
            for(j=i;j<l;j++){
                if(max<a[j]){
                    max=a[j];
                }
            }
            x[i]=max;
            max=-700;
            for(j=i;j>=0;j--){
                if(max<a[j]){
                    max=a[j];
                }
            }
            y[i]=max;
            max=-700;
        }
        for(i=0;i<l;i++){
            System.out.print(" "+x[i]);
        }
        System.out.println();
        for(i=0;i<l;i++){
            System.out.print(" "+y[i]);
        }
        System.out.println();
        for(i=0;i<l;i++){
            if(x[i]>y[i]){
                sum=sum+(y[i]-a[i]);
            }
            else{
                sum=sum+(x[i]-a[i]);
            }
        }
        System.out.println(sum);
    }
}