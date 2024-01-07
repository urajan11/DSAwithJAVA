import java.util.*;
public class JobSchedul {
    
    static class job{
        char jod_id ;
        int deadline;
        int profit;
        job(char jod_id,int deadline,int profit){
            this.deadline = deadline;
            this.jod_id = jod_id;
            this.profit = profit;
        }
    }
    static void printJobScheduling(ArrayList<job>al){
        int n= al.size();
        Collection.sort(al, (a,b))
    }
}
