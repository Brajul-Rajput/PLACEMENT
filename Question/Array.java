package Question;
import java.util.*;
public class Array {
    public static void main(String[] args) {
        int size;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of the array :");
        size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("enter the array element :");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"  ");
        }
    
    }
}
