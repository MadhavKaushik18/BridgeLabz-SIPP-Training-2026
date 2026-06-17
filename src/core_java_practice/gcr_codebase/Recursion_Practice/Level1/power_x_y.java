package core_java_practice.gcr_codebase.Recursion_Practice.Level1;
import java.util.Scanner;
public class power_x_y {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("power of x^y:"+power(a,b));
    }
    public static int power(int x,int y){
        if(y==0)return 1;
        return x*power(x,y-1);
    }
}
