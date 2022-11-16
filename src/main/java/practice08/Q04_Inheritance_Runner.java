package practice08;

public class Q04_Inheritance_Runner {
    public static void main(String[] args) {
        B obj = new B();
        obj.i=0;
        System.out.println(obj.i);

        A objA = new A();
        objA.yazdir();

       A obj2= new B();
        System.out.println(obj2.j);

    }
}
