/*
2.Write a program which accept number from user and return the
count of odd digits.
Input : 2395
Output : 3
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
			if((idigit%2)!=0)
			{
				icnt++;
			}
			ino=ino/10;
		}
        return icnt;
	}
}

class eight
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter the no");

		int ivalue=sobj.nextInt();
		Digit obj=new Digit();
		int iret=obj.count(ivalue);
		System.out.println("count of odd digits is "+iret);
	}
}