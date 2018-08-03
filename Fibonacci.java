import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0,b=1,next;
		System.out.print(a+" "+b);
		for(int i=2;i<=n;i++)
		{
			next=a+b;
			System.out.print(" "+next);
			a=b;
			b=next;
		}
	}
}
