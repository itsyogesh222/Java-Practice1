package PACK1;

public class numberforexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String invalidNumber = "123abc"; 
	        try {
	  int number = Integer.parseInt(invalidNumber); 
	        } 
	 catch (NumberFormatException e) {
	   System.out.println("Number Format Exception occurred: " + e);
	        }
	}
}
