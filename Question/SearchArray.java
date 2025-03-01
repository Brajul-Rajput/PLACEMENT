package Question;

public class SearchArray {
    public static void main(String[] args) {
        int []arr={10,20,30,40,50};
        int target=30;
        for(int i=0;i<arr.length;i++)
            if(arr[i]==target){
                System.out.println("element founds :"+i);
            } 
            //System.out.println("element founds :"+i);
            
            else{
                System.out.println("element not founds");
                
            }
        
    }
}
