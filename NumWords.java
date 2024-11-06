// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int FullNum = Integer.valueOf(args[0]);

		int Hs, Ts, Os;
		Os = FullNum % 10;
		Ts = (int)(Math.floor(FullNum/10)%10);
		Hs = (int)(Math.floor(FullNum/100)%10);

		System.out.println(Hs + " hundreds, " + Ts + " tens, and " + Os + " ones.");
	}
}
