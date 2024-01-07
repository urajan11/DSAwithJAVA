public class MERGESORT {
    public static void mergesortarr(int arr[], int si, int ei)   // [1,4,8,3] , 0 ,3
    {
        // Base case
        if (si >= ei) //1. 0>= 3 - F //
        {
            return;
        }
        int mid = si + (ei - si) / 2;  // 0 +(3-0)/2 = 1
        // Recursive call
        mergesortarr(arr, si, mid);// left part      // [], 0 ,1
        mergesortarr(arr, mid + 1, ei);// Right part // [] . 2 , 3

        mergex(arr, si, mid, ei); // [] , 0 , 1 , 3
    }

    public static void mergex(int arr[], int si, int mid, int ei)  // [] , 0, 1 ,3
    {
        int temp[] = new int[ei - si + 1]; // lastIndex  -  startIndex + 1  // t[] = 3-0+1 = 4
        int i = si;// iteretor for left part // 0
        int j = mid + 1; // iteretor for Right part  // 2
        int k = 0;// Iteretor temp 
        while (i <= mid && j <= ei) // 0 <= 1 t && 2 <= 3 t
        {
            if (arr[i] < arr[j]) 
            {
                temp[k] = arr[i];
                i++;
            } 
            else
            {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // Right Part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        // copy temp to original arr
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void PrintSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 6, 2, 3, 4, 8, 5, 1 };
        mergesortarr(arr, 0, arr.length - 1);
        PrintSort(arr);
    }
}
