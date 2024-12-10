import java.util.*;
public class healthysleep
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		if(x>8)
		{
		    System.out.println("MORE");
		}
		else if(x==8)
		{
		    System.out.println("PERFECT");
		}
		else
		{
		    System.out.println("LESS");
		}

	}
}