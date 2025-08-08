interface A{
    void show();
    void display();
}

class B implements A{
    public void show(){
        System.out.println("Miruthul");
    }
    public void display(){
        int a = 20;
        int b = 30;
        System.out.println(a+b);
    }
}

public class Abstractionusinginterface {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.display();
    }
}
