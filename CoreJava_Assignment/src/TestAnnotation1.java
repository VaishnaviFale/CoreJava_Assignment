import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)


@interface testAnnotation{
	String msg() default "Default Annotation ";
	}

class message{
	String name;

	public message(String name) {
		
		this.name = name;
	}
	@testAnnotation(msg="MyAnnotation")
	public String getName() {
		return name;
	}
	
}
public class TestAnnotation1 {

	public static void main(String[] args) {
		message obj=new message("***Hello Word !***");
		System.out.println(obj.getName());
	/*	Class c=obj.getClass();
		Annotation an=c.getAnnotation(testAnnotation.class);
		testAnnotation t=(testAnnotation)an;
		System.out.println(t.msg());
	*/
	 }
	}