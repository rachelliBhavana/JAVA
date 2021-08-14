import java.util.*;
import Marvellous.Matrix;
class demo extends Matrix
{
	public demo(int irow,int icol)
	{
		super(irow,icol);
	}
	int addition()
	{
		int isum=0;
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				isum=isum+Arr[i][j];
			}
		}
		return isum;
	}
}
class p218
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
		int iret=mobj.addition();
		System.out.println("addition is "+iret);

		
		System.gc();
	}
}