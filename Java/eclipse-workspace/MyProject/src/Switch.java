import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BinarySearchTree bs = new BinarySearchTree();
		System.out.println("Enter your choice:");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
				break;
		case 2: System.out.println("2 case");
				break;
		default:System.out.println("Invaild value");
		
		}
	}

}
