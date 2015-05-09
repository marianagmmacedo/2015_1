package crackingTheCoding;

import java.util.ArrayList;
import java.util.Scanner;

public class ex1_2 {
	// reverse (char* str)
	public static void main(String [ ] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("write a setence");
		String setence = scan.nextLine();
		reverseSetence(setence);
		
		
	}
	
	public static void reverseSetence(String setence){
		ArrayList<Character> newSetence = new ArrayList<Character>();
		String result = "";
		for (int i = setence.length()-1; i > -1 ; i--) {
			newSetence.add(setence.charAt(i));
			
		}
		System.out.println(newSetence.toString());
	}
		
		

	
	
}
