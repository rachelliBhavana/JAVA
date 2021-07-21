/*
5.Write a program which accept number from user and return
difference between summation of even digits and summation of odd
digits.
Input : 2395
Output : -15 (2 - 17)
*/
import java.util.*;

class Digit
{
	public int count(int ino)
	{
		int idigit=0,imult=1;
		while(ino>0)
		{
			idigit=ino%10;
			imult=imult*idigit;
			ino=ino/10;
		}
        return imult;
	}
}

class ten
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter the no");

		int ivalue=sobj.nextInt();
		Digit obj=new Digit();
		int iret=obj.count(ivalue);
		System.out.println("multiplicatin is "+iret);
	}
}