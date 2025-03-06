package Class_Object;

class A{
int age =20;          //data
int rollno=10;

public void show(){                               //method
    System.out.println(age+" "+rollno);
}
}
public class Demo {
    public static void main(String[] args) {
        A obj=new A();
        obj.show();
    }
}

