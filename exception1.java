package PACK1;

public class exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception : " + e);
        }
		
		
	}
	
}
