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
		    long count=0;
		    String str=input.next();
		    for(int i=0;i<n;i++)
		    {
		        if(str.charAt(i)=='1')
		        {
		            count++;
		        }
		    }
		    long result=0;
		    for(long i=count;i>0;i--)
		    {
		        result=result+i;
		    }
		    System.out.println(result);
		    
		}
	}
}
