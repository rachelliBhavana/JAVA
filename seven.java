/*
3.Write a program which accept number from user and return the
count of digits in between 3 and 7.
Input : 2395
Output : 1
*/
import java.util.*;

class Digit
{
	public int count(int ino)
	{
		int idigit=0,icnt=0;
		while(ino>0)
		{
			idigit=ino%10;
			if((idigit>3)&&(idigit<7))
			{
				icnt++;
			}
			ino=ino/10;
		}
        return icnt;
	}
}

class seven
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter the no");

		int ivalue=sobj.nextInt();
		Digit obj=new Digit();
		int iret=obj.count(ivalue);
		System.out.println("count is "+iret);
	}
}