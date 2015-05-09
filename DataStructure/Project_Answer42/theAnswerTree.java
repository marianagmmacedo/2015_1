package answer42;

class theAnswerTree
{
	
	
    class TreeNode
    {    
        String data;
        TreeNode left, right;
 
        
        public TreeNode(String data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    } 
 

    class StackNode
    {
        TreeNode treeNode;
        StackNode next;
 
      
        public StackNode(TreeNode treeNode)
        {
            this.treeNode = treeNode;
            next = null;
        }
    }
 
    private static StackNode top;
 

    public theAnswerTree()
    {
        top = null;
    }
 
    
    public void clear()
    {
        top = null;
    }
 
   
    private void push(TreeNode ptr)
    {
        if (top == null)
            top = new StackNode(ptr);
        else
        {
            StackNode nptr = new StackNode(ptr);
            nptr.next = top;
            top = nptr;
        }
    }
 
   
    private TreeNode pop()
    {
        if (top == null)
            throw new RuntimeException("NULLL!");
        else
        {
            TreeNode ptr = top.treeNode;
            top = top.next;
            return ptr;
        }
    }
 

    private TreeNode peek()
    {
        return top.treeNode;
    }
 
    
    private void insert(String val)
    {
    	
    		String regex = "[0-9]+";
    		//System.out.println(val);
            if (val.matches(regex))
            {
                
            	TreeNode nptr = new TreeNode(val);
            	
                push(nptr);
            }
            else
            {
                //System.out.println(top.data);
            	TreeNode nptr = new TreeNode(val);
                nptr.left = pop();
                nptr.right = pop();
                push(nptr);
            }
        
     
    }
 
 

    public void buildTree(String eqn)
    {
        String aux = "" ;
    	for (int i = eqn.length() - 1; i >= 0; i--)
        {
    		if(i!=0){
    			if(eqn.charAt(i) == ' '){
        			//System.out.print(aux);
        			insert(aux);
        			aux = "";
        		}else{
        			aux = eqn.charAt(i) + aux;
        		}
    		}else{
    			aux += eqn.charAt(i);
    			//System.out.print(aux);
    			insert(aux);
    			break;
    		}
    		
    		
            
        }
            
        
    }
 
   
    public double calculateExpression()
    {
        return calculate(peek());
    }
 
   
    public double calculate(TreeNode ptr)
    {
        if (ptr.left == null && ptr.right == null){
            
        	//System.out.println(ptr.data);
        	return Double.parseDouble(ptr.data);
        }
        else
        {
            double result = 0.0;
            double left = calculate(ptr.left);
            double right = calculate(ptr.right);
            char operator = ptr.data.charAt(0);
            
            switch (operator) {
				case '+':
					result = left + right; 
					break;
				case '-':
					result = left - right;
					break;
				case '*':
					result = left * right;
					break;
				case '/':
					result = left / right;
					break;
				case '|':
					result = left*10 + right;
					break;
				case '#':
					result = right;
					break;
				default:
					break;
			}
          
            return result;
        }
    }
   

 
}
 


