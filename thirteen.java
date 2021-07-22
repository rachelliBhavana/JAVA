/*
Write java program which accept N numbers from user and accept
one another number as NO , return index of last occurrence of that NO.
Input : N : 6
NO: 66
Elements : 85 66 3 66 93 88
Output : 3
*/
import java.util.*;

class Number
{
	public int check(int arr[],int ino)
	{
		int i=0;
		for(i=arr.length-1;i>=0;i--)
		{
			if(arr[i]==ino)
			{
				break;
			}
		}
		return i;
	}
}

class thirteen
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
	
		Number obj=new Number();
		int iret=obj.check(arr,ivalue);
		System.out.println("First occurance is :"+iret);
	}
}