import java.util.*;
public class container_with_most_water {
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(8);
        a.add(6);
        a.add(2);
        a.add(5);
        a.add(4);
        a.add(8);
        a.add(3);
        a.add(7);
        int ans=0;
        System.out.println(a);
        for(int i=0;i<a.size();i++){
            for(int j=i;j<a.size();j++){
                int h=Math.min(a.get(i),a.get(j));
                int w=j-i;
                int area=h*w;
                 ans=Math.max(ans,area);

            }

        }
        System.out.println("max water = "+ans);
    }
    
}
