import java.util.*;
class Matrix
{
	public int Arr[][];
	public Matrix(int irow,int icol)
	{
		Arr=new int[irow][icol];
	}
	protected void finalize()
	{
		Arr=null;
	}
	public void accept()
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter the elements");
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				Arr[i][j]=sobj.nextInt();
			}
		}
	}
	public void display()
	{
		System.out.println("enter the elements are");
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				System.out.print(Arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
class p215
{
	public static void  main(String str[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number of rows");
		int row=sobj.nextInt();

		System.out.println("enter number of columns");
		int col=sobj.nextInt();

		Matrix mobj=new Matrix(row,col);
		mobj.accept();
		mobj.display();
		
		System.gc();
	}
}