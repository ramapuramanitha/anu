
public class TestB {

	static int b;
	int a;
	 {
		a=10;
		b=20;
		System.out.println("non static block1");
	 }
		public static void main(String[] args) {

			System.out.println("main started");
		
		TestB b =new TestB();
		TestB b1 =new TestB();
		System.out.println("main ended");
		}
		{
		System.out.println("non static block2");	
		}
}