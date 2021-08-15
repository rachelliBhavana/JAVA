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
		int isum=0;
		for(int i=0;i<Arr.length;i++)
		{
			isum=0;
			for(int j=0;j<Arr[i].length;j++)
			{
				
					isum=isum+Arr[i][j];
			
			}
			System.out.println("max element of row "+(i+1)+"is"+isum);
		}
	}	
}
class p222
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
		mobj.max();
		
		
		System.gc();
	}
}