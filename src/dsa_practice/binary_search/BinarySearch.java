package dsa_practice.binary_search;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,6,7,9};
        int t=6;
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==t)System.out.print(mid);
            else if(arr[mid]>t)j=mid-1;
            else i=mid+1;
        }
    }
}
