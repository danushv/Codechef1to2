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
		    int result=0;
		    int min=Integer.MAX_VALUE;
		      int max=Integer.MIN_VALUE;
		    
		    int []arr=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=input.nextInt();
		        //System.out.println(arr[i]);
		    }
		    if(n==1||n==0)
		    {
		        System.out.println("0");
		       
		        
		    }
		  //  for(int j=0;j<n-1;j++)
		  //  {
		  //      if(arr[j]!=arr[j+1])
		  //      {
		  //          result=Math.abs(arr[j+1]-arr[j]);
		  //          System.out.println(result);
		  //          break;
		           
		  //      }
		  //      else
		  //      {
		  //          System.out.println("0");
		  //         break;
		  //      }
		  //  }
		  
		  if(n>1)
		  {
		  for(int j=0;j<n;j++)
		  {
		      
		      
		      if(arr[j]>max)
		      max=arr[j];
		      if(arr[j]<min)
		      min=arr[j];
		  }
		    System.out.println(Math.abs(max-min));
		  }
		}
	}
}
