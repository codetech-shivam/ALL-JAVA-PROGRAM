public class tower_of_hanoi {
    public static void toh(int n,char s,char h,char d){
        if(n==1){
            System.out.println("move disk "+n+" form "+s+" to "+d);
            return;
        }
        toh(n-1,s,d,h);
        System.out.println("move disk "+n+" form "+s+" to "+d);
        toh(n-1,h,s,d);
    }
    public static void main(String args[]){
        int n=3;
        toh(n,'A','B','C');
    }
}
