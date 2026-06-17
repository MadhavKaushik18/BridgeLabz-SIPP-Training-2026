package core_java_practice.gcr_codebase.Recursion_Practice.Level1;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner sc=new  Scanner(System.in);
        String s=sc.next();
        Palindrome(s,0,s.length()-1);
    }
    public static void Palindrome(String a,int i,int j){
        if(a.charAt(i)!=a.charAt(j)){
            System.out.print("Not Palindrome");
            return;
        }
        if(i==j || i>j){
            System.out.println("Palindrome");
            return;
        }
        Palindrome(a,i+1,j-1);
    }
}
