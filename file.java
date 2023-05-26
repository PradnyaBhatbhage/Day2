public class IndexCharacter {

	public static void main(String[] args) {
		
		String str="Java Exercises!";
		System.out.println("Original String : "+str);
		
		//taking index value
		
		int index1=str.charAt(0);
		int index2=str.charAt(10);
		
		//display output
		
		System.out.println("The character at position 0 is "+(char)index1);
		System.out.println("The character at position 10 is "+(char)index2);	
	}
}

