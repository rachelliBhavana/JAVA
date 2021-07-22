/*
Write java program which accept N numbers from user and accept
Range, Display all elements from that range
Input : N : 6
Start: 60
End : 90
Elements : 85 66 3 76 93 88
Output : 66 76 88
*/
import java.util.*;

class Number
{
	public void display(int arr[],int istart,int iend)
	{
		int i=0;
		for(i=0;i<arr.length;i++)
		{
			if((arr[i]>istart)&&(arr[i]<iend))
			{
				System.out.println(arr[i]+"\t");
			}
		}
	}
}

class fourteen
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
		System.out.println("enter the starting no");
		int ivalue1=sobj.nextInt();

		System.out.println("enter the ending no");
		int ivalue2=sobj.nextInt();
	
		Number obj=new Number();
		obj.display(arr,ivalue1,ivalue2);
		
	}
}