package com.vastika.uis;

import java.util.Scanner;

import com.vastika.uis.controller.UserController;

public class UserTest 
{
    public static void main( String[] args )
    {
		UserController controller = new UserController();
		Scanner input = new Scanner(System.in);
		String decision = "";

		do {

			System.out.println("Enter which db operation do you want to perform? save|update|delete|get|list");
			String choice = input.next();
			
			switch (choice) {
			case "save":
				controller.saveUserInfo(input);
				break;

			case "update":
				controller.updateUserInfo(input);
				break;

			case "delete":
				controller.deleteUserInfo(input);
				break;

			case "get":
				controller.getUserInfo(input);
				break;

			case "list":
				controller.getAllUser();
				break;

			default:
				System.out.println("Wrong choice!");
				break;
			}

			System.out.println("Do you want to continue?");
			decision = input.next();
			System.out.println(decision);
		} while (decision.equalsIgnoreCase("yes"));

		System.out.println("Bye!");

    }
}
