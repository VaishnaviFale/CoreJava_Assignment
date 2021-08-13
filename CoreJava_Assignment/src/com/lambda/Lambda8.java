package com.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Lambda8 extends Thread{
        public void run()
        {
        	System.out.println("Thread is running.");

        }
public static void main(String[] args) {
	    Lambda8 t= new Lambda8();
	    t.start();

		List<String> pointList = new ArrayList();
		 
		pointList.add("1");
		pointList.add("2");
		pointList.add("3");
		pointList.add("4");
		pointList.add("5");
		 
		Consumer<List<Integer>>print=list ->list.stream().forEach(a -> System.out.println(a+""));
		pointList.forEach(p ->  { System.out.println(p); } );

	}
}
