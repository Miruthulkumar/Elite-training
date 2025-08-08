class Animal{
    void Sound(){
        System.out.println("Animal Makes Sounds!");
    }
}

class Dog extends Animal{
    void Sound(){
        System.out.println("Dog is Barking!");
    }
}

class Cat extends Animal{
    void Sound(){
        System.out.println("Cat is Meowing!");
    }
}

public class Methoverriding {
    public static void main(String[] args) {
        Animal a0 = new Animal();
        a0.Sound();
        Animal a1 = new Dog();
        a1.Sound();
        Animal a2 = new Cat();
        a2.Sound();
    }    
}
