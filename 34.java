import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{

		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int cnt=1;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='.')
			cnt++;
		}
		System.out.print(cnt);

	}
}
