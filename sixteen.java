/*
Write a java program which accepts 2 strings from user and
concat N characters of second string after first string.Value of N
should be accepted from user.
Note : If third parameter is greater than the size of second string
then concat whole string after first string.

Input : “Marvellous Infosystems”
“Logic Building”
5

Output : “Marvellous Infosystems Logic”
*/
import java.util.*;

class StringDemo
{
	public String Cat(String src,String des,int iCnt)
	{
       src.trim().replaceAll("[ ]{2,}"," ");
       String Arr[]=src.split(" ");
       String output=" ";
       String bobj=" ";
      
       if(iCnt>des.length())
       {
       	 System.out.println("Sting length is more");
       	 System.exit(0);
       }

       if(Arr.length-1>1)
       {
       	  if(Arr[2].length()>des.length())
          {
            output=src+" "+des;
            return output;
          }
       }
       
       	  for(int i=0;i<iCnt;i++)
       	  {
       	  	bobj=bobj+des.charAt(i);
       	  }
       	  output=src+bobj;
       
       return output;
       
	}
} 

class sixteen
{
	public static void main(String[] args) 
	{
		Scanner Sobj=new Scanner(System.in);
		System.out.println("Enter the First String");
		String s1=Sobj.nextLine();
		System.out.println("Enter the Second String");
		String s2=Sobj.nextLine();
		System.out.println("Enter the number");
      }
}