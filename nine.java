/*
4.Write a program which accept number from user and return
multiplication of all digits.
Input : 2395
Output : 270
*/
import java.util.*;

class Digit
{
	public int count(int ino)
	{
		int idigit=0,odd=0,even=0;
		while(ino>0)
		{
			idigit=ino%10;
			if(idigit%2==0)
			{
				even=even+idigit;
			}
			else
			{
               odd=odd+idigit;
			}
			ino=ino/10;
		}
        return even-odd;
	}
}

class nine
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter the no");

		int ivalue=sobj.nextInt();
		Digit obj=new Digit();
		int iret=obj.count(ivalue);
		System.out.println("summation  is "+iret);
	}
}