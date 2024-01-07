import java.util.Scanner;

public class AddTwoNo {
  // Java Program to add two numbers
// without using arithmetic operator
static int addition(int x, int y)
	{
		// Iterate till there is no carry
		while (y != 0)
		{
			// carry now contains common
			// set bits of x and y
			int carry = x & y;

			// Sum of bits of x and
			// y where at least one
			// of the bits is not set
			x = x ^ y;

			// Carry is shifted by
			// one so that adding it
			// to x gives the required sum
			y = carry << 1;
		}
		return x;
	}
	

	public static void main(String arg[])
	{
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b= s.nextInt();
		System.out.println("add two no= "+addition(a, b));
	}
}

import java.util.*;

public class AddTwoDigit {
    public static int AddDigit(int a, int b) {
        // itereter till b is not zero
        while (b != 0) {
            int carry = a & b; // using and operation
            a = a ^ b; // using XOR operator
            b = carry << 1; // using left shift
                            // carry shifted by one
        }
        return a; //
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        System.out.println("add two no= " + AddDigit(x, y)); // display final result
    }
}

    

