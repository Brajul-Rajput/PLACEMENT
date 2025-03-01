package Question;

public class ThreeGreater {
    public static void main(String[] args) {
        int a=23,b=90,c=34;
        int max=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(max);
    }
}
