package PACK1;

public class autoboxing {

	static int a= 7;
	static Integer obj = Integer.valueOf(a);
	
	static Integer obj1 = a;
	
	public static void main(String[] args) {
	
	System.out.println(a);
	System.out.println(obj);
	System.out.println(obj1);
	
	
	Integer obj2 = new Integer(10);
	
	int a = obj.intValue();
	System.out.println(obj2);
	
	
	}
	
}
