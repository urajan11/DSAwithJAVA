public class QUICKSORT {
    public static void SortQuick(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        //last element
        int pIdx=partition(arr,si,ei);
        SortQuick(arr, si, pIdx-1);//left 
        SortQuick(arr, pIdx+1, ei);// Right
    }
    public static int partition(int arr[],int si, int ei){
        int pivot=arr[ei];
        int i=si-1;// to make place for els smaller thant pivot
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                // swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
            
        }
        i++;
            int temp=pivot;
                arr[ei]=arr[i]; //(pivot=arr[i]-> Tish cond is give error)
                arr[i]=temp;
                return i;
    }
    public static void PrintSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={2,4,6,3,8,1};
        SortQuick(arr, 0, arr.length-1);
        PrintSort(arr);
    }
    
}
