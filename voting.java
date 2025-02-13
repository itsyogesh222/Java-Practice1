package PACK1;

public class voting {

void ageverification(int age) throws Exception {
		
		if(age >18) {
			         System.out.println("age is greater than 18");
	              	}
		else 
		
		{
			throw new ArithmeticException("age is less than 18");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		voting v = new voting();
		
		
	try {
		v.ageverification(19);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
		
			
  System.out.println("inside catch to handel the exception");
			
		
			System.out.println("inside the finally block");
		}

	}


