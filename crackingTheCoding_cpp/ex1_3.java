package crackingTheCoding;

import java.util.Scanner;
public class ex1_3 {
	// two strings, is it a permutation?
	public static void main(String []args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("write one setence");
		String a = scan.nextLine();
		System.out.println("write another setence");
		String b = scan.nextLine();
		boolean answer = isPermutation(a,b);
		
		System.out.println("is permutation? " + answer);
	}
	
	public static boolean isPermutation(String a, String b){
		a = a.concat(b);
		System.out.println(a.length());
		if(a.length()%2!=0){
			return false;
		}else{
			for (int i = 0; i < a.length(); i++) {
				
				char aux = a.charAt(i);
				int  num =  timesChar(aux,a);
				
				if(num%2!=0){
					return false;
				}
			}
		}
		return true;
	}

	private static int timesChar(char aux, String a) {
		int result = 0;
		for (int j = 0; j < a.length(); j++) {
			if(aux == a.charAt(j)){
				result++;
			}
		}
		return result;
	}
	
}
