package com.Streams;

import java.util.ArrayList;
import java.util.List;

public class NewsMain {

	public static void main(String[] args) {
		
		List <News> n= new ArrayList<News>();
		News n1= new News(1,"Vaishnavi","Tanuj","Very Nice");
		News n2= new News(2,"Rushikesh","Gaurav","Very good");
		News n3= new News(3,"Aishwarya","Vijay","Its bad");
		News n4= new News(4,"Rudrani","Aniket","Need to improve your Budget");
		News n5= new News(5,"Shyam","Bhuyar","Stay out from here");
		
		n.add(n1);
		n.add(n2);
		n.add(n3);
		n.add(n4);
		n.add(n5);
		
		long count =n.stream()
				.filter(f->f.getComment().toLowerCase().contains("Budget".toLowerCase())).count();
		 System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println("Budget Count is :"+count);
		 System.out.println();
		 System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		 
		n.forEach((News)-> {
			System.out.println("Name of User :"+News.getCommentByUser()+"   Comment is :"+News.getComment());
		});
	
	}

}
