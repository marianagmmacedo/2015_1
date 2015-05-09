import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;

class BalanceParenthesis {
	
	
   static Stack<String> expression = new Stack<String>();

   public static void main(String[] args)  {
	   
	  
      System.out.println("Enter expression:");
      Scanner keyb = new Scanner(System.in);
      String line = keyb.nextLine();
      char[] la = line.toCharArray();
      System.out.println(line);
      Stack<Character> parenthesis = new Stack<Character>();
      char ch;
      int i = 0;
      
      
      while (i < line.length())  {
    	 
    	 if(la[i] == 'a' || la[i] == 'A'){
    		 if((la[i+1] == 'd' || la[i+1] == 'D') &&
    				 (la[i+2] == 'd' || la[i+2] == 'D')){
    			 
    			 expression.push("+");
    			 i+=3;
    			 
    		 }else{
    			 System.out.println("Parse error");
    			 break;
    		 }
    	 }
    	 
    	 if(la[i] == 'm' || la[i] == 'M'){
    		 
    		 if((la[i+1] == 'i' || la[i+1] == 'I') && 
    				 (la[i+2] == 'n' || la[i+2] == 'N') &&
    				 (la[i+3] == 'u' || la[i+3] == 'U') &&
    				 (la[i+4] == 's' || la[i+4] == 'S')){
    			 
    			 expression.push("-");
    			 i+=5;
    			 
    		 }else if((la[i+1] == 'u' || la[i+1] == 'U') &&
    				 (la[i+2] == 'l' || la[i+2] == 'L') && 
    				 (la[i+3] == 't' || la[i+3] == 'T')){
    			 
    			 expression.push("*");
    			 i+=4;
    			 
    		 }else{
    			 System.out.println("Parse error");
    			 break;
    		 }
    		 
    	 }
    	 
    	 if(la[i] == 'd' || la[i] == 'D'){
    		 if((la[i+1] == 'i' || la[i+1] == 'I') &&
    				 (la[i+2] == 'v' || la[i+2] == 'V')){
    			 
    			 expression.push("/");
    			 i+=3;
    			 
    		 }else{
    			 System.out.println("Parse error");
    			 break;
    		 }
    		 
    	 }
    	 
    	 if(Character.isDigit(la[i])){
    		 
    		 String toPush = "";
    		 while(Character.isDigit(la[i])){
    			 
    			 toPush += la[i];
    			 i++;
    			 
    		 }
    		 
    		 expression.push(toPush);
    		 
    	 }
    	  
         if (la[i] == '(' || la[i] == '{') {
        	 
             parenthesis.push(la[i]);
             
             
         } 
         
         if (la[i] == ')') {
        	 
        	 if(!parenthesis.isEmpty())
        		 
        		 solveNextExpression();
        	 
        	 else{
        		 
        		 System.out.println("Parse error");
        		 break;
        	 
        	 }	 
             ch = parenthesis.pop();
             
             if (ch != '(') {
                 System.out.println("Parse error");
                 break;
             }
             else {
                 System.out.println(parenthesis.toString());
             }
             
         }


         if (la[i] == '}') {
        	 
        	 if(!parenthesis.isEmpty())
        		 
        		 solveNextExpression();
        	 
        	 else{
        		 
        		 System.out.println("Parse error");
        		 break;
        	 
        	 }	
        	 
             ch = parenthesis.pop();             
             if (ch != '{') {
                 System.out.println("Parse error");
                 break;
             }
             else {
                 System.out.println(parenthesis.toString());
             }
         }

         i++;
      }
      
      if(!expression.isEmpty())
    	  System.out.println(expression.peek());
      else
    	  System.out.println("Parse error");
   }

private static void solveNextExpression() {
	
	LinkedList<Double> toSolve = new LinkedList<Double>();
	
	while(isNumeric(expression.peek())){
		
		toSolve.add(Double.parseDouble(expression.pop()));
		
	}
	
	Double result = toSolve.removeLast();
	
	String operation = expression.pop();
		
	for(Double i: toSolve){
		
		if(operation.equals("+")){
			result += i;
		}else if(operation.equals("-")){
			result -= i;
		}else if(operation.equals("*")){
			result *= i;
		}else if(operation.equals("/")){
			result /= i;
		}
			
	}
		
	expression.push(Double.toString(result));
	
}

public static boolean isNumeric(String str)  
{  
  try{
	  
    double d = Double.parseDouble(str);  
  
  }catch(NumberFormatException nfe){
	  
    return false;  
  
  }  
  return true;  
}
   
}