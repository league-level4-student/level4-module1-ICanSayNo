package _03_Switch_Statement_Practice;

import java.io.IOException;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) throws IOException {
		String[] options = {  "Saturday", "Friday", "Thursday", "Wednesday", "Tuesday", "Monday", "Sunday"  };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		String Say = "null";
		switch(input) {
		case 0: 
			System.out.println("0");
			Say = "Why hello humans it is Saturday";
			break;
		case 1: 
			System.out.println("1");
			Say = "Wubba lubba dub dub";
			break;
		case 2: 
			System.out.println("2");
			Say = "Somebody once told me. the world was gonna roll me. I ain't the sharpest tool in the shed.";
			break;
		case 3: 
			System.out.println("3");
			Say = "It is wednesday my dudes.";
			break;
		case 4: 
			System.out.println("4");
			Say = "Jeff jeff jeff jeff jeff jeff jeff jeff jeff jeff";
			break;
		case 5: 
			System.out.println("5");
			Say = "Oof it's monday yeet";
			break;
		case 6: 
			System.out.println("6");
			Say = "Spaghetti";
			break;
		}
		Runtime.getRuntime().exec("say "+ Say);
	}
}
