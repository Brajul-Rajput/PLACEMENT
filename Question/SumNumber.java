package Question;
import java.util.Scanner ;
public class SumNumber {
    public static void main(String[] args) {
       int sum=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number : ");
       int n=sc.nextInt();
       for(int i=0;i<n;i++){
        sum+=i;
       } 
       System.out.println("sum : "+sum);
    }
}
