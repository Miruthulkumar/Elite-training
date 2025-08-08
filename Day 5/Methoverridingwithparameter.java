class A{
    void display(int a,int b){
        System.out.println(a+b);
        System.out.println("Addition Happened");
    }
}

class B extends A{
    void display(int a,int b){
        System.out.println(a-b);
        System.out.println("Subtraction Happened");
    }
}

class C extends A{
    void display(int a,int b){
        System.out.println(a/b);
        System.out.println("Division Happened");
    }
}

public class Methoverridingwithparameter {
    public static void main(String[] args) {
        A a0 = new A();             //parent class constructor
        a0.display(10,10);
        A a1 = new B();             //child class constructor
        a1.display(20,10);
        A a2 = new C();             //child class constructor
        a2.display(50,5);
    }    
}
