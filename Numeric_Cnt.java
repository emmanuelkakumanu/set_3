import java.util.*;
import java.lang.*;
import java.io.*;

class Numeric_Cnt
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int c=0;
		for(int i=0;i<str.length();i++)
		if(Character.isDigit(str.charAt(i)))
		c++;
		System.out.println(c);
	}
}
