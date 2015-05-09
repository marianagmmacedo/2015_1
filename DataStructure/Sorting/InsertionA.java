
public class InsertionA {
	int[] array ;
	
	public InsertionA(int[] array){
		this.array = array;
	}
	
	public void insertionSort(){
		int aux;int j;
		for (int i = 1; i < this.array.length; i++) {
			
			aux = this.array[i];
			for (j = i; j > 0 && this.array[j-1] > aux; j--) {
				
				this.array[j] = this.array[j-1];
			}
			this.array[j] = aux;
			
		}
		printArray();
	}
	public void printArray(){
		for (int i = 0; i < this.array.length; i++) {
			System.out.print(this.array[i]);
		}
		System.out.println();
	}
	
	
	
}
