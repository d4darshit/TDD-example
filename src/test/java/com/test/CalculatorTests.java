package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cal.Calculator;

class CalculatorTests {

	private Calculator ob;

	@BeforeEach
	public void setCalculatorObj() {
		ob = new Calculator();
	}
	@Test
	public void moreThanTwoNUmbersThrowsException() {
		Assertions.assertThrows(RuntimeException.class, ()->{
			ob.add("1,2,3");
		});
	}
	@Test
	public void WhenInvalidInputIsGiven() {
		Assertions.assertThrows(RuntimeException.class, ()->{
			ob.add("1,two");
		});
	}
	@Test
	public void allowNewLineBetweenNumbers() {
		assertEquals(3,ob.add("1\n2"));
	}
	@Test
	public void whenNoNumbersAreGivenThenReturnZero() {
		assertEquals(0, ob.add(""));
	}
	@Test
	public void addTwoNumbers() {
		assertEquals(10,ob.add("4,6"));
	}
	@Test
	public void whenNegativeNumberIsUsed() {
		Assertions.assertThrows(RuntimeException.class, ()->{
			ob.add("1,-2");
		});
	}
	@Test
	public void whenNegativeNumbersAreUsed() {
		Assertions.assertThrows(RuntimeException.class, ()->{
			ob.add("1,-2,-10,4,8");
		});
	}
	@Test
	public void TestGetCalledCount() {
		ob.getCalledCount();
	}
	@Test
	public void checkForNumbersGreaterThanThousand() {
		assertEquals(2,"1001,2");
	}
	
	@AfterEach
	public void destroyCalculatorObj() {
		ob = null;
	}

}
