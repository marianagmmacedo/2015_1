import java.util.LinkedList;


public class InsertionLL {
	LinkedList<Integer> linkedlist;
	
	public InsertionLL(LinkedList<Integer> linkedlist){
		this.linkedlist = linkedlist;
	}
	
	public void insertionSort(){
		int aux;int j;
		for (int i = 1; i < this.linkedlist.size(); i++) {
			aux = this.linkedlist.get(i);
			
			for (j = i; j > 0 && this.linkedlist.get(j-1) > aux; j--) {
				this.linkedlist.set(j, this.linkedlist.get(j-1));
			}
			this.linkedlist.set(j, aux);
			
		}
		print();
	}

	private void print() {
		for (int i = 0; i < this.linkedlist.size(); i++) {
			System.out.print(this.linkedlist.get(i));
		}
		
		
	}
	
	
}
