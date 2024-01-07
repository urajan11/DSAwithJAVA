public class STATICS {
    public static void main(String args[]){
        Student s1=new Student();
        s1.schoolname="jmv";
        
        Student s2=new Student();
        System.out.println(s2.schoolname);
        Student s3=new Student();
        s3.schoolname="abc";
        }
}
class Student{
    String name;
    int roll;
    static String schoolname;
    void setName(String name){//setter
        this.name=name;
    }
    String getName(String name){//Getter
        return this.name;
    }

}
