
public class Data {
	private int[] arr; 
	private int size;
	private int arraySize;

	public Data() {
		this.arr = new int[10];
		this.arraySize = 10;
		this.size = 0;
	}
	
	public void add(int a) {
		int i;
		for (i = size; i > 0; i--)
			arr[i+1] = arr[i];
		size++;
		arr[0] = a;
	}
	
	public int intremove() {
		int lastval = arr[size-1];
		size--;
		System.out.println(lastval);
		return lastval;
	}
	
	public int getValue(int i) {
		if (i > size) {
			return -1;
		}
		else {
			return arr[i]; 
		}		
	}
	
	public int binarySearch(int i) {
		int j = size/2;
		int compares =0;
		while (arr[j] != i) {
			if (arr[j] > i) {
				j=j/2;
				compares++;
			}
				
			else {
				j = 3*j/2;
				compares++;
			}
		}
		System.out.print(compares);
		return arr[j];
		
		
	}
	
	

}
