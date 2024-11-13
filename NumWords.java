// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int fullNum = Integer.valueOf(args[0]);

		int hs, ts, os;
		os = fullNum % 10;
		ts = (int)(Math.floor(fullNum/10)%10);
		hs = (int)(Math.floor(fullNum/100));

		
		//if (FullNum==2024){Hs=20;}

		System.out.println(hs + " hundreds, " + ts + " tens, and " + os + " ones.");
	}
}
