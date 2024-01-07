import java.util.*;;
public class ShortestRout {
    public static float getShortestpath(String path){
     int x=0,y=0;
     for(int i=0;i<path.length();i++){
        char dir=path.charAt(i);
        //South
        if(dir=='S'){
            y--;
        }
        //North
        else if(dir=='N'){
            y++;
        }
        //West
        else if(dir=='W'){
            x--;
        }
        //East
        else{
            x++;
        }
     }
     int X2=(x-0)*(x-0);
     int Y2=y*y;
     return (float)Math.sqrt(X2+Y2);
     // Displacement=sqrt(x2-x1)(x2*x1)+(y2-y1)(y2-y1)
    }
    public static void main(String args[]){
        String path="WNEENESENNN";
        System.out.println("Shortest path: "+getShortestpath(path));
    }
    // TC= O(path)
}
