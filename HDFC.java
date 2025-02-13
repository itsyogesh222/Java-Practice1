package PACK1;

import java.util.Scanner;

public class HDFC  extends bank {

	@Override
	void interest() {
		// TODO Auto-generated method stub
		
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter the  amount ");
		
		double b = myobj.nextDouble();
		double ans = b*5.5*1/100;
	
		System.out.println("the amount after interest"+ ans);
		
		
	}

	
	
}
