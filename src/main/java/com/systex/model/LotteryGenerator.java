package com.systex.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LotteryGenerator {
	/**
	 * @param sets 產生幾組
	 * @param excludeList 排除號碼
	 * @return List<HashSet<Integer>> 產生結果
	 * */
	public static List<HashSet<Integer>> generateLottery(Integer sets,List<Integer> excludeList) {
		if(sets<=0) return null;
		List resutList = new ArrayList<>();
		while(resutList.size()<sets) {
			HashSet<Integer> set = new HashSet<>();
			while(set.size()<6) {
				Integer temp = (int)(Math.random()*49)+1;
				if(excludeList.contains(temp)==true) continue;
				set.add(temp);
			}
			resutList.add(set);
		}
		
		return resutList;
	}
}
