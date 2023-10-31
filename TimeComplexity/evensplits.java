/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0)
		{
		    int n=input.nextInt();
		    String str=input.next();
		    char [] ch=str.toCharArray();
		    if(n==2)
		    {
		    System.out.println(str);
		    continue;
		    }
		    int ones=0,zeros=0;
		    for(int i=0;i<n;i++)
		    {
		        if(ch[i]=='1')
		        ones++;
		        else
		        zeros++;
		    }
		    StringBuilder sb=new StringBuilder();
		    for(int i=0;i<zeros;i++)
		    {
		        sb.append('0');
		    }
		     for(int i=0;i<ones;i++)
		    {
		        sb.append('1');
		    }
		    System.out.println(sb);
		}
	}
}
