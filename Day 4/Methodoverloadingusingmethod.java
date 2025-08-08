class Math{
    static int add(int x,int y){
        return x+y;
    }

    static int add(int x,int y,int z){
        return x+y+z;
    }

    static int add(int x,int y,int z,int a){
        return x+y+z+a;
    }
}

public class Methodoverloadingusingmethod {
public static void main(String[] args) {
    Math abc = new Math();
    System.out.println(abc.add(10,10));
    System.out.println(abc.add(10,10,10));
    System.out.println(abc.add(10,10,10,10));
}    
}
