/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes herenner
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0)
		{
		    int n=input.nextInt();
		    int p=input.nextInt();
		    int x=input.nextInt();
		    int y=input.nextInt();
		    int result=0;
		    
		    int [] arr =new int [n];
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=input.nextInt();
		    }
		    
		    
		    
		    for(int i=0;i<p;i++)
		    {
		        if(arr[i]==0)
		        {
		            result=result+x;
		        }
		        else if(arr[i]==1)
		        {
		            result=result+y;
		        }
		    }
		    
		    System.out.println(result);
		}
	}
}
