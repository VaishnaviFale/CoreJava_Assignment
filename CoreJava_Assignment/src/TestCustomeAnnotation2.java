
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.annotation.*;  
 

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  

@interface Execute{  
	int sequence() ;
	
}


class TestCustomeAnnotation2 {
	@Execute(sequence=1)
	public void MyMethod1()
	{
		System.out.println("You are in Method 1");
	}
	@Execute(sequence=2)
	public void MyMethod2(String message)
	{
		System.out.println("You are in Method 2");
	}
	@Execute(sequence=3)
	public void MyMethod3(String message)
	{
		System.out.println("You are in Method 3");
	}
	
	public static void main(String[] args) throws Exception
	{
		System.out.println("Invoke method by Name in Java using Reflection!"+'\n');
		
		
		TestCustomeAnnotation2 obj = new TestCustomeAnnotation2();
		
		Class<?> classObj = obj.getClass();

		Method MyMethod1 = classObj.getDeclaredMethod("MyMethod1");
		Method MyMethod2 = classObj.getDeclaredMethod("MyMethod2", String.class);
		Method MyMethod3 = classObj.getDeclaredMethod("MyMethod3", String.class);

		try {
			
			
			MyMethod1.invoke(obj);
			MyMethod2.invoke(obj, "");
			MyMethod3.invoke(obj, "");
		}
		
		catch (InvocationTargetException e)
		{
			System.out.println(e.getCause());
		}
	}
}
