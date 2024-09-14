package com.systex.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import com.systex.model.LotteryGenerator;

public class Lottery {

	public static void main(String[] args) {

		//測試數據
//		String inputNumbers = " 1 3 5 7 15 20 40 56 @";
//		Integer inputSets = 2;
		Integer inputSets = Integer.parseInt(args[0]);
		String inputNumbers = args[1];
		
		//建立排除號碼List
		String[] excludeNumbers = inputNumbers.trim().split(" ");
		List<Integer> excludeList = new ArrayList<>();
		for(String str:excludeNumbers) {
			if(str.matches("\\d+")) {
				excludeList.add(Integer.parseInt(str));
			}
		}
		//產生樂透號碼
		List<HashSet<Integer>> resultList= LotteryGenerator.generateLottery(inputSets, excludeList);
		for(HashSet<Integer> set:resultList) {
			System.out.println(set);
		}
	}

}
