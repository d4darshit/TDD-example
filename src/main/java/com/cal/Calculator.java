package com.cal;

public class Calculator {

	public int add(String string) {
				String array[] = string.split(",");
				if(array.length>2) {
					throw new RuntimeException("Only two numbers are allowed");
				}
				else {
					for(String x:array) {
						Integer.parseInt(x);
					}
				}
				return 0;
	
	}

}
