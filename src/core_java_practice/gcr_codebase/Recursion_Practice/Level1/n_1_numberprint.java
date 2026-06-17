package core_java_practice.gcr_codebase.Recursion_Practice.Level1;
import java.util.*;
public class n_1_numberprint {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        nprint(n);

    }
    public static void nprint(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
        System.out.print(n);
        nprint(n-1);
    }
}
