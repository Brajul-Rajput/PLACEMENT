package Array_java;
import java.util.*;
public class SimpleArray {

    public static void main(String[]args){
        int size;
        System.out.println("Enter the size of the array :");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int arr[]=new int [size];
        System.out.println("Enter the element of the array :");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The element of the array are :");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
