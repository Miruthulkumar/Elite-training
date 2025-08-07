public class Multilevel {
    String grandpa = "Venkatachalam";
    String grandma = "Nallama";
    int grandpaage = 85;
    int grandmaage = 83;
    void display(){
        System.out.println(grandpa+" "+grandma+" "+grandmaage+" "+grandpaage);
    }
}
class Parent extends Multilevel{
    String dad = "Murali";
    String mom = "Selvi";
    int dadage = 53;
    int momage = 49;
    void show(){
        System.out.println(dad+" "+mom+" "+dadage+" "+momage);
    }
}
class Child extends Parent{
    String childname1 = "Mirthul Kumar 🤴";
    String childname2 = "Harshan Kumar";
    int age1 = 20;
    int age2 = 26;
    void print(){
        System.out.println(childname1+" "+childname2+" "+age1+" "+age2);
    }
}
class Main{
    public static void main(String[] args){
        Child abc = new Child();
        abc.display();
        abc.show();
        abc.print();
        int totalage = abc.grandpaage+abc.grandmaage+abc.dadage+abc.momage+abc.age1+abc.age2;
        System.out.println();
        System.out.println("The Combined Age is : "+totalage);
    }
}
