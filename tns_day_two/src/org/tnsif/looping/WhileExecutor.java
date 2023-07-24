//print any Number to 1 using While Loop
package org.tnsif.looping;

import java.util.Scanner;

public class WhileExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		//printing num to 1
		while(num>=1)
		{
			System.out.print(num+" ");
			num--;
		}

	}

}
