package com.cal;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
	static int count=0;

	public static void incrementCount() {
		count++;
	}
	public static int getCounterValue() {
		return count;
	}

	public int add(String string) {
				int sum = 0;
				List<Integer> negative = new ArrayList<Integer>();
			
				String array[] = string.split(",|\n");
				if(array.length>2) {
					throw new RuntimeException("Only two numbers are allowed");
				}
				else {
					for(String x:array) {
						if(!string.isEmpty()) {
							int temp = Integer.parseInt(x);
							if(temp<0)
								negative.add(temp);
							}
					}
				}
				if (negative.size() >0) {
		            throw new RuntimeException("Negatives not allowed: " + negative.toString());
		        }
				
				for(String x:array) {
					if(!string.isEmpty()) {
						int t = Integer.parseInt(x);
						if(t<=1000)
							sum+=t;
						else
							continue;
						}
				}
				
				
				return sum;
	
	}

	public int getCalledCount() {
		return getCounterValue(); 
	}

}
