package com.systex.main;

import java.util.Collections;
import java.util.LinkedList;

import com.systex.model.MyDate;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputValue = args[0];
		if(inputValue.matches("\\d+")==false) {
			System.out.println("invalid input value");
			return;
		}
		int reversed = Integer.parseInt(inputValue);
//		int reversed = 1;
		LinkedList<MyDate> dates = new LinkedList<>();
		dates.add(new MyDate(13,9,2024));
		dates.add(new MyDate(11,9,2024));
		dates.add(new MyDate(5,12,2019));
		dates.add(new MyDate(8,10,2025));
		dates.add(new MyDate(25,2,2030));
		dates.add(new MyDate(30,1,2008));
		dates.add(new MyDate(22,3,2004));
		dates.add(new MyDate(17,7,2015));
		dates.add(new MyDate(19,6,2015));
		Collections.sort(dates);
		if(reversed!=0) {
			System.out.println("=====降冪排序=====");
			dates.reversed().forEach(d->{
				System.out.println(d);
			});		
		}else {
			System.out.println("=====升冪排序=====");
			dates.forEach(d->{
				System.out.println(d);
			});			
		}

	}
}
