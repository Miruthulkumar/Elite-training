interface A {
        void show();
}

interface B {
        void display();
}

interface C{
        void dis();
}

class D implements A,B,C {

    public void show(){
        System.out.println("Welcome");
    }
    public void display(){
        System.out.println("MKCE");
    }
    public void dis(){
        System.out.println("KARUR");
    }
}

public class Multipleinheri{
    public static void main(String[] args) {
        D abc = new D();
        abc.show();
        abc.display();
        abc.dis();
    }
}