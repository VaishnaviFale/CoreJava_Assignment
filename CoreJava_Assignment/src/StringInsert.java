
public class StringInsert {

	public static void main(String[] args) {
		String s1=" insert text";
		String s2="It is use to at the specific index position";
		
		StringBuffer sb=new StringBuffer(s2);
		sb.insert(12, s1);
		System.out.println(sb);
	}

}
