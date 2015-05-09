
public class BinarySearch {
	int[] array;
	
	public BinarySearch(int[] array){
		this.array = array;
	}
	
	public void search(int findValue){
		int left = 0;
		int right = this.array.length-1;
		binarySearch(findValue, left, right);
		
	}
	public void binarySearch(int findValue, int left, int right) {
		int partition = (int) (left+right)/2;
		if(this.array[partition] == findValue)
			System.out.println("The number " + findValue + " is in the position " + partition);
		else if(this.array[partition] > findValue)
				binarySearch(findValue,left,partition-1);
		
		else
				binarySearch(findValue,partition+1,right);
	
	}

	
}
