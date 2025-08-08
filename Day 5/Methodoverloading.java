public class Methodoverloading {
    static int myMethod(int x){
        return x+10;
    }

    static float myMethod(float x){
        return x+5;
    }

    static double myMethod(double x,double y){
        return x*y;
    }
    


public static void main(String[] args){

    System.out.println(myMethod(10));
    System.out.println(myMethod(2.5f));
    System.out.println(myMethod(10.192,90.1821));
    
}
}