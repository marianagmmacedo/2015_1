
public class SelectionSort {
	int[] array;
		
	public SelectionSort(int[] array){
		this.array = array;
	}
	
	public void Select(){
		System.out.println("\n Starting Selection Sort ...");
		for (int size = 0; size < this.array.length-1; size++) {
			int min = size;
			// findMin
			for (int unordered = min; unordered < this.array.length; unordered++) {
				if(this.array[unordered]<this.array[min]){
					min = unordered;
				}
			}
			// swap
			if(min!=size){
				int auxiliar = this.array[size];
				this.array[size] = this.array[min];
				this.array[min] = auxiliar;
			}
			
			for (int i = 0; i < this.array.length; i++) {
				System.out.print(this.array[i] + "  ");
			}
			System.out.println("");
			
		}
	}
	
}
