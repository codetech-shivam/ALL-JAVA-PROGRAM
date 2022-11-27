import java.util.*;
public class sub_string{
    public static void subs(String s,int start,int end){
        String substring="";
        for(int i=start;i<end;i++){
            substring+=s.charAt(i);
        }
        System.out.println("substring is : "+substring);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string : ");
        String s=sc.nextLine();
        System.out.print("enter start index : ");
        int start=sc.nextInt();
        System.out.print("enter the last index : ");
        int end=sc.nextInt();
        subs(s,start,end);
        //System.out.println(s.substring(0,5)); this pri defined function in java to find the substring 
    
    }
    
}
