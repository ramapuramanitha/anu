
public class TestE {
	public static void main(String[] args) {
		AndroidOs as= new AndroidOs();
		as.homescreen();

		System.out.println("=========================");
		Sony s=new Sony();
		s.homescreen();

		System.out.println("================================");
		Oneplus os=new Oneplus();
		os.homescreen();

		System.out.println("=========================");
		Mi m=new Mi();
		m.homescreen();
	}
}
