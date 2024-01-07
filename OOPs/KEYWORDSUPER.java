public class KEYWORDSUPER {
    public static void main(String args[]){
        Dog d=new Dog();
        System.out.println(d.color);
    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor called");
    }
}
class Dog extends Animal{
    
    Dog(){
        super.color="redBrown";
        //super(); // it is also called by default in java
         // it will help to call instant
        System.out.println("Dog constructor called");
    }
}
