package PACK1;

import java.util.Scanner;

public class CANERA  extends bank {

	@Override
	void interest() {
		// TODO Auto-generated method stub
		
		
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter the  amount ");
		
		double c = myobj.nextDouble();
		double ans = c*6.5*1/100;
	
		System.out.println("the amount after interest"+ ans);
	}

}
