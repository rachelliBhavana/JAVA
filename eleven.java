/*
Write java program which accept N numbers from user and accept
one another number as NO , check whether NO is present or not.
Input : N : 6
NO: 66
Elements : 85 66 3 66 93 88
Output : TRUE
*/
import java.util.*;

class Number
{
	boolean check(int arr[],int ino)
	{
		int icnt=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ino)
			{
				icnt++;
				break;
			}
		}
		if(icnt!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class eleven
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter no of elements");

		int isize=sobj.nextInt();
		int arr[]=new int[isize];
		System.out.println("enter nos");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sobj.nextInt();
		}
		System.out.println("enter no to be find");
		int ivalue=sobj.nextInt();
		boolean bret=false;
		Number obj=new Number();
		bret=obj.check(arr,ivalue);

		if(bret==true)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}