package com.aifa.test2;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> aList=new ArrayList<>();
		aList.add("a");
		ArrTest arrTest=new ArrTest();
		arrTest.ins(aList);
		System.out.println(aList.size());
	}

}
