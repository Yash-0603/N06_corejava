////Program to demonstrate on bunjee jumping using nested if

package org.tnsif.decisionmaking;
import java.util.Scanner;

public class NestedIfExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=s.nextInt();
		
		System.out.println("Enter your Weight:");
		int weight=s.nextInt();
		
		if(age>12)
		{
			if(weight>40)
			{
				System.out.println("Eligible");
				if(weight>110)
				{
					System.out.println("Add extra ropes");
				}
				
			}
			else
			{
				System.out.println("Not Eligible");
			}
			
			
		}
		else
		{
			System.out.println("Not Eligible");
		}
	}

}
