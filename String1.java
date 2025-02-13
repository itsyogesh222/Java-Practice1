package PACK1;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = new String ("Hello Yogesh");
		
		 char ch = s.charAt(6);
	        System.out.println("Character at index 2: " + ch); 
	        
	        String upper = s.toUpperCase();
	        System.out.println("Uppercase: " + upper); 
	        
	        String lower = s.toLowerCase();
	        System.out.println("Lowercase: " + lower);
	        
	        String replaced = s.replace("Yogesh", "Goa");
	        System.out.println("Replaced string: " + replaced); 
	        
	        int index = s.indexOf('Y');
	        System.out.println("Index of 'Y': " + index); 


	        
	}

}
