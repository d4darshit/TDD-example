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
	@AfterEach
	public void destroyCalculatorObj() {
		ob = null;
	}

}
