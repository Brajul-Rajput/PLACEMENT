package Question;
import java.util.*;
public class CharInput {
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in); 
       System.out.println("enter the name : ");
       char name=sc.next().charAt(2);
       System.out.println(" char  : "+name);
    }
}
