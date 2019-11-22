
public class MatrixEO {
	public static void main(String arg[])
	{
	Matrix mt=new Matrix();
	int a[][]=mt.readMatrix();
	System.out.println("Entered matrix");
	mt.dispArray(a);
	evenOdd(a);
	}
	static void evenOdd(int [][]x)
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				if(x[i][j]%2==0)
					System.out.println(x[i][j]+"Even");
				else if(x[i][j]%2==1)
					System.out.println(x[i][j]+"Odd");
				else
					System.out.println("incorrect output");
			}
		}
	}
}
