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
		    int k=input.nextInt();
		    int result=0;
		    int x=0;
		   // int []arr=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        x=input.nextInt();
		        if(x>k)
		        continue;
		        if(k%x==0)
		        {
		           result=Math.max(x,result); 
		        }
		    }
		  
		    if(result==0)
		    System.out.println("-1");
		    else
		    System.out.println(result);
		}
	}
}
