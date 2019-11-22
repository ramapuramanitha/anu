
public class Employee1 {

	String name;
	int eid;
	public Employee1(String ename,int empid) {
		this.name = ename;
		this.eid = empid;
	}
	void printDetails() {
		System.out.println("Employee name is"+name);
		System.out.println("Employee id is "+eid);
	}
	void sayHello() {
		System.out.println("Hello"+"name"+"welcome to ust Global company");
	}
	public static void main(String[] args) {
		Employee1 e1=new Employee1("anitha",123);
		e1.printDetails();
		Employee1 e2=new Employee1("prathiba",120);
		e2.printDetails();
		Employee1 e3=new Employee1("yashu",121);
		e3.printDetails();
	}
}
