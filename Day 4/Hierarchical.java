public class Hierarchical{
    int a = 10;
    int b = 20;
    int c = 30;
    void display(){
        System.out.println("The total value of Parent class is: "+(a+b+c));
    }
}

class A extends Hierarchical{
    int d = 40;
    int e = 50;
    int f = 60;
    void show(){
        System.out.println("The total value of A class is: "+(d+e+f));
    }
}

class B extends Hierarchical{
    int g = 70;
    int h = 80;
    int i = 90;
    void see(){
        System.out.println("The total value of B class is: "+(g+h+i));
    }
}

class C extends Hierarchical{
    int j = 100;
    int k = 110;
    int l = 120;
    void print(){
        System.out.println("The total value of C class is: "+(j+k+l));
    }
}

class Main{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.show();
        a.display();
        b.see();
        b.display();
        c.print();
        c.display();
    }
}