import java.util.*;

public class calinetake
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		int z =scn.nextInt();
	    if(y*z>=x)
	    System.out.println(-1);
	    else
	    System.out.println(x-y*z);


	}
}
