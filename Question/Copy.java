package Question;

import java.util.Arrays;

public class Copy {
    public static void main(String[] args) {
        int []arr={12,23,34,45,56,67};
        int[]arr2=Arrays.copyOf(arr,arr.length);
        for(int b:arr2){
            System.out.println(b);
        }
    }
}
