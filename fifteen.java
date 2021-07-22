/*
Write java program which accept N numbers from user and return
product of all odd elements.
Input : N : 6
Elements : 15 66 3 70 10 88
Output : 45
*/
import java.util.*;

class Number
{
	public int display(int arr[])
	{
		int i=0,isum=1;
		for(i=0;i<arr.length;i++)
		{
			if((arr[i]%2)!=0)
			{
				isum=isum*arr[i];
			}
		}
		return isum;
	}
}

class fifteen
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
			
		Number obj=new Number();
		int iret=obj.display(arr);
		System.out.println("product is : "+iret);
		
	}
}