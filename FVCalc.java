// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		String cValue = args[0];
		String pTime = args[2];
		String rate = args[1];
		double dTime = Double.parseDouble(pTime);
		double fValue = Double.parseDouble(cValue);
		double dRate = Double.parseDouble(rate);
		fValue = fValue*(Math.pow((1 + dRate / 100),dTime));
		System.out.println("After " + pTime + " years, a $" + cValue + " saved at " + dRate + "% will yield $" +(int)fValue );
	}
}