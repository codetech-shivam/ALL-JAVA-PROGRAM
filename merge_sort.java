import java.util.*;
public class merge_sort {

    // this is only for printing of our array
    public static void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
    }



    //this is the recursive function
    public static void mergesort(int a[],int si,int ei){
        // this is our base condition
        if(si>=ei){
            return;
        }

        int mid=(si+ei)/2;
        // left divide
        mergesort(a,si,mid);
        // right divide
        mergesort(a,mid+1,ei);
        // calling merge function to mergr the left and right array
        merge(a,si,mid,ei);
    }






        // this our merge function ***** this is very important to under stand *****
    public static void merge(int a[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int t=0;
        //chote wale element ko aage lane ke liye 
        while(i<=mid && j<=ei){
            if(a[i]<a[j]){
                temp[t]=a[i];
                t++;
                i++;
            }
            else{
                temp[t]=a[j];
                t++;
                j++;
            }
        }
        // agr left me koi element bach gya h to use temp array me add krne ke liye 
        while(i<=mid){
            temp[t]=a[i];
            t++;
            i++;
        }
        // agr right me koi element bach gya h to use temp array me add krne ke liye 

        while(j<=ei){
            temp[t]=a[j];
            t++;
            j++;
        }


        //now copy the temp array to the  original array
        for(i=si,t=0;t<temp.length;t++,i++){
            a[i]=temp[t];
        }
    }


    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]={6,3,9,5,2,8,8,8,6,4,3,21,4,5,6,7,4,3,5};
        
        mergesort(a,0,a.length-1);
        print(a);


    }
    
}
