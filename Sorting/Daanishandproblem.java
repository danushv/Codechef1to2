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
		    int n=10;
		    int result=0;
		    int[]arr=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=input.nextInt();
		    }
		    int k=input.nextInt();
		    for(int i=n-1;i>0;i--)
		    {
		        if(k==0)break;
		        
		            int subtract=Math.min(k,arr[i]);
		             k=k-subtract;
		            arr[i]-=subtract;

		
		    }
		    for(int i=n-1;i>=0;i--)
		    {
		        if(arr[i]!=0)
		        {
		  
		        System.out.println(i+1);
		       
		        break;
		        }
		    }
		   
		}
	}
}
