// Single level
// multipal level
// hierarchial level
// hybrid 
public class TYPEINHERITANCE {
    public static void main(String args[]){
        /* Fish shark=new Fish(); //single
        shark.eat(); */
        dog puppy=new dog();
        puppy.eat();

    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("eat");
    }
    void breath(){
        System.out.println("breath");
        }
    
}
class Fish extends Animal{ //single
    int fins;
    void swim(){
        System.out.println("Swin");
    }
}
class dog extends Fish{
    void walk(){
        System.out.println("wlak and can Swin"); 
    }
}

