//Single level
// multipal level
// Hierachial
// Hybrid
public class INHERETANCE {
    public static void main(String args[]){
        /*  Fish shark=new Fish();
        shark.eat(); */
        /*  dog puppy=new dog(); // multilevel
        puppy.breath();  */
       /*  cat ck=new cat(); //hierachial
        ck.eat(); */
        Tanu T=new Tanu();// Hybrid
        T.name();
    }
}
// Base class
class Animal{
    String color;
    void eat(){
        System.out.println("eat");
    }
    void breath(){
        System.out.println("breath");
        }
    
}
// Derived class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swin");
    }
}
/* class dog extends Fish{
    void wlak(){
        System.out.println("walk");
    }
} */
class mamal extends Animal{
    void leg(){
        System.out.println("leg");
    }
}
class cat extends Animal{
    void black(){
            System.out.println("white");
    }
}
// Hybrid inheritance
class Student{
    void name(){
        System.out.println("Name");
    }
}
class Boys extends Student{
    void male(){
        System.out.println("Name of Boys");
    }
}
class Girls extends Student{
    void Female(){
        System.out.println("Name of girls");
    }
}
class Rajan extends Boys{
    void avg(){
        System.out.println("Best");
    }
}
class Tanu extends Girls{
    void mr(){
        System.out.println("Nice");
    }
}