package core_java_practice.gcr_codebase.Recursion_Practice.Level1;
import java.util.*;
public class reverse_String {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=s.length()-1;
        reverse(s,l,"");
    }
    public static void reverse(String a,int k,String b){
        if(k<0){
            System.out.println(b);
            return;
        }
        b+=a.charAt(k);
        reverse(a,k-1,b);

    }
}
