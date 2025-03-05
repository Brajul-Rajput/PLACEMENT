package Question;
import java.util.Arrays;
import java.util.*;
public class sort {
    public static void main(String[] args) {
        int[]arr={23,5,12,6,96,32,1,15};
        for(int i=0;i<arr.length;i++){
            Arrays.sort(arr);
            System.out.print(arr[i]+" ");
        }
    }
}
