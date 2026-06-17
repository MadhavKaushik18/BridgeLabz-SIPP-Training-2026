package core_java_practice.gcr_codebase.Recursion_Practice.Level1;
import java.util.Scanner;
public class nth_fibnocai {
    public static void main(String[] Args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("nth fibnocia number:"+fib(n));
    }
    public  static int fib(int n){
        if(n==1)return 0;
        if(n==2||n==3)return 1;
        return fib(n-1)+fib(n-2);
    }
}
