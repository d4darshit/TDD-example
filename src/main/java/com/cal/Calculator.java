package com.cal;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

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
						sum+=Integer.parseInt(x);
						}
				}
				
				
				return sum;
	
	}

}
