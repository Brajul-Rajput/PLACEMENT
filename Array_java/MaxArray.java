package Array_java;
import java.util.*;
public class MaxArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int size;
        int max=0;
        ;
        System.out.println("Enter the size of the array :");
        size=sc.nextInt();
        int[]arr=new int[size];
        System.out.println("Enter the element of the array :");
for(int i=0;i<size;i++){
    arr[i]=sc.nextInt();
}
for(int i=0;i<size;i++){
    if(arr[i]>max){
        max=arr[i];
    }
}
int min=arr[0];
for(int i=0;i<size;i++){
    if(arr[i]<min){
        min=arr[i];
    }
}
System.out.println("The maximum element of the array is :"+max);
System.out.println("The minimum element of the array is :"+min);
    }
}
