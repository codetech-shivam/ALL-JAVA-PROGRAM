import java.util.*;
public class string_builder{
    public static void st(){

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        StringBuilder s= new StringBuilder("shivakant shukla ");
        //s.toString();
        System.out.println(s);
        for(char i='a';i<='z';i++){
            s.append(i);
        }
        System.out.println(s);
       
        
    }
    
}
