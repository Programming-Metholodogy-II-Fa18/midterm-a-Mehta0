
public class Problem3 {

	public static void main(String[] args) {
		Data d = new Data();
		
		d.add(1);
		d.add(5);
		d.add(8);
		d.add(10);
		d.add(12);
		d.add(14);
		d.add(18);
		d.add(20);
		d.add(33);
		d.add(41);
		
		d.binarySearch(8); // binary search implemented asa method in the data ojbect
		d.binarySearch(33);
	}

}
