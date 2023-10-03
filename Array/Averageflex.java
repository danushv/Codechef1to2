/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes InheritableThreadLocal
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0)
		{
		    int n=input.nextInt();
		    int [] arr=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=input.nextInt();
		    }
		    int mid=(n*(n+1)/2);
		    int result=0;
		    for(int i=0;i<n;i++)
		    {
		        int boastcount=0;
		        int nonboast=0;
		        
		        for(int j=0;j<n;j++)
		        {
		            
		            if(arr[j]<=arr[i])
		            {
		                
		                boastcount++;
		            }
		            else{
		                nonboast++;
		            }
		        }
		        if(boastcount>nonboast)
		        {
		            result++;
		        }
		    }
		    System.out.println(result);
		}
	}
}
