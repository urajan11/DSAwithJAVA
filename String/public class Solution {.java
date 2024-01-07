public class Solution {
  /*   public static int[] answerQueries(int[] num, int[] queries) {
      int n=num.length;
            int m=queries.length;
            int sum=0;
            for(int i=0;i<n;i++){
                
                for(int j=i;j<n;j++){
                  sum=0;
                    for(int k=i;k<=j;k++){
                    sum+=num[k]; 
                        System.out.print(sum);
                    }
                }
               }
        return sum;
            }
            public static void main(String args[]){
                int num[]={4,5,2,1};
                int queries[]={3,10,21};
                answerQueries(num,queries);          
        } */
        public static String removeStars(String s) {
            for(int i=0;i<s.length();i++){
                if(s.charAt('*')==""){
                    System.out.print(s.charAt[i]);
                }
            }  
          }
          public static void main(String args[]){
          String s="leet**cod*e";
              removeStars(s);
          }

    }