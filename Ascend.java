/*
#feedback
Hey Gal,
Great work,
Yam
*/


import java.util.Random;

// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		int a,b,c;
		
		Random r = new Random();
		a = r.nextInt(Integer.valueOf(args[0]) + 1);
		b = r.nextInt(Integer.valueOf(args[0]) + 1);
		c = r.nextInt(Integer.valueOf(args[0]) + 1);

		int min,mid,max;
		max = Math.max(a,Math.max(b,c));
		min = Math.min(a,Math.min(b, c));
		mid = a + b + c - max - min;

		System.out.println(a + " " + b + " " + c);
		System.out.println(min + " " + mid + " " + max);

	}
}
