import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println(a+" "+b);

	}
}
