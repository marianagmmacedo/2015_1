package project1_linkedlist;
import java.lang.System;

public class LL extends List implements iList{
	
	private List head;
	private List tail;
	private List current;
	private int sizeList;


	LL(List listCS) {
		super(listCS);
		this.head = listCS;
		this.tail = listCS;
		this.current = listCS;
		
	}
	
	
	public List getHead() {
		return head;
	}


	public void setHead(List head) {
		this.head = head;
	}


	public List getTail() {
		return tail;
	}


	public void setTail(List tail) {
		this.tail = tail;
	}


	public List getCurrent() {
		return current;
	}


	public void setCurrent(List current) {
		this.current = current;
	}


	@Override
	public void clear() {
		this.sizeList = 0;
		
	}
	@Override
	public void insert(CS_241 item) {
		  this.current = this.current.setNext(new List(item, this.current.nextObj()));
		  if (this.tail == this.current) tail = this.current.nextObj();  
		  this.sizeList++;	
	}
	@Override
	public void append(CS_241 item) {
		this.tail = this.tail.setNext(new List(item, this.tail.nextObj()));
		this.sizeList++;
		
	}
	@Override
	public CS_241 remove() {
		if(this.current.nextObj() != null){
			CS_241 o = this.current.element();
			if(tail == this.current.nextObj()){ tail = this.current;}
			this.current = this.current.setNext(this.current.nextObj());
			return o;
		}else{
			return null;	
		}
		
		
	}

	
	@Override
	public void moveToStart() {
		this.current = this.head;
		
	}
	@Override
	public void moveToEnd() {
		this.current = this.tail;
		
	}
	@Override
	public void prev() {
		List aux = new List(this.head);
		if(this.current != this.head){
			do{
				aux = aux.setNext(aux);
			}while(this.current.nextObj() == aux);		
			this.current = aux;
		}
		
	}
	@Override
	public void nextO() {
		if(this.current != tail){
			this.current = this.current.setNext(this.current);
		}
		
	}
	@Override
	public int length() {
		
		return this.sizeList;
	}
	@Override
	public int currPos() {
		List aux = this.head;
		  int i;
		  for (i=0; this.current != aux; i++)
		    aux = aux.setNext(aux);
		  return i;
	}
	@Override
	public void moveToPos(int pos) {
			assert (pos>=0) && (pos<=sizeList) : "Position out of range";
		  this.current = this.head;
		  for(int i=0; i<pos; i++) this.current = this.current.nextObj();
		  			
	}
	@Override
	public CS_241 getValue() {
		if(this.current.nextObj() == null) return null;
		return this.current.nextObj().element();
	}
	
	public void printList(){
		this.current = this.head;
		for (int i = 0; i < this.sizeList; i++) {
			System.out.println(this.current.element().getTopic().getName());
			this.current = this.current.nextObj();
		}
		
		
	}
	public boolean isTopic(Topic topic){
		this.current = this.head;
		boolean x = false;
		for (int i = 0; i < this.sizeList; i++) {
			if(this.current.element().getTopic().getName().equalsIgnoreCase(topic.getName())){
				System.out.println(this.current.element().getTopic().getName() +
					", "+ this.current.element().getTopic().getChapter()+
					", "+ this.current.element().getDate()+
					", "+ this.current.element().getHomework().getName()+
					", "+ this.current.element().getHomework().getDeadline());
				x = true;
			}
			
			this.current = this.current.nextObj();
		}
		
		return x;
	}


	
	
	

}
