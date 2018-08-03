import java.util.*;
import java.lang.*;
import java.io.*;

class Swap
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int t=n;
		n=m;
		m=t;
		System.out.print(n+" "+m);
	}
}
