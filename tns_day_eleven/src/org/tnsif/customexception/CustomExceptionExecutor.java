package org.tnsif.customexception;
import java.util.Scanner;

public class CustomExceptionExecutor {

	public static void main(String[] args)  {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter userid and password:");
		String userid=s.nextLine();
		String password=s.nextLine();
		
		try
		{
		
		if(userid.equals("skumbhalkar@tnsif.org") && password.equals("Pass@123"))
		{
			System.out.println("Credentials are matched!!!");
		}
		else
		{
			throw new LoginCredentials("Invalid credentials");
		}
		
		}
		catch(LoginCredentials e)
		{
			System.out.println("Exception handled:"+e);
		}
		
	}

}
