package PACK1;

public class Student {

	int id;
	String name;
	
	Student()
	{
		id=1;
		name="unknown";
		
	}
	Student(int a)
	{
		id=a;
		name="unknown";
		
	}
	
	Student(String a)
	{
		id=3;
		name=a;
	}
	
	Student (int a,String b)
	{
		id=a;
		name=b;
	}
	void display()
	{
		System.out.println("pack1 student class ID:"+id+" name :"+name);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		s1.display();
		
		Student s2 = new Student(2);
		s2.display();
		
		Student s3 = new Student("yogesh");
		s3.display();
		
		Student s4 = new Student(2,"xyz");
		s4.display();
		
	}
	

}
