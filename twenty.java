/*
Accept string from user and check whether the string is
palindrome or not without considering its case.

Input : “1abccBA1”
Output : TRUE
*/
import java.util.*;
class Demo
{
	public  void ReverseWord(String str)
	{
		String temp=str.trim().replaceAll("[ ]{2,}"," ");
		String Arr[]=temp.split(" ");
		String output=" ";
	    for(int i=0;i<Arr.length;i++)
		{
			StringBuffer bobj=new StringBuffer(Arr[i]);
			output =output + " " +bobj.reverse();
			bobj=null;
		}
		if(str.equals(output))
		{
			System.out.println("its palindrome");
		}
		else
        {
        	System.out.println("its not palindrome");
        }
	}
}
class twenty
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sobj.nextLine();
        Demo dobj=new Demo();
        dobj.ReverseWord(str);

	}
}
