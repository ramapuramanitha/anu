
public class TestD {
	public static void main(String[] args) {
		Btm b=new Btm();
		b.swipe();
		b.getCount();
		int count = b.getCount();
		System.out.println("Count is "+count);
		int totalcount = b.getTotalCount();
		System.out.println("Total Count is"+totalcount);
	}
}
