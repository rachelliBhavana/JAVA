import java.util.*;
import Marvellous.Matrix;
class p217
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