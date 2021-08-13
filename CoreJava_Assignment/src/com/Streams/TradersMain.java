package com.Streams;
import java.util.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class TradersMain {
	public static void main(String args[]){ 
		
	List<Traders> tr=new ArrayList<>();
	
	Traders tr1=new Traders("Vaishnavi","Mumbai");
	Traders tr2=new Traders("Aishwarya","Ashti");
	Traders tr3=new Traders("Tanuj","Dholakpur");
	Traders tr4=new Traders("Gaurav","Pune");
	
	tr.add(tr1);
	tr.add(tr2);
	tr.add(tr3);
	tr.add(tr4);
	
	List<Transaction> t=new ArrayList<>();
	
	Transaction t1=new Transaction(tr1,2011,100);
	Transaction t2=new Transaction(tr2,2011,200);
	Transaction t3=new Transaction(tr3,2022,300);
	Transaction t4=new Transaction(tr4,2023,400);

	t.add(t1);
	t.add(t2);
	t.add(t3);
	t.add(t4);
	
	//8
	t.stream()
	.filter(p -> p.getYear()==2011)
	.sorted(Comparator.comparing(Transaction::getValue))
	.forEach(name-> System.out.println(name));
	
	//9
	List<Traders> distinctElements = tr.stream().filter(distinctByKey(c -> c.getCity()))
			.collect(Collectors.toList());
	System.out.println("Unique city :"+distinctElements);
	
	//10
	tr.stream()
	.filter(p -> p.getCity().matches("Pune"))
	.sorted(Comparator.comparing(Traders::getName))
	.forEach(name-> System.out.println(name));
	
	//11
			StringBuilder str=new StringBuilder();
			tr.stream()
			.sorted(Comparator.comparing(Traders::getName))
			.forEach((Traders)-> {
				str.append(Traders.getName());});
			System.out.println(str);
			
	//12
			tr.stream()
			.filter(p -> p.getCity().matches("Indore"))
			.forEach(System.out::println);
			
	//13
			tr.stream()
			.filter(p -> p.getCity().matches("Delhi"))
			.forEach(System.out::println);
			
	//14
			Transaction maxi= t.stream()
			.max(Comparator.comparingInt(Transaction::getValue)).get();
			System.out.println("Maximum Value is :"+maxi.value);
			
			
	//15
			Transaction mini= t.stream()
					.min(Comparator.comparingInt(Transaction::getValue)).get();
			System.out.println("Minimum Value is :"+mini.value);

}
	public static <T> Predicate<T> distinctByKey(Function <? super T, Object > KeyExtractor){
		Map<Object, Boolean> seen = new ConcurrentHashMap<>();
		return t -> seen.putIfAbsent(KeyExtractor.apply(t), Boolean.TRUE)== null;
		
			
}
}
















