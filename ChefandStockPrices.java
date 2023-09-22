/* package codechef; // don't place pasasackage name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input =new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0)
		{
		    double S=input.nextDouble();
		    double A=input.nextDouble();
		    double B=input.nextDouble();
		    double C=input.nextDouble();
		    
		    double result=(S+((S*C)/100));
		    if(result>=A && result<=B)
		    {
		      System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
	}
}
// 
