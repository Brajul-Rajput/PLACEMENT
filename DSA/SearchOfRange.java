package DSA;

public class SearchOfRange {
    public static void main(String[] args) {
        int []arr={18,12,9,14,77,50,45,89};
        int target=77;
        int start=1;
        int end=5;
    System.out.println(linearsearch(arr, target, start, end));

    }
    static int linearsearch(int arr[],int target,int start,int end){
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                System.out.println("index is :"+i);
            }
        
        }   
        return 0;
    }
}
