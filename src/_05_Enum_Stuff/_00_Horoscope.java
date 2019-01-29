package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		
		String[] options = {  "ARIES", "TAURUS", "GEMINI", "CANCER", "LEO", "VIRGO", 
				"LIBRA", "SCORPIO", "SAGITTARIUS", "CAPRICORN", "AQUARIUS", "PISCES"  };
		
		int input = JOptionPane.showOptionDialog(null, "What is your sign?", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		Zodiac sign = null;
		switch(input) {
		case 0: sign = Zodiac.PISCES;
			break;
		case 1: sign = Zodiac.AQUARIUS;
			break;
		case 2: sign = Zodiac.CAPRICORN;
			break;
		case 3: sign = Zodiac.SAGITTARIUS;
			break;
		case 4: sign = Zodiac.SCORPIO;
			break;
		case 5: sign = Zodiac.LIBRA;
			break;
		case 6: sign = Zodiac.VIRGO;
			break;
		case 7: sign = Zodiac.LEO;
			break;
		case 8: sign = Zodiac.CANCER;
			break;
		case 9: sign = Zodiac.GEMINI;
			break;
		case 10: sign = Zodiac.TAURUS;
			break;
		case 11: sign = Zodiac.ARIES;
			break;
		}
		
		switch(sign) {
		case PISCES: JOptionPane.showMessageDialog(null, "U gon die");
		break;
		case AQUARIUS: JOptionPane.showMessageDialog(null, "U is a fish cracker");
		break;
		case CAPRICORN: JOptionPane.showMessageDialog(null, "U gon win moneys");
		break;
		case SAGITTARIUS: JOptionPane.showMessageDialog(null, "Oof");
		break;
		case SCORPIO: JOptionPane.showMessageDialog(null, "U is now at least slightly human");
		break;
		case LIBRA: JOptionPane.showMessageDialog(null, "U gon dab on the hatrs");
		break;
		case VIRGO: JOptionPane.showMessageDialog(null, "U gon be bamboozled");
		break;
		case LEO: JOptionPane.showMessageDialog(null, "U is a human");
		break;
		case CANCER: JOptionPane.showMessageDialog(null, "U gon win fortnite");
		break;
		case GEMINI: JOptionPane.showMessageDialog(null, "U is now a ded");
		break;
		case TAURUS: JOptionPane.showMessageDialog(null, "U will be rich");
		break;
		case ARIES: JOptionPane.showMessageDialog(null, "U a all star");
		break;
		}	
	}
}
