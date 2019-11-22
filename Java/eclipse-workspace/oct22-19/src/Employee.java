
public class Employee {
	String name;
	int eid;
	public Employee(String ename,int empid) {
		name = ename;
		eid = empid;
	}
	public static void main(String[] args) {
		Employee e1=new Employee("anitha",123);

		Employee e2=new Employee("prathiba",120);

		Employee e3=new Employee("yashu",121);
	}
}
