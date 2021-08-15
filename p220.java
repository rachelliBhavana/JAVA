import java.util.*;
import Marvellous.Matrix;
class demo extends Matrix
{
	public demo(int irow,int icol)
	{
		super(irow,icol);
	}
	int max()
	{
		int imax=Arr[0][0];
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				if(Arr[i][j]<imax)
				{
					imax=Arr[j][j];
				}
			}
		}
		return imax;
	}
	int min()
	{
		int imin=Arr[0][0];
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				if(Arr[i][j]>imin)
				{
					imin=Arr[j][j];
				}
			}
		}
		return imin;
	}

}
class p220
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
		System.out.println("max is "+iret);
		int ret=mobj.min();
		System.out.println("max is "+ret);

		
		System.gc();
	}
}