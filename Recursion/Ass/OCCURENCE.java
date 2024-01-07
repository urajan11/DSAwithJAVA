public class OCCURENCE {
    public static int LocOccurence(int arr[],int i, int key){
        // Base case
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key ){
            System.out.print(i+" ");// print location
        }
        return LocOccurence(arr, i+1, key);
    }

    public static void main(String args[]){
        int arr[]={3,2,4,5,6,2,7,2,2};
        int key=2;
        LocOccurence(arr, 0, key);
    }
}
