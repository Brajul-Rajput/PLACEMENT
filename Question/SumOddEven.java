package Question;
import java.util.Scanner;
public class SumOddEven {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number :");
        int num=sc.nextInt();
        if(num%2==0){
for(int i=0;i<=num;i=i+2)
sum=sum+i;
System.out.println(sum);
        }
        else{
for(int i=1;i<=num;i=i+2)
sum=sum+i;
System.out.println(sum);

        }
    }
}
