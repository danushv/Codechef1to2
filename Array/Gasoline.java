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
		    int [] arr=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=input.nextInt();
		    }
		    int gas=arr[0];
		    int traveled=0;
		  
		  for(int j=1;j<n;j++)
		  {
		       if(gas==0)
		       break;
		       else
		       gas=gas-1+arr[j];
		       traveled=traveled+1;
		      
		  }
                System.out.println(gas+traveled);
		  
		}
	}
}
