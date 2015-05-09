
public class BubbleSort {
	int[] array;
	
	public BubbleSort(int[] array){
		this.array = array;
	}
	
	public void sorting(){
		boolean done = false;
		int positionOrder = 0;
		while(!done){
			done = true;
			++positionOrder;
			for (int i = 0; i < this.array.length - positionOrder; i++) {
				if(this.array[i]>this.array[i+1]){
					int aux = this.array[i];
					this.array[i] = this.array[i+1];
					this.array[i+1] = aux;
					done = false;
				}
			}
		}
		print();
		
	}
	public void print(){
		for (int i = 0; i < this.array.length; i++) {
			System.out.print(this.array[i]);
		}
		System.out.println();
	}
	
}
