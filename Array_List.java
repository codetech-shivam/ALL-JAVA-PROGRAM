import java.util.*;
public class Array_List {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> list=new ArrayList<>();

    System.out.println(list);
    list.add(0);
    list.add(677);
    list.add(3);
    list.add(9999);
    int max=-999;
    // System.out.println(list);
    // list.add(1,1);
    // System.out.println(list);
    // System.out.println(list.get(2));
    // list.remove(0);
    // System.out.println(list);
    // list.set(3,899);
    // System.out.println(list);
    // System.out.println(list.contains(20));
    // for(int i=list.size()-1;i>=0;i--){
    //     if(max<list.get(i)){
    //         max=list.get(i); 
    //     }
        
    // }
    // System.out.println(max);
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);
    Collections.sort(list,Collections.reverseOrder());
    System.out.println(list);

    
}
}
