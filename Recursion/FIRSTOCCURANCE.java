public class FIRSTOCCURANCE {
    public static int Occurance(int arr[], int i, int key) {
        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return Occurance(arr, i + 1, key);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 5, 3, 8, 4, 6, 3, 5, 2, 1, 8, 4 };
        System.out.print(Occurance(arr, 0, 6));
    }
}
// TC=O(n)