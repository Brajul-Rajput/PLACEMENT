package Array_java;
import java.util.*;
public class SumArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the size of the array :");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int sum=0;
        System.out.println("Enter the element of the array :");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        System.out.println("The sum of the array is :"+sum);
    }
}
