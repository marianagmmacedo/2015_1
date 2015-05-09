package answer42;

import java.util.ArrayList;
import java.util.Scanner;



public class theAnswerTreeMain
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
 
        int inputNumbers = 6;
		double answer = 42;
		long startTime = System.nanoTime();	
		
		calculateAnswer("123456", inputNumbers-1,answer);
//		theAnswerTree tree = new theAnswerTree();
//		tree.buildTree(" * - * # | 1 2 3 4 5 6");
//		System.out.println(tree.calculateExpression());
		
		System.out.println("\nEND");
		
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns"); 
              
       
    }
    public static void calculateAnswer(String operators, int operatorNumber, double answer) {
    	int times = 0;
		int inputNumbers = operatorNumber+1; 
		long start = 0; String auxS ="";String auxE ="";
		long end = operatorNumber;
		
		for (int i = 1; i <= operatorNumber; i++) {
			auxS += 1;
			auxE += 6;
		}
		start = Long.parseLong(auxS);
		end = Long.parseLong(auxE);
		
		
		for (long i = start; i < end;){
			String st = Long.toString(i);
			while(st.contains("0") || st.contains("7") || st.contains("8") || st.contains("9")){
				//System.out.println(st);
				i++; 
				st = Long.toString(i);
			}
			//System.out.println(st);
			ArrayList<Integer> aux = new ArrayList<Integer>();
			
			for (int k = 0; k < operatorNumber; k++) {
				aux.add(Character.getNumericValue(st.charAt(k)));
			}
			
			String expression = "";
			
			for (int j = 0; j < operatorNumber; j++) {
				
				
				switch (aux.get(j)) {
					case 1:
						expression += " +" ;
						
						break;
					case 2:
						expression += " -" ;
						
						break;
					case 3:
						expression += " *";
						
						break;
					case 6:
						expression += " /" ;
						
						break;
					case 5:
						expression += " |";
						
						break;
					case 4:
						expression += " #" ;
						
						break;
					default:
						break;
					}
				

				
			
			}
			for (int j = 1; j <= inputNumbers; j++) {
				expression += " "+ j; 
			}
			//System.out.println(expression);
			theAnswerTree tree = new theAnswerTree();
			tree.buildTree(expression);
			
			if(tree.calculateExpression()==(answer)){
				times++;
				
				System.out.println(expression);
				
			}
			i++;
			
			
		}
		
		System.out.println(times);

		
	}

}
