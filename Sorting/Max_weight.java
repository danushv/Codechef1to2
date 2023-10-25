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
		    
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=input.nextInt();
		    }
		    Arrays.sort(arr);
		    int kid=0;
		    int parent=0;
		    if(k<n-k)
		    {
		    for(int i=0;i<k;i++)
		    {
		        kid=kid+arr[i];
		    }
		     for(int i=k;i<n;i++)
		    {
		        parent=parent+arr[i];
		    }
		  //  if(parent<kid)
		  //  {
		  //      int temp=kid;
		  //      kid=parent;
		  //      parent=temp;
		  //  }
		    System.out.println(Math.abs(parent-kid));
		    }
		    if(n-k<=k)
		    {
		        for(int i=0;i<n-k;i++)
		    {
		        kid=kid+arr[i];
		    }
		     for(int i=n-k;i<n;i++)
		    {
		        parent=parent+arr[i];
		    } 
		    System.out.println(Math.abs(parent-kid));
		    }
		}
	}
}
