class A{
    int a = 10;
    int b = 20;
    int c = 30;
    void show(){
        System.out.println(a+b+c);
    }
}

interface B{
    int d = 50;
    int e = 60;
    void dis();
}

interface D{
    int f = 70;
    int g = 80;
    void display();
}

class E extends A implements B,D{
    int h = 90;
    int i =100;

    public void dis(){
        System.out.println(a*i);
    }

    public void display(){
        System.out.println(h*e);
    }
}

public class Hybridinheri{
    public static void main(String[] args) {
        E abc = new E();
        abc.show();
        abc.dis();
        abc.display();
    }
}









