package crackingTheCoding;

import java.util.ArrayList;
import java.util.Scanner;


public class ex1_1 {
	// string has all unique characters
	
	public static void main(String [ ] args){
	boolean unique = true;
	ArrayList<Character> notuniquechar = new ArrayList<Character>();
	Scanner input = new Scanner(System.in);
	System.out.println("Write a setence");
	String setence = input.nextLine();
	System.out.println(setence);
	System.out.println("Letters not unique : ");	
	for(int i=0; i<setence.length();i++){
			for(int j=i+1;j<setence.length();j++){
				if(setence.charAt(i) == setence.charAt(j)){
					unique = false;
					
					if(!notuniquechar.contains(setence.charAt(j))){
						System.out.print(setence.charAt(j) + ", ");
						notuniquechar.add(setence.charAt(j));
					}
					
				}
			}
	}
	if(unique){System.out.print("none");}
	System.out.println("\nIs it unique? " + unique);
	
	
	
	
	
}	
}
