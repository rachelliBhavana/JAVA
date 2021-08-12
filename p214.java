import java.util.*;

class Matrix
{
	public int addition(int arr[][])
	{
		int isum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
                isum=isum+arr[i][j];
			}
		}
		return isum;
	}
}
class p214
{
	public static void  main(String str[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number of rows");
		int row=sobj.nextInt();

		System.out.println("enter number of columns");
		int col=sobj.nextInt();

		int Arr[][]=new int[row][col];

		System.out.println("enter the elements");
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				Arr[i][j]=sobj.nextInt();
			}
		}

		System.out.println("enter the elements are");
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				System.out.print(Arr[i][j]+"\t");
			}
			System.out.println();
		}
		Matrix mobj=new Matrix();
        mobj.addition(arr[][]);
        int iret=

		Arr=null;
	}
}