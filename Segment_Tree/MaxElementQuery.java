public class MaxElementQuery {
    static int tree[];

    public static void init(int n) {
        tree = new int[4 * n];
    }

    public static int buildST(int arr[], int i, int start, int end) {
        if (start == end) {
            tree[i] = arr[start];
            return arr[start];
        }

        int mid = (start + end) / 2;
        buildST(arr, 2 * i + 1, start, mid);
        buildST(arr, 2 * i + 2, mid + 1, end);

        // tree[i] = Math.max(tree[2 * i + 1], tree[2 * i + 2]);
        tree[i] = Math.min(tree[2 * i + 1], tree[2 * i + 2]);

        return tree[i];
    }

    public static int getMax(int arr[], int qi, int qj) {
        int n = arr.length;
        return getMaxUtil(0, 0, n - 1, qi, qj);
    }

    public static int getMaxUtil(int i, int si, int sj, int qi, int qj) {
        if (si > qj || sj < qi) {
            // return Integer.MIN_VALUE;
            return Integer.MAX_VALUE;
        }

        else if (si >= qi && sj <= qj) {
            return tree[i];
        } else {
            int mid = (si + sj) / 2;
            int leftans = getMaxUtil(2 * i + 1, si, mid, qi, qj);
            int rightans = getMaxUtil(2 * i + 2, mid + 1, sj, qi, qj);

            // return Math.max(leftans, rightans);
            return Math.min(leftans, rightans);
        }

    }

    public static void update(int arr[], int idx, int newVal) {
        arr[idx] = newVal;
        int n = arr.length;
        updateUtil(0, 0, n - 1, idx, newVal);
    }

    public static void updateUtil(int i, int si, int sj, int idx, int newVal) {
        if (idx < si || idx > sj) {
            return;
        }

        if (si == sj) {
            tree[i] = newVal;
        }
        if (si != sj) {

            // tree[i] = Math.max(tree[i], newVal);
            tree[i] = Math.min(tree[i], newVal);
            int mid = (si + sj) / 2;
            updateUtil(2 * i + 1, si, mid, idx, newVal);
            updateUtil(2 * i + 2, mid + 1, sj, idx, newVal);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, -1, 2, 17, 1, 3, 2, 4 };
        int n = arr.length;
        init(n);
        buildST(arr, 0, 0, n - 1);

        // for (int i = 0; i < tree.length; i++) {
        // System.out.print(tree[i] + " ");
        // }

        int max = getMax(arr, 2, 5);
        System.out.println(max);

        update(arr, 2, 20);

        max = getMax(arr, 2, 5);
        System.out.println(max);
    }
}
