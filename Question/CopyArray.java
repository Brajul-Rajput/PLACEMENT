package Question;

public class CopyArray {
    public static void main(String[] args) {
        int []arr={10,20,30,40,50};
        int []arr2;
        arr2=arr.clone();
        for(int b:arr2){
            System.out.println(b);
        }
    }
}
