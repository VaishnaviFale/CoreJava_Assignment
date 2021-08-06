abstract class Shape
{
   abstract void draw();
   void show()
   {
	   System.out.println();
	   System.out.println("***We are in Abstract Class***");
   }
}

class Line extends Shape
{
	void draw() {
		System.out.println("***Drawing Line in Base Class .***");
		
	}
	
}

class Square extends Shape
{
	void draw() {
		System.out.println("***Drawing Square in Base Class .***");
		
	}
}

class Circle extends Shape
{
	void draw() {
		System.out.println("***Drawing Circle in Base Class .***");
		
	}
}

public class ShapeMain 
{
 public static void main(String args[]) {
	 Shape obj1=new Line();
	 obj1.show();
	 System.out.println();
	 obj1.draw();
	 Shape obj2=new Square();
	 obj2.draw();
	 Shape obj3=new Circle();
	 obj3.draw();
	 
 }
}
