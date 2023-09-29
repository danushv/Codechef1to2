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
		    int count=0;
		    int seven=7;
		    int [] arr=new int[n];
		    for(int j=0;j<n;j++)
		    {
		        arr[j]=input.nextInt();
		    }
		    for(int i=0;i<n&&seven>0;i++)
		    {
		        if(arr[i]>7)
		        count++;
		        else if(arr[i]>0&&arr[i]<=7)
		        seven--;
		    }
		    
		    System.out.println(count+7);
		
		}
	}
}
