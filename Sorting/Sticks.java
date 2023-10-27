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
		    int []arr=new int[n];
		    int count=0;
		    int l=1;
		    int b=0;
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=input.nextInt();
		    }
		    Arrays.sort(arr);
		  //  System.out.print(arr[i]);
		    for(int i=n-1;i>0;i--)
		    {
		        
		        if(arr[i]==arr[i-1]&&count<2)
		        {
		            i--;
		            count++;
		            l=l*arr[i];
		           // System.out.print(arr[i]);
		        }
		    }
		    
		
		    if(count<2)
		    {
		        System.out.println(-1);
		    }
		    else
		        System.out.println(l);
		    
	     }
	}
}
