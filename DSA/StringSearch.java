package DSA;

public class StringSearch {
    public static void main(String[] args) {
        String name="Brajul";
        char target ='o';
         System.out.println(linearsearch(name, target));

    }
    public static boolean linearsearch(String name,char target){
    for(int i=0;i<name.length();i++){
        if(name.charAt(i)==target){
            return true;
        }
    }
    return false;
    }
}
