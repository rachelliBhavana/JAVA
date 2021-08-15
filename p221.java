import java.util.*;
import Marvellous.Matrix;
class demo extends Matrix
{
	public demo(int irow,int icol)
	{
		super(irow,icol);
	}
	void max()
	{
		int imax=Arr[0][0];
		for(int i=0;i<Arr.length;i++)
		{
			imax=Arr[i][0];
			for(int j=0;j<Arr[i].length;j++)
			{
				if(Arr[i][j]<imax)
				{
					imax=Arr[i][j];
				}
			}
			System.out.println("max element of row "+(i+1)+"is"+imax);
		}
		
}
class p221
{
	public static void  main(String str[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number of rows");
		int row=sobj.nextInt();

		System.out.println("enter number of columns");
		int col=sobj.nextInt();

		demo mobj=new demo(row,col);
		mobj.accept();
		mobj.display();
		int iret=mobj.max();
		
		
		System.gc();
	}
}