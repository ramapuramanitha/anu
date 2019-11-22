import java.util.Scanner;

public class IPrime {
	public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	boolean rs=isPrime(n,2);
	System.out.println(rs);
	}

	static boolean isPrime(int n,int i)
	{ 
		
	if(i>n/2)
	 return true;
	else if(n%i==0)
		return false;
	else 
		return isPrime(n,i+1);
	}
	}
