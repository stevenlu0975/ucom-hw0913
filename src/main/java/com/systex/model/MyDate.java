package com.systex.model;

import java.util.Collection;
import java.util.Collections;

public class MyDate implements Comparable<MyDate>{
	private final short GRETTER_THAN=1;
	private final short LESS_THAN=-1;
	private final short EQUALS=0;
	private int date;
	private int month;
	private int year;
	public MyDate() {
	}
	public MyDate(int date, int modth, int year) {
		super();
		this.date = date;
		this.month = modth;
		this.year = year;
	}

	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int modth) {
		this.month = modth;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return year+"-"+month+"-"+date;
	}
	/**
	 * 按照年月日西續比較，升冪排序
	 * */
	@Override
	public int compareTo(MyDate date) {
		// TODO Auto-generated method stub
		int result=0;

		if((result = compare(this.getYear(), date.getYear()))!=EQUALS) {
			return result;
		}
		if((result = compare(this.getMonth(), date.getMonth()))!=EQUALS) {
			return result;
		}
		if((result = compare(this.getDate(), date.getDate()))!=EQUALS) {
			return result;
		}
		return 0;
	}
	/***
	 * 比較v1,v2，
	 * v1>v2回傳1 , v1==v2回傳0, v1<v2回傳-1
	 * @param v1
	 * @param v2
	 * @return 1,-1,0
	 */
	private int compare(int v1,int v2) {
		if(v1>v2){
			return GRETTER_THAN;
		}
		else if(v1<v2) {
			return LESS_THAN;
		}
		else {
			return EQUALS;
		}
	}
}
