public class StringAppendBuilder {

	public static void main(String[] args) {
		String s1="String Buffer";
		String s2=" is a peer class of String ";
		String s3="that provide much of ";
		String s4=" the functionality of String";
		
		StringBuilder sb=new StringBuilder(s1);
		System.out.println(sb);
		sb.append(s2);
		System.out.println(sb);
		sb.append(s3);
		System.out.println(sb);
		sb.append(s4);
		System.out.println(sb);
	}

}
