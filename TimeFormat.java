// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        // Replace this comment with the rest of your code
		//05:45
		//16:02
		//hours = Integer.parseInt(args[0][0]+args[0][1]);
		//"00:00" = "0:00 AM"
		//"01:02" = "1:02 AM"
		boolean day;
		String time;
		day = hours>=0 && hours<12;
		String SDay; //AM PM

		if (day){SDay = "AM";} else{SDay = "PM";}

		//PM 12-23
		if (!day && hours!=12){
			hours = hours-12;
		}

		time = hours + ":" + args[0].charAt(3) + args[0].charAt(4) + " " + SDay;

		System.out.println(time);
		/*
		if (args[0]!="00:00"){
			boolean day;
			String time;
			day = hours>=0 && hours<12;
			if (day){
				time = hours + ":" + minutes + " AM";
			}
			else{
				if (hours!=12){
				time = (hours-12) + ":" + minutes + " PM";}
				else{time = (hours) + ":" + minutes + " PM";}
			}
			System.out.println(time);
	}
	else{System.out.println("0:00");}
	*/
	}
}