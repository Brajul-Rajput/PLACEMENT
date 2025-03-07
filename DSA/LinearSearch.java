package DSA;
public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={18 ,12, 9 ,14,77,50,45,89};
        int target=14;
        linearsearch(arr, target);
    }   


static void linearsearch(int arr[],int target){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==target)
            System.out.println(" index is :"+i) ;
    }
  }
}

