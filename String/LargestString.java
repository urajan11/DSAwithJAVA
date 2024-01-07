public class LargestString {
    public static void main(String args[]) {
        String fruit[] = { "apple", "mango", "banana" };
        String largest = fruit[0];
        for (int i = 0; i < fruit.length; i++) {
            if (largest.compareToIgnoreCase(fruit[i]) < 0) { // or use compareTo(str)
                largest = fruit[i];
            }

        }
        System.out.println("largest String: " + largest);

    } // TC=O(n)
}
