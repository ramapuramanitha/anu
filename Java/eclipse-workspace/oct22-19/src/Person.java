
public class Person {
	String name;
	int age;
	Person(String pname, int page)
	{
		name = pname;
		age=page;
	}
	void printDetails() {
		System.out.println("Employee name is"+name);
		System.out.println("Employee id is"+eid);
	}
	public static void main(String[] args) {
		Person p =new Person("pratibha",20);
		p.printDetails();

		Person p1 = new Person("anitha",21);
		p1.printDetails();
		Person p2 = new Person("yashu",22);
		p2.printDetails();



	}

}
