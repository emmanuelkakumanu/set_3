import java.util.*;
import java.lang.*;
import java.io.*;

class String_Count
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str;
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		int cnt=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			cnt++;
			
		}
		System.out.print(cnt);
	}
}
