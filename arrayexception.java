package PACK1;

public class arrayexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1, 2, 3};
        try {
       System.out.println(array[5]); 
        } catch (ArrayIndexOutOfBoundsException e) {
   System.out.println("Array Index Out of Bounds Exception: " + e);
        }
	}

}
