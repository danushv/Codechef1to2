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
		    int season=input.nextInt();
		    int []intro=new int[season];
		    long tot=0;
		    for(int i=0;i<season;i++)
		    {
		        intro[i]=input.nextInt();
		    }
		    
		    for(int i=0;i<season;i++)
		    {
		        int episodesize=input.nextInt();
		        for(int j=0;j<episodesize;j++)
		        {
		           int dur=input.nextInt();
		            
		            if(j==0)
		            {
		                tot=tot+dur;
		            }
		            else 
		            {
		                tot=tot+dur-intro[i];
		            }
		        }
		    }
		    System.out.println(tot);
		}
	}
}
