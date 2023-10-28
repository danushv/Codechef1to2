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
		    int []freq=new int[n];
		    int visited=-1;
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=input.nextInt();
		    }
		    for(int i=0;i<n;i++)
		    {
		        int count=1;
		        for(int j=i+1;j<n;j++)
		        {
		            if(arr[i]==arr[j])
		            {
		                count++;
		                freq[j]=visited;
		            }
		            if(freq[i]!=visited)
		            {
		                freq[i]=count;
		            }
		        }
		    }
		    int max=freq[0];
		    for(int i=0;i<freq.length;i++)
		    {
		        if(freq[i]>max)
		        max=freq[i];
		    }
		    System.out.println(Math.abs(arr.length-max));
		}
	}
}
