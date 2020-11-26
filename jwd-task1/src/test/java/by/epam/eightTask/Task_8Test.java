package by.epam.eightTask;

import org.junit.Assert;
import org.junit.Test;



public class Task_8Test {

	@Test
	public void testX001() {
		double correctness = 0.00001;
		double x = 8;
		double expected = 79;
		double real = Task_8.valueCalculating(x);
		Assert.assertEquals(expected, real, correctness);
	}

	@Test
	public void testX002() {
		double correctness = 0.00001;
		double x = 2.99;
		double expected = 0.04823;
		double real = Task_8.valueCalculating(x);
		Assert.assertEquals(expected, real, correctness);
	}

	@Test
	public void testX003() {
		double correctness = 0.00001;
		double x = Double.NEGATIVE_INFINITY;
		double expected = 0;
		double real = Task_8.valueCalculating(x);
		Assert.assertEquals(expected, real, correctness);
	}

	@Test
	public void testX004() {
		double correctness = 0.00001;
		double x = Double.POSITIVE_INFINITY;
		double expected = Double.POSITIVE_INFINITY;
		double real = Task_8.valueCalculating(x);
		Assert.assertEquals(expected, real, correctness);
	}
	
	@Test
	public void testX005() {
		double correctness = 0.00001;
		double x = Double.NaN;
		double expected = Double.NaN;
		double real = Task_8.valueCalculating(x);
		Assert.assertEquals(expected, real, correctness);
	}

}
