public class subset_using_backtracking {//subset of a string
    public static void subset(String s,String t,int i){
        if(i==s.length()){//base case
            if(t.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(t);
            }
            
            return;
        }
        subset(s,t+s.charAt(i),i+1);//choice yes

        subset(s,t,i+1);//choice no  

    }

    public static void main(String args[]){
        String s="abc";
        
        subset(s,"",0);
    }
    
}
