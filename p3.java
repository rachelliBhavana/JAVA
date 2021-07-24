/*
Write Java program which accept number of rows and number of columns
from user and display below pattern.
Input : iRow = 4 iCol = 4
Output : A B C D
         a b c d
         A B C D
         a b c d
*/
import java.util.*;
class digit
{
	public void pattern(int irow,int icol)
	{
        char ch='A';
        char bh='a';
        for(int i=1;i<=irow;i++)
        {
        	for(int j=1;j<=icol;j++)
        	{
        		if(i%2!=0)
        		{
        			System.out.print(ch+"\t");
        			ch++;
        		}
        		if(i%2==0)
        		{
        			System.out.print(bh+"\t");
        			bh++;
        		}
        	}
        	ch='A';
        	bh='a';
        	System.out.println();
        } 
        System.out.println();      
	}
}
class p3
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter the Rows");
		int no1=sobj.nextInt();

		System.out.println("enter the Colums");
		int no2=sobj.nextInt();

		digit obj=new digit();
		obj.pattern(no1,no2);

	}
}