import java.util.*;
public class moviesnacks
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int cost=2*x+3*y;
		int combo=z+x+2*y;
		int twocombos=2*z+y;
		int mincost=Math.min(cost,Math.min(combo,twocombos));
		System.out.println(mincost);

	}
}
