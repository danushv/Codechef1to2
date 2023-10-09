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
		   int x=input.nextInt();
		   int y=input.nextInt();
		   int dist=x*y;
		   int result=0;
		   int []arr=new int[n];
		   for(int i=0;i<n;i++)
		   {
		       arr[i]=input.nextInt();
		   }
		   for(int h=1;h<=100;h++)
		   {
		       Boolean safe=true;
		       for(int i=0;i<n;i++)
		       {
		           int a =arr[i]-dist;
		           if(a<0)
		           {
		               a=1;
		           }
		           int b=arr[i]+dist;
		           if(b>100)
		           {
		               b=100;
		           }
		           if(h>=a&&h<=b)
		           {
		               safe=false;
		           }
	
		              
		       }
		       if(safe)
		        result=result+1;
		   }
		   System.out.println(result);
		   
		}
	
	}
}
