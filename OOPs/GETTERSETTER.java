public class GETTERSETTER{
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Red");
        System.out.println(p1.getColor());
    }
}
class Pen{
        private String color;
        private int  tip; //  insid pen tip
        // Getters
        String getColor(){
            return this.color;
        }
        int getTip(){
            return this.tip;
        }
        //Setters
        void setColor(String newColor){
        this.color=newColor;
        }
        void setTip(int tip){//external variable
            this.tip=tip;
        }
}