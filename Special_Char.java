import java.util.*;
import java.lang.*;
import java.io.*;

class Special_Char
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int cnt=0;
		for(int i=0;i<str.length();i++)
		{
		char ch=str.charAt(i);
		boolean b1=(Character.isLetter(ch)) ||(Character.isDigit(ch)) ||(ch==' ') ;
		if(b1==true)
		cnt=0;
		else 
		cnt++;
		
		}
		System.out.println(cnt);
	}
}
