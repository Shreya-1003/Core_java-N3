package org.tnsif.customexception;

//program to demonstrate in custom exception
import java.util.Scanner;

public class CustomExceptionExecutor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String id = s.nextLine();
		String password = s.nextLine();
		try {
			if
			(id.equals("shreyathorat2002@gmail.com") && password.equals("abc@123")) {
				throw new LoginCredential("Invalid credential");
			}
			else
			{
				throw new LoginCredential("credential matched");
			}
		}
		catch(LoginCredential e)
		{
			System.out.println("exception handled "+e);
		}
		finally {
			System.out.println("finally blocked");
		}
		
 
	}

}
