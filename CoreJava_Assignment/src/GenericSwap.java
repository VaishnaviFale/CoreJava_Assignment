import java.util.Arrays;
public class GenericSwap{

public static void swap(Object[] a, int i, int j){
Object temp=a[i];
a[i]=a[j];
a[j]=temp;
}

public static void main(String[] args){
String[] a={"1","2"};
System.out.println("before: "+Arrays.toString(a));
swap(a,0,1);
System.out.println("after: "+Arrays.toString(a));
}
}