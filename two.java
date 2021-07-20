/*
Write Java program which accept N numbers from user and display
all such elements which are divisible by 5.
Input : N : 6
Elements : 85 66 3 80 93 88
Output : 85 80
import java.util.*;
*/
class Arraydemo
{
	public void display(int arr[])
	{
		int icnt1=0;
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%5==0)
			{
				System.out.println(arr[i]);
			}
		}
		
	}
}

class two
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
		obj.display(arr);
		
	}
}