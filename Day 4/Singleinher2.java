public class Singleinher2 {

    String name1 = "Miruthul";
    int a = 100;
    void display(){
        System.out.println("Name is: "+name1+" Value of A alone is: "+a);
    }
}

class Child extends Singleinher2{

    String name2 = "Harshan";
    int b = 200;
    void show(){
        System.out.println("Name is: "+name2+" Value of B alone is: "+b);
    }

}

class Main{
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.show();
        c1.display();
        int c=c1.a+c1.b;
        System.out.println(c);
    }
}
