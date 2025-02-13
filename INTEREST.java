package PACK1;

import java.util.Scanner;

public class INTEREST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter your choice 1. IDFC 2. HDFC . CANERA 3.");
		
         int choice = myobj.nextInt();
		
		switch (choice)
		{
		case 1 :  IDFC obj = new IDFC ();
		obj.interest();
		break ;
		
		case 2 :  HDFC obj1 = new HDFC ();
		obj1.interest();
		break ;
		
		case 3 :  CANERA obj2 = new CANERA ();
		obj2.interest();
		break ;
		
		}
	}

}
