import java.util.*;  
public class LinkedListBday{  
 public static void main(String args[]){ 
	  LinkedList<Date> al=new LinkedList<Date>(); 
      Date d1=new Date(23,12,2000);
    
     
      System.out.println("For the date : "+d1.getDate()+"-"+d1.getMonth()+"-"+d1.getYear());
      int a,c;
      int y=d1.getYear();
      if(y!=0)
       {
        a=(y%400==0)?(c=1):((y%100==0)?(c=0):((y%4==0)?(c=1):(c=0)));       
        if(a==1) 
        System.out.println(y+" is a leap year");       
     	else
        System.out.println(y+" is not a leap year");                       
       }
        else
        System.out.println("year zero does not exist ");   
      
      Iterator<Date> itr=al.iterator();  
      while(itr.hasNext()){  
      System.out.println(itr.next());  
  }  
 }  
}  