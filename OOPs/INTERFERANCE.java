public class INTERFERANCE {
    public static void main(String args[]){
    Queen  Q=new Queen();
    Q.moves();
    }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
public void moves(){
    System.out.println("up,down,left,right,diagonal(in all 4 dir");
}
}
class Rook implements CharSequence{
    public void moves(){
        System.out.println("up,dowm,left,right,diagonal(1 step)");
    }
}
