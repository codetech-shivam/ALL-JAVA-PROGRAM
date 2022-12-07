
public class remove_duplicate {
    public static void st(String s ,int i,StringBuilder n,boolean a[]){
        
        
        if(i==s.length()){
            System.out.println(n);
            return;
        }
        char c=s.charAt(i);
        if(a[c-'a']==true){
            st(s,i+1,n,a);
        }
        
        else{
            a[c-'a']=true;
            st(s,i+1,n.append(c),a);
        }

    }
    public static void main(String args[]){
        String s="appnnacollege";
        
        st(s,0,new StringBuilder(""),new boolean[26]);
        
       
        // System.out.println(st(s));
        //System.out.println(s.length());
        // String ns="";
        // for(int i=0;i<s.length();i++){
        //     int temp=0;
        //     for(int j=i-1;j>=0;j--){
        //         if(s.charAt(i)==s.charAt(j)){
        //             temp=1;
        //         }

        //     }
        //     if(temp==0){
        //         ns=ns+s.charAt(i);
        //     }

        // }
        
        // System.out.println("string is "+ns);
    }
    
}
