public class OOPS {
    public static void main(String args[]){
        pen p1=new pen();//create a pen object
        p1.setColor("blue");// call function
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color="yellow"; //update color
        System.out.println(p1.color);
    }
}
class pen{
    String color;
    int tip;
    void setColor(String newColor){
    color=newColor;
    }
    void setTip(int newTip){
        tip= newTip;
    }
}
class Student{
    String name;
    int age;
    float percentage;
    void calcPersentage (int phy,int che,int math){
        percentage=(phy+che+math)/3;
    }
}
