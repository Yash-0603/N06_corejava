//Program to Demonstrate Switch Case
package org.tnsif.decisionmaking;
import java.util.Scanner;
public class SwitchExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the song number:");

		int songno=s.nextInt();
		switch(songno)
		{
		case 1:
			System.out.println("Wakka Wakka");
			break;
			
		case 2:
			System.out.println("Taki Taki");
			break;
			
		case 3:
			System.out.println("Jai Shree Ram");
			break;
			
		default:
			System.out.println("Wrong song number!!! Please Check it!!!");
		}
		
			
	}

}
