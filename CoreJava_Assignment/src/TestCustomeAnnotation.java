import java.lang.annotation.*;  
import java.lang.reflect.*;  
  
@Retention(RetentionPolicy.RUNTIME)  
@Target({ElementType.TYPE, ElementType.METHOD})  

@interface info{  
//int value() default 101; 
int authorId() default 102;
String date() default "10/8/2021";
String time() default "2.35 PM";
String authorName() default "R. D. Sharma";
String SuperwiserName() default "D. C. Verma";
int version() default 10;
}  
  
@info(authorId=5)  
class Hello{  
	@info(authorId=5)  
public void sayHello(){
		System.out.println("hello annotation");
		}  
}  

class TestCustomeAnnotation{  
public static void main(String args[])throws Exception{  
  
Hello h=new Hello();  
Method m=h.getClass().getMethod("sayHello");  
  
info manno=m.getAnnotation(info.class);  
//System.out.println("value is: "+manno.value());  
System.out.println("AuthorID is: "+manno.authorId()); 
System.out.println("Author Name is: "+manno.authorName()); 
System.out.println("Superwiser Name is: "+manno.SuperwiserName()); 
System.out.println("Date is: "+manno.date());  
System.out.println("Time is: "+manno.time()); 
System.out.println("Version is: "+manno.version()); 
}}  