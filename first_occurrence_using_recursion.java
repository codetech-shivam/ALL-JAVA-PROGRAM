import java.util.*;
public class first_occurrence_using_recursion {
    public static int first_occurrence(int arr[],int n,int i){
        if(i<0){
            System.out.println("element not found");
            return -999;
        }
        if(n==arr[i]){
            return i;
        }
        return first_occurrence(arr, n, i-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={88,6,7,6,2,4,6,8,5,2,5,9};
        System.out.println("at index "+first_occurrence(arr, 88,arr.length-1));
    }
}
