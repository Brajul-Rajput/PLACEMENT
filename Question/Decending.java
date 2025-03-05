package Question;

public class Decending {
    public static void main(String[] args) {
        int[]arr={23,5,12,6,96,34,1,15};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;i++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
    }
}
