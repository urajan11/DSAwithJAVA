public class CONSTRUCTOR {
    public static void main(String args[]){
        Student s1=new Student();// call constructor
        Student s2=new Student("Rajan");
        System.out.println(s2.name);
        s1.name="Rajan";
        s1.roll=451;
        s1.pass="asadf";
        s1.mark[0]=100;
        s1.mark[1]=90;
        s1.mark[2]=80;
        Student s3=new Student(s1); //copy
        s3.pass="xyz";
       // s1.mark[2]=100;// it will change marks
        for(int i=0;i<3;i++){
            System.out.println(s3.mark[i]);
        }
    }
}
class Student{
    String name;
    int roll;
    String pass;
    int mark[];
    // copy constructor OR
    // Shallow copy constructor
    /* Student(Student s1){
        this.name=s1.name;
        this.roll=s1.roll;
        this.mark=s1.mark;

    } */
    // Deep constructor
    Student(Student s1){
        this.name=s1.name;
        this.roll=s1.roll;
            mark=new int[3];
        for(int i=0;i<mark.length;i++){
            this.mark[i]=s1.mark[i];
        }
    }

    Student(){ // Non_Parameterized 
        mark=new int[3];
        System.out.println("constructor is called");
    }
    Student(String name){// Parameterize
        mark=new int[3];
        this.name=name;

    }
}