package com.lambda;

interface MyAdd{
	void method1(int a,int b);
}


public class Lambda1 {

	public static void main(String[] args) {
		
		MyAdd add=(int a, int b) -> {
			System.out.println("Addition of two numbers is :"+ (a+b));
			System.out.println("Substraction of two numbers is :"+ (a-b));
			System.out.println("Division of two numbers is :"+a/b);
			System.out.println("Multiplication of two numbers is :"+a*b);
			
		};
		
		add.method1(60,20);
	}

}
