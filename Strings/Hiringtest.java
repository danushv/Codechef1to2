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
		Scanner input =new Scanner(System.in);
		int t= input.nextInt();
		while(t-->0)
		{
		    int cand=input.nextInt();
		    int ques=input.nextInt();
		    int full=input.nextInt();
		    int partial=input.nextInt();
		    for(int i=0;i<cand;i++)
		    {
		        String str=input.next();
		        int fs=0;
		        int ps=0;
		        for(char c:str.toCharArray())
		        {
		            if(c=='F')
		            fs++;
		            else if(c=='P')
		            ps++;
		        }
		        if(fs>=full||(fs==full-1 &&ps>=partial))
		        System.out.print("1");
		        else
		        System.out.print("0");
		    }
		    System.out.println();
		    
		}
	}
}
