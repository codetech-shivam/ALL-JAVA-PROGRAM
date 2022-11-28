import java.util.*;
public class string_compression{
    public static String compression(String s){
        int l=s.length();
        StringBuilder n=new StringBuilder("");
        for(int i=0;i<l;i++){
            int count=1,t=i;
            
            while(s.charAt(i)==s.charAt(t+1)){
                count++;
                t++;
                if(t>l-2){
                    break;
                }
            }
        
            if(count==1){
                n.append(s.charAt(i));

            }
            else{
                n.append(s.charAt(i));
                n.append(count);

            }

            i=t;
        }
        return n.toString();
        

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string examle 'aaabbbdddfff' : ");
        String s=sc.nextLine();
        System.out.print("after compression of string is : "+compression(s));
    }
}
