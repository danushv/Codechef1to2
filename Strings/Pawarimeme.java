/* package codechef; // don't place package name! Lately, Chef has been inspired by the "pawri" meme. Therefore, he decided to take a string 
�
S and change each of its substrings that spells "party" to "pawri". Find the resulting string.

Input
The first line of the input contains a single integer 
�
T denoting the number of test cases. The description of 
�
T test cases follows.
The first and only line of each test case contains a single string 
�
S.
Output
For each test case, print a single line containing the string after it is modified by Chef.

Constraints
1
≤
�
≤
10
1≤T≤10
1
≤
∣
�
∣
≤
1
0
5
1≤∣S∣≤10 
5
 
�
S contains only lowercase English letters
Sample 1:
Input
Output
3
part
partypartiparty
yemaihuyemericarhaiauryahapartyhorahihai
part
pawripartipawri
yemaihuyemericarhaiauryahapawrihorahihai */

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
	   for(int i=0;i<=t;i++)
	    {
	        String str= input.nextLine();
	        String replacedstr=str.replaceAll("party","pawri");
	        System.out.println(replacedstr);
	    }
	}
}
