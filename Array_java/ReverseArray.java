package Array_java;
import java.util.*;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={10,20,30,40,50};
        for(int b:arr){
            System.out.print(b+"  ");
        }
        System.out.println(" ");
        System.out.println("Reverse now :");
        for(int i=4;i>=0;i--){
            System.out.print(arr[i]+"  ");
        }
    }   
    }
    
