package org.tnsif.checkexception;
import java.io.FileInputStream;
public class CheckExceptionDemo {

	public static void main(String[] args) {
		try
		{
		FileInputStream f=new FileInputStream("/Users/yashyogeshwarnandre/eclipse-workspace/tns_day_eleven/src/org/tnsif/checkexception/CheckExceptionDemo.java");
		System.out.println("File is Exist!!!");
				
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
