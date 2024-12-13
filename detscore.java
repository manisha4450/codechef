import java.util.*;
public class detscore
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=1;i<=T;i++){
		  int N = sc.nextInt();//no of test cases chef passed
		  int X = sc.nextInt();//problem points
		  int Tot = N/10;
		  System.out.println(X*Tot);
		}
	}
}