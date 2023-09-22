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
		   int w1=input.nextInt();
		   int w2=input.nextInt();
		   int x1=input.nextInt();
		   int x2=input.nextInt();
		   int m=input.nextInt();
		   if((w2-w1)>=(x1*m)&&(w2-w1)<=(x2*m))
		   {
		       System.out.println(1);
		   }
		   else
		   {
		        System.out.println(0);
		   }

		   
		}
	}
}
