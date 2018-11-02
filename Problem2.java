
public class Problem2 {

	public static void main(String[] args) {
		Data d = new Data();
		
		d.add(1);
		d.add(9);
		d.add(4);
		d.add(5);
		d.add(10);
		d.add(0);	
		
		System.out.println(d.getValue(0));
		System.out.println(d.getValue(3));
	}

}
