
public class ExamSort {
	private int[] ans;
	private int[] temp; 
	private int size;
	
	public ExamSort(int[] a, int size) {
		temp = a;
		this.size = size;
		
		int low = 0;
		int high = size-1;
		int mid = (high+low)/2;
		mergeSort(low, high);
		
		for (int i = 0; i<size; i++) 
			System.out.println(a[i] + "");
	}

	public int[] mergeSort(int low, int high) {
		int mid = (low+high)/2;
		if ( low < mid) {
			mergeSort(low, mid);
			mergeSort(mid+1, high);
			merge(low, mid, high);
		}
		
		
		
		return ans;
	}
	
	public void merge(int low, int mid, int high) {
		int i = low;
		int j = mid+1;
		int k = low;
		
		// Here we compare temp[i] vs temp[j] and put them in ans[k[, after which we increment k
		
		while (i < mid && j < high) {
			if (temp[i] > temp[j]) {
				ans[k] = temp[j];
				j++;
				k++;
			}	
			else {
				ans[k] = temp[i];
				i++;
				k++;
			}
				
		}
		
		while (k < high && j == high) { //This part is there in case the rest of the first half array hasn't been copied
			ans[k] = ans[i];
			i++;
			k++;
		}
		
		while (k < high && i == mid) { //This part is there in case the rest of the second half array hasn't been copied
			ans[k] = ans[j];
			j++;
			k++;
		}
		
		
		
	}
}
