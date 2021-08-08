class Pair<K,V>{
	private K key;
	private V value;
	
	public K getKey() {  
		return key;
	}
	public V getValue() {
		return value;
	}
	
	public void setKey(K key) {
		this.key=key;
	}
	public void setValue(V value) {
		this.value=value;
	}	
	
}
public class GenericPair {

	public static void main(String[] args) {
		Pair<String,String> pair= new Pair<>();
		pair.setKey("1");
		pair.setValue("Hello");
		System.out.println();
		System.out.println("  Key is : "+pair.getKey()+"    Value is : "+pair.getValue());
		System.out.println();
		
		Pair<String, java.util.Date> pair2= new Pair<>();
		pair2.setKey("Today is ");
		pair2.setValue(new java.util.Date());
		System.out.println("  Key is : "+pair2.getKey()+"    Value is : "+pair2.getValue());
		System.out.println("  "+pair2.getKey()+""+pair2.getValue());
		
	}

}
