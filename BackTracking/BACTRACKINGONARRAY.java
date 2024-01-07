public class BACTRACKINGONARRAY {
    public static void ChangeArr(int arr[], int i, int val) {
        // base case
        if (i == arr.length) {
            printarr(arr);
            return;
        }
        // recursion( kaam)
        arr[i] = val;
        ChangeArr(arr, i + 1, val + 1);// dnx call step
        arr[i] = arr[i] - 2;// backtrackin step
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = new int[5];
        ChangeArr(arr, 0, 1);
        printarr(arr);
    }

}
