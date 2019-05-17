package com.Theresa.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import com.Theresa.Calculate;

public class CalculateTest {

	Calculate calc = new Calculate();
	int hours;

	@Test
	public void calculateCost1() {
		hours = 2;
		assertEquals(5 ,calc.calculateCost(hours));
	}

	@Test
	public void calculateCost2() {
		hours = 7;
		assertEquals(12 ,calc.calculateCost(hours));
	}
	@Test
	public void calculateCost3() {
		hours = 12;
		assertEquals(15 ,calc.calculateCost(hours));
	}

}
