import java.util.Scanner;
	class Matrix {
	int [][] readMatrix(){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size(rows)(col) of the array");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c[][]=new int[a][b];
	for(int i=0;i<c.length;i++){
	for(int j=0;j<c[i].length;j++){
	c[i][j]=sc.nextInt();
	}
	}
	return c;
	}
	void dispArray(int x[][])
	{
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				System.out.println(x[i][j]);
			}
		}
	}
}
