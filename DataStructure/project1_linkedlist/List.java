package project1_linkedlist;

public class List{
	  private CS_241 class241;      
	  private List next;    
	  
	  List(CS_241 class241, List next){ 
		  this.class241 = class241;  
		  this.next = next; 
	  }
	  List(List next){
		  this.next = next;
	  }
	  List(CS_241 class241){
		  this.class241 = class241; 
	  }

	  List nextObj() { 
		  return this.next; }
	  
	  List setNext(List next){ 
		  return this.next = next; }    
	  
	  CS_241 element() { 
		  return this.class241; }  
	  
	  CS_241 setElement(CS_241 class241) { 
		  return this.class241 = class241; }
}
