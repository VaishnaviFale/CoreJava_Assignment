package com.lambda;

interface MyProduct{
	void method1(int price , String s);
}

public class Lambda2 {

	public static void main(String[] args) {
		
		String s2="ACCEPTED";
		String s3="COMPLETED";
		
		MyProduct product= (int price, String s) -> {
			if(price>10000 && s.equals(s2) || s.equals(s3)&&price>10000) {
				System.out.println("YOUR ORDER IS ACCEPTED");
			}
			else {
				System.out.println("YOUR ORDER IS REJECTED");
			}	
		};
		product.method1(200000, "ACCEPTED");
		product.method1(200, "ACCEPTED");
		product.method1(200000, "COMPLETED");

	}

}
