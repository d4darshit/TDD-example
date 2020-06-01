package com.cal;

public class Calculator {

	public int add(String string) {
				int sum=0;
				String array[] = string.split(",|\n");
				if(array.length>2) {
					throw new RuntimeException("Only two numbers are allowed");
				}
				else {
					for(String x:array) {
						Integer.parseInt(x);
					}
				}
				for(String x:array) {
					sum += Integer.parseInt(x);
				}
				
				
				return sum;
	
	}

}
