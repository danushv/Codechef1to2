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
		    int val=input.nextInt();
		    int result=0;
		    int count=1;
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=input.nextInt();
		    }
		    Arrays.sort(arr);
		    for(int i=n-1;i>=0;i--)
		    {
		        result=result+arr[i];
		        if(result>=val)
		        {
		            System.out.println(Math.abs(arr.length-count));
		            break;
		        }
		        else
		        count++;
		    }
		    //if(count==2)
		  //  {
		  //      count--;
		  //  }
		    //System.out.println(Math.abs(arr.length-count));
		}
	}
}
