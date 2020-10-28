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
        int t = sc.nextInt();
        for(int i = 0 ; i < t ; i++){
            int n = sc.nextInt();
            int x[][] = new int[n][n];
            for(int j = 0 ; j < n ; j++){
                for(int k = 0 ; k < n ; k++){
                    x[j][k] = sc.nextInt();
                }
            }
            int l = 1 , max = 0;
            for ( l = 1 ; l <= n ; l++){
               for (int r = 0; r < n-l+1 ; r++) {
                    for (int c = 0; c < n-l+1; c++) {
                        int sum=0;
                        for (int k = 0; k < l; k++) {
                            sum+=x[r+k][c+k];

                        }
                        if(sum>max){
                            max=sum;
                        }
                    }
                } 
            }
            System.out.println(max);
        }
	}
}
