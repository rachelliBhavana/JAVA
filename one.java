/*
Write Java program which accept N numbers from user and return
difference between summation of even elements and summation of
odd elements.
Input : N : 6
Elements : 85 66 3 80 93 88
Output : 53 (234 - 181)
*/
import java.util.*;

class Arraydemo
{
	public int diff(int arr[])
	{
		int icnt1=0,icnt2=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				icnt1=icnt1+arr[i];
			}
			else
			{
				icnt2=icnt2+arr[i];
			}
		}
		return icnt1-icnt2;
	}
}

class one
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter no of elements");
		int size=sobj.nextInt();
		int arr[]=new int [size];
		System.out.println("enter numbers");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sobj.nextInt();
		}
		Arraydemo obj=new Arraydemo();
		int iret=obj.diff(arr);
		System.out.println("difference of even and odd is "+iret);
	}
}