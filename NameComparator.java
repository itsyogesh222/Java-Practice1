package PACK1;

import java.util.Comparator;

public class NameComparator implements Comparator<student1> {

	
	

	@Override
	public int compare(student1 o1, student1 o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}
