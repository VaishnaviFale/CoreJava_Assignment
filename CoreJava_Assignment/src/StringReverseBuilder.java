public class StringReverseBuilder {

	public static void main(String[] args) {
		String s="This method returns the reverse object on which it was called";
		
		StringBuilder sb= new StringBuilder(s);
		System.out.println(sb.reverse());

	}

}
