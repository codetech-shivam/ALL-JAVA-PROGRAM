import java.util.*;
class spiral_matrix{
    public static void mat(int a[][]){
       int rs=0;
       int re=a.length-1;
       int cs=0;
       int ce=a[0].length-1;
      
       while(ce>=cs && re>=rs){
        for(int i=cs;i<=ce;i++){
            System.out.print(a[cs][i]+" ");
        }
       
       
        for(int i=rs+1;i<=re;i++){
            System.out.print(a[i][ce]+ " ");
        }
        if(rs==re){
            break;
        }
        else{
        for(int i=ce-1;i>=cs;i--){
            System.out.print(a[re][i]+" ");
        }
        }
        if(cs==ce){
            break;
        }
        else{

       
        for(int i=re-1;i>=rs+1;i--){
            System.out.print(a[i][cs]+" ");
        }
    }
        
        rs++;
        re--;
        cs++;
        ce--;
       }



    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter number of row : ");
        
        int n=sc.nextInt();
        System.out.print("enter the number of column : ");
        
        int m=sc.nextInt();
        int a[][]= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
       mat(a);
    }
}