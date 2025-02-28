package Question;
import java.util.*;
public class ASCII {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the character : ");
        char ch=sc.next().charAt(0);
        int ascii=(int)ch;
        System.out.println(ascii);
    }
}
