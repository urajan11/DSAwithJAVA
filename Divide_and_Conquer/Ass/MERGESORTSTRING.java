public class MERGESORTSTRING {
    public static void stringSort(String str[],int si, int ei){
        if(si>=ei){ // base case
            return ;
        }
        int mid =si+(ei-si)/2;
        stringSort(str, si, mid);
        stringSort(str, mid+1, ei);
        String temp[]=new String[ei-si+1];
        int i=si; // Iteretor for left
        int j=mid+1; //iterator for right
        int k=0; // interstor for temp
        String largest=str[si];
        while(i<=mid && i<=ei){
            if(largest.compareTo(str[i]) <largest.compareTo(str[j])){
                temp[k]=str[i];
                i++;
            }
            else{
                temp[k]=str[j];
            }
            k++;
        }
            // left part
            while(i<=mid){
                temp[k++]=str[i++];
            }
            //Right part
            while(j<=ei){
                temp[k++]=str[j++];
            }
            // copy to original
            for(k=0,i=si;i<temp.length;k++,i++){
                str[i]=temp[k];
            }
        }
        public static void Print(String str[]){
            for( i=0;i<str.length;i++){
                System.out.print(str[i]+" ");
            }
            System.out.println();
        }
    public static void main(String args[]){
        String str[]={"sun","earth","mars","mercury"};
        stringSort(str, 0, str.length-1);
        Print(str);
    }
}
