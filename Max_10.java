import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n[]=new int[10];
		for(int i=0;i<10;i++)
		n[i]=s.nextInt();
		int max=n[0];
		for(int i=1;i<10;i++)
		if(max<n[i])
		max=n[i];
		System.out.print(max);
	}
}
