import java.util.*;
public class sort_or_not_using_recursion {


    public static void sorted_check(int arr[],int i){
        if(i==arr.length-1){
            System.out.println("this is sorted array");
            return;
        }
        
        if(arr[i]<=arr[i+1]){
            
            sorted_check(arr, i+1);

        }
        else{
            System.out.println("not sorted");
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,89};
        sorted_check(arr ,0);

    }
    
}
