import java.util.*;
public class Multidimentioal_ArrayList {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> num=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(4);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        num.add(list1);
        num.add(list2);
        System.out.println(num);
        
        for(int i=0;i<num.size();i++){
            ArrayList<Integer> ind=num.get(i);
            //System.out.println(num.get(i));
            for(int j=0;j<ind.size();j++){
                System.out.print(ind.get(j)+" ");

            }
            System.out.println();
        }
    
}
}
