/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t, n, a[][], i, j;
		
		t = sc.nextInt();
		
		while(t-->0)
		{
		    n = sc.nextInt();
		    a = new int[n][n];
		    
		    for(i = 0; i < n; i++)
		        for(j = 0; j < n; j++)
		            a[i][j] = sc.nextInt();
		            
		    for(i = n-2; i >= 0; i--)
		        for(j = n-2; j >= 0; j--)
		            a[i][j] += a[i+1][j+1];
		            
		    j = 0;
		    for(i = 0; i < n; i++)
		        if(a[0][i] > j)
		            j = a[0][i];
		            
		    for(i = 1; i < n; i++)
		        if(a[i][0] > j)
		            j = a[i][0];
		            
		    System.out.println(j);
		}
	}
}
