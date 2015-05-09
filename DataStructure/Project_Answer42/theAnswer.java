package answer42;

import java.util.ArrayList;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;


public class theAnswer {
	
	public static void main(String[] args) throws ScriptException {
		
		int inputNumbers = 7;
		double answer = 42;
		long startTime = System.nanoTime();	
		
		calculateAnswer(inputNumbers-1,answer);
		System.out.println("END");
		
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns"); 
		
		
	}
	
	public static void calculateAnswer(int operatorNumber, double answer) throws ScriptException {
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
			
			String expression = "1"; int num = 2;
			
			
			for (int j = 0; j < operatorNumber; j++) {
				
				
				switch (aux.get(j)) {
					case 1:
						expression = expression + "+" + num;
						num++;
						break;
					case 2:
						expression = expression + "-" + num;
						num++;
						break;
					case 3:
						expression = expression + "*" + num;
						num++;
						break;
					case 6:
						expression = expression + "/" + num;
						num++;
						break;
					case 5:
						expression = expression + num;
						num++;
						break;
					case 4:
						int index;
						if(num-1>10){
							index = 2;
						}else{
							index = 1;
						}
						expression = expression.substring(0, expression.length() - index) + num ;
						num++;
						break;
					default:
						break;
					}

			
			
			}
			
			ScriptEngineManager mgr = new ScriptEngineManager();
			ScriptEngine engine = mgr.getEngineByName("JavaScript");
			
			if(engine.eval(expression).equals(answer)){
				times++;
				//System.out.println(expression);
				
			}
			
			i++;
		}
		
	
		System.out.println(times);
		
	}


}
