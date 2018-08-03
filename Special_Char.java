import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int cnt=0;
		for(int i=0;i<str.length();i++)
		{
		char ch=str.charAt(i);
		boolean b1=(Character.isLetter(ch));// ||(Character.isDigit(ch)) ||(ch==' ') ;
		boolean b2=Character.isDigit(ch);
		boolean b3=ch==' ';
		boolean b4=ch=='.';
		
		
		if(b1==false && b2==false && b3==false && b4==false)
		cnt++;
		
		}
		System.out.println(cnt);
	}
}
