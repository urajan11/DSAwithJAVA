import java.util.*;
public class TrappingRainWater {
    public static void TrapWater(int arr[]){
        
        int nlr[]=new int[arr.length];
        
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>arr[i]){
                
                s.pop();
            }
            if(s.isEmpty()){
               nlr[i]=arr[0];
            }
            else{
                /* int pop_height = arr[s.peek()];
                int dis = i-s.peek()-1;
                int min_height = Math.min(arr[s.peek()],
                                            arr[i])-pop_height;
                ans+=dis * min_height; */
               nlr[i]= s.peek();
            }   
            s.push(i);
        }
         for(int i=0;i<arr.length;i++){
            System.out.print(nlr[i]+" ");
         }
        
    }
    public static void main(String args[]){
        int arr[]={7,0,4,2,5,0,6,4,0,5};
         TrapWater(arr);
    }
}
