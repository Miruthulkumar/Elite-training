class A{
    int a = 10;
    int b = 20;
    int c = 30;
    void display(){
        System.out.println(a*b);
    }
    A(){
        System.out.println("MKCE");
    }
}

class B extends A{
    B(){
        super.display();
        System.out.print(super.b);
        System.out.println("Miruthul");
        System.out.print(super.c);
    }
}

public class Superkeyword {
    public static void main(String[] args) {
        B obj = new B();
    }
}
