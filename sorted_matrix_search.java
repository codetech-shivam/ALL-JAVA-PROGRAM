public class sorted_matrix_search {
    public static void search(int a[][],int k){
        int l=a.length;
        int i=0,j=l-1;
        boolean t=true;
        
        while(i<l&&j>=0){
            System.out.println("way " +a[i][j]);
            if(k==a[i][j]&&j>=0){
                System.out.println("element found at ("+i+","+j+") = "+a[i][j]+" :");
                t=false;
                break;
            }
            
            else if(k<a[i][j]){
                j=j-1;
            }
            else {
                i=i+1;
            }
           

        }
        if(t){
            System.out.println("element not found");
        }
        
    }

    public static void main(String args[]){
        int a[][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
    
        search(a,33);
    }
    
}
