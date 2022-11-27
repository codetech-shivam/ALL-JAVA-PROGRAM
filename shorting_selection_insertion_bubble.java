import java.util.*;

public class shorting_selection_insertion_bubble {
    // ******************* bubble sort start ************************************
       //compare the adjacent element if larger then swap 

    public static void bubble(int a[]) {
        int i, j, temp, l = a.length;
        System.out.println("process of bubble sort : ");
        for (i = 0; i <l-1 ; i++) {
            for (j = 0; j < l -1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            for (int k = 0; k < a.length; k++) {
                System.out.print(a[k] + ",");
            }
            System.out.println();

        }

    }
    // ******************* bubble sort end ************************************


    // ******************* selection sort start ************************************
       //select the smallest in unsorted and add in sorted array using swap the next element of sorted array

    public static void selection(int a[]) {
        System.out.println("process of selection sort : ");
        int i, j, l = a.length;
        for (i = 0; i < l; i++) {
            int min = Integer.MAX_VALUE, t = 0;
            for (j = i; j < l; j++) {
                if (min > a[j]) {
                    min = a[j];
                    t = j;
                }

            }
            int temp = a[i];
            a[i] = min;
            a[t] = temp;
            for (int k = 0; k < a.length; k++) {
                
                System.out.print(a[k] + ",");
            }
            System.out.println();

        }

    }
    // ******************* selection sort end ************************************



    // ******************* insertion sort start ************************************
      //start from index 1 and insert it on the correct position using shift 
       //*******no use of swap in insertion

    public static void insertion(int a[]){
        System.out.println("process of insertion sort : ");
        int i,l=a.length,temp,j;
        for(i=1;i<l;i++){
            temp=a[i];
            j=i;
            while(j>0 && temp<a[j-1]){
                a[j]=a[j-1];
                j--;

            }
            a[j]=temp;
            for (int k = 0; k < a.length; k++) {
                System.out.print(a[k] + ",");
            }
            System.out.println();

            
        }
    }





    
    // ******************* insertion sort end ************************************


    // ******************* count sort start ************************************
  



    // ******************* main function start ************************************
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = { 4, 8, 9, 7, 6, 2, 0, 1 };
        System.out.print("this is my question : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
        /* ************function call here  *********************/
        insertion(a);
       // Arrays.sort(a,0,5,);
        System.out.print("this is sorted list : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }

    }

}
