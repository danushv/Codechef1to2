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
		    int a=input.nextInt();
		    int b=input.nextInt();
		    int []arr=new int[10];
		    arr[0]=6;
		    arr[1]=2;
		    arr[2]=5;
		    arr[3]=5;
		    arr[4]=4;
		    arr[5]=5;
		    arr[6]=6;
		    arr[7]=3;
		    arr[8]=7;
		    arr[9]=6;
		    int result =a+b;
		    int total=0;
		    while(result>0)
		    {
		        int d=result%10;
		        total=total+arr[d];
		        result=result/10;
		    }
		    System.out.println(total);
		}
		}
}
