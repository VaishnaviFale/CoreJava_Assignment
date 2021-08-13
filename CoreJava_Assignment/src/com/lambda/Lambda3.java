package com.lambda;
import java.util.function.*;

interface MyFunction{
	void method(int a, int b);
}
class Product {
	  private double price = 0.0;

	  public void setPrice(double price) {
	    this.price = price;
	  }

	  public void printPrice() {
	    System.out.println(price);
	  }
	}
public class Lambda3 {
	public static void main(String args[]) {
		
	//Predicate Interface
	Predicate<String> Word = t -> t.length() > 10;
	String s = "Vaishnavi Fale";
	boolean result = Word.test(s);
	System.out.println("Predicate Interface : "+'\n'+result);
	//Consumer Interface
	Consumer<Product> updatePrice = p -> p.setPrice(5.9);
    Product p = new Product();
    updatePrice.accept(p);
    System.out.print("Consumer Interface :"+'\n'+"Product price is : ");p.printPrice();
    //Functional Interface
    MyFunction Function=(a,b) ->  Math.max(a,b);
    Function.method(10, 20);
    System.out.print("Functional Interface :"+'\n'+"Maximun number is : "+20);
    //Supplier Interface
    int n = 3;
    display(() -> n + 10);
	}
    static void display(Supplier<Integer> arg){
    	  System.out.println('\n'+"Supplier Interface :"+'\n'+"Addition is : "+arg.get());
    	
    }

}

