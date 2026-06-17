package core_java_practice.gcr_codebase.Recursion_Practice.Level1;

import java.util.*;

public class sum_of_n_numbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Sum of First N Natural Numbers:"+sum(n));
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);


    }
}
