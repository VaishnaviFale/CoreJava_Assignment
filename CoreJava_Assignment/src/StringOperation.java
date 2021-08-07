
public class StringOperation {

	public static void main(String[] args) {
		
		String s= "Java String pool refers to collection of String which are sorted in heap memory";
		System.out.println("Original String :"+s);
		System.out.println();
		//a
		System.out.println(s.toLowerCase());
		//b
		System.out.println(s.toUpperCase());
		//c
		System.out.println(s.replace('a','$'));
		//d
		String str1="collection";
		boolean result = s.contains(str1);
	    if(result) 
	      System.out.println(str1 + " is present in the string.");
	    else 
	      System.out.println(str1 + " is not present in the string.");
	    //e
	    String str2="java string pool refers to collection of String which are sorted in heap memory";
	    if(s.equals(str2)) 
	    	System.out.println("Both the String are equals.");
	    else
	    	System.out.println("Both the String are not equals.");
	    	
	}
	

}
