public class LASTOCCURENCE {
    public static int Occurence(int arr[], int i, int key) {
        if (i == arr.length - 1) { // base case
            return -1;
        }
        int isfound = Occurence(arr, i + 1, key);
        if (isfound == -1 && arr[i] == key) {
            return i;
        }
        return isfound;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 5, 3, 8, 4, 6, 3, 5, 2, 1, 8, 4 };
        System.out.print(Occurence(arr, 0, 5));
    }
}
