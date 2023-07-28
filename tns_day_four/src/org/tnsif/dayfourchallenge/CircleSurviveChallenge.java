/* There are n people standing in a circle waiting to be executed.
the counting out begins at some point in the circle and proceeds 
around the circle in the fix direction. in each step a certain no 
of people are skipped and the next person is executed.The elimination
proceeds around the circle (which is becoming smaller and smaller as 
the executed people are removed),until only the last person remains,
who is given freedom.Given the total no of person n and a number K which
is indicates that K-1 person are skipped and the K person is killed in 
a circle.The task is to choose the person in the initial circle that survives */

package org.tnsif.dayfourchallenge;
import java.util.Scanner;
public class CircleSurviveChallenge {

		
		static int survive(int n,int k) {
			
			if(n==1)
			return 1;
			else
				return (survive(n-1,k)+k-1)%n+1;
		}

public static void main (String []args)
{
	Scanner s= new Scanner(System.in);
	System.out.println("Enter a value for n and k:");
	int n=s.nextInt();
	int k=s.nextInt();
	System.out.println(survive(n,k));
	
	
	
}
}
