package crackingTheCoding;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class ex1_4 {
	// space = %20
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Write a setence");
		String setence = scan.nextLine();
		char [] stc = setence.toCharArray();
		int numberSpace=0;
		ArrayList<Integer> positions = new ArrayList<Integer>();
		for (int i = 0; i < stc.length; i++) {
			if(stc[i]==' '){
				numberSpace++;
				positions.add(i);
			}
		}
		int newSize = numberSpace*2 + stc.length;
		char [] newstc = new char[newSize]; int j = 0;
		for (int i = 0; i < stc.length; i++,j++) {
			if(positions.contains(i)){
				newstc[j] = '%';
				newstc[++j]= '2';
				newstc[++j]= '0';
			}else{
				newstc[j] = stc[i];
			}
		}
		for (int j2 = 0; j2 < newstc.length; j2++) {
			System.out.print(newstc[j2]);
		}
		System.out.println(Arrays.toString(newstc));
	}

	
}
