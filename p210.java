import java.util.*;

class digits
{
    public int packing(int no1,int no2,int no3,int no4)
    {
       int ans=0;
       int i=no1<<24;
       int j=no2<<16;
       int k=no3<<8;
       int l=no4;
       ans=i|j|k|l;
       return ans;
    }	
    public void unpacking(int no)
    {
    	int no1,no2,no3,no4;
    	no1=no & 0x000000ff;
    	no2=no>>8;
    	no2=no2 & 0x000000ff;
    	no3=no>>16;
    	no3=no3 & 0x000000ff;
    	no4=no>>24;
    	System.out.println("1st:"+no1);
    	System.out.println("1nd:"+no2);
    	System.out.println("3rd:"+no3);
    	System.out.println("4th:"+no4);

    }
}

class p210
{
	public static void main(String arg[])
	{
		int no1,no2,no3,no4;
		Scanner sobj=new Scanner(System.in);

		System.out.println("enter number 1 ");
		no1=sobj.nextInt();
        
        System.out.println("enter number 2 ");
		no2=sobj.nextInt();

		System.out.println("enter number 3 ");
		no3=sobj.nextInt();

		System.out.println("enter number 4 ");
		no4=sobj.nextInt();

		digits dobj=new digits();
		int ret=dobj.packing(no1,no2,no3,no4);
		System.out.println(""+ret);
		dobj.unpacking(ret);

	}
}