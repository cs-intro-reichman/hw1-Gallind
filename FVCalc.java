// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		String Cvalue = args[0];
		String Ptime = args[2];
		String rate = args[1];
		double Dtime = Double.parseDouble(Ptime);
		double Fvalue = Double.parseDouble(Cvalue);
		double Drate = Double.parseDouble(rate);
		Fvalue = Fvalue*(Math.pow((1+Drate/100),Dtime));
		System.out.println("After " + Ptime + " years " + Cvalue + "$ saved at " + rate + "% will yield " +(int)Fvalue + "$");
	}
}