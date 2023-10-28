/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes hereA
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0)
		{ 
		    int n=input.nextInt();
		    int []arr=new int[n];
		    int count=1;
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=input.nextInt();
		    }
		    Arrays.sort(arr);
		    for(int i=0;i<n-1;i++)
		    {
		        if(arr[i]!=arr[i+1])
		        count++;
		    }
		    System.out.println(count);
		}
	}
}
