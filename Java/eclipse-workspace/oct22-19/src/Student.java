
public class Student {
	String name;
	String branch;
	int id;
	long mobileno;
	double perc;
	public Student(String name,String branch,int id,long mobileno,double perc) {
		this.name = name;
		this.branch = branch;
		this.id = id;
		this.mobileno = mobileno;
		this.perc = perc;
	}
	void printDetails() {
		System.out.println("Student name is"+name);
		System.out.println("Student branch is "+branch);
		System.out.println("Student id  is "+id);
		System.out.println("Student mobileno is "+mobileno);
		System.out.println("Student perc is "+perc);
	}

	public static void main(String[] args) {
		Student s1=new Student ("anitha","ECE",101,72878325,80);
		s1.printDetails();
		Student s2=new Student ("bharathi","ECE",102,71878320,86);
		s2.printDetails();
		Student s3=new Student ("mahi","ECE",103,72878300,85);
		s3.printDetails();
		Student s4=new Student ("priyanka","ECE",104,73078325,84);
		s4.printDetails();
		Student s5=new Student ("yashu","EEE",201,72878000,80);
		s5.printDetails();
		Student s6=new Student ("mouni","EEE",202,72800025,80);
		s6.printDetails();
		Student s7=new Student ("indhu","MECHANICAL",101,72223425,90);
		s7.printDetails();
		Student s8=new Student ("kavya","CIVIL",301,72856785,85);
		s8.printDetails();
		Student s9=new Student ("vasanthi","CIVIL",302,72234525,80);
		s9.printDetails();
		Student s10=new Student ("haritha","CSC",401,72678925,85);
		s10.printDetails();
	}	

}
