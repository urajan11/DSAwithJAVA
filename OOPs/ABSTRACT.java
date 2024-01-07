public class ABSTRACT {
    public static void main(String args[]){
        BullDog b=new BullDog(); // Animal->Dog->BullDog( hierarchi)
        /*  Dog d=new Dog();
        d.eats();
        d.walk();
        System.out.println(d.color); */// it will call first base class 
                                    // so color print brown
        /*  Chicken c=new Chicken();
        c.eats();
        c.walk(); */
    }
}
abstract class Animal{
    String color;
    Animal(){// constructor
     //  color="Brown";
        System.out.println(" animal Constructor called");
    }
    void eats(){
        System.out.println("Animal eat");
    }
    abstract void walk();
}
class Dog extends Animal{
    Dog(){
        System.out.println("Dog constructor called");
    }
    void ChangeColor(){
        color="Dark Brown";
    }
    void walk(){
        System.out.println("can walk");
    }
}
class BullDog extends Dog{
    BullDog(){
        System.out.println("BullDog constructor cslled");
    }
}
class Chicken extends Animal{
    void ChangeColor(){
        color="black";
    }
    void walk(){
        System.out.println("2 legs");
    }
}
