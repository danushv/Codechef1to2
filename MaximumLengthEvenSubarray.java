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
		Scanner input =new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0)
		{
		    int n=input.nextInt();
		    int sum=((n*(n+1))/2);
		    
		    if(sum % 2==0)
		    {
		        System.out.println(n);
		        
		    }
		    else
		    {
		        System.out.println(n-1);
		    }
		}
	}
}
