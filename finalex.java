package PACK1;

public class finalex {

	private static final String Rutwik = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
        try {
        	
            int ans = 10 / 0;
            
            } 
        
        catch (ArithmeticException e)
        
        {
            System.out.println(e);
        }
       
        
		try {
			
            int[] numbers = {1, 2, 3,4 , 5 , 6 ,7};
            
            System.out.println(numbers[15]);
		    
             }
		
		catch (ArrayIndexOutOfBoundsException e) 
		
		{
            System.out.println(e);
        }
        
        
        
		try {
	            int number = Integer.parseInt("abcdefg");
	        }
		 
		 catch (NumberFormatException e)
		 
		 {
	            System.out.println(e);
	       
		 }
        
		 
		try {
			
            String name = null;
            System.out.println(name.length());
            
        } 
		
		catch (NullPointerException e)
		
	{
            System.out.println(e);
       }
		
		
		try {
			ans = a/b;
			try{
				System.out.println(c[10]);
				
			}
		}
        
	}
        
        
	}


