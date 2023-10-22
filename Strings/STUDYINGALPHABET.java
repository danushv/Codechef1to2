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
		String str=input.nextLine();
		int t=input.nextInt();
		
		while(t-->0)
		{
		    int flag=0;
		    String str1=input.next();
		    
		    for(int i=0;i<str1.length();i++)
		    {
                for(int j=0;j<str.length();j++)
               {
                   if(str1.charAt(i)==str.charAt(j))
                   {
                       flag++;
                   }
               }
		            
		    }
		        
		     if(flag==str1.length())
		    {
		        System.out.println("Yes");
		    }
		    else
		    {
		        System.out.println("No");
		    }
		        
		    
		    
		    
		}
		
	}
}
