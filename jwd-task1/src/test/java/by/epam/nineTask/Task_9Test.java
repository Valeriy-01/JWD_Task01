package by.epam.nineTask;

import org.junit.Assert;
import org.junit.Test;



//Pi=~3.141592

public class Task_9Test {

	@Test
	public void testX001() {
		double correctness = 0.01;
		double radius = Double.NEGATIVE_INFINITY;
		double expected = Double.NaN;
		double real = Task_9.searchLenghtCircle(radius);
		Assert.assertEquals(expected, real, correctness);
	}

	@Test
	public void testX002() {
		double correctness = 0.01;
		double radius = 7;
		double expected = 43.981;
		double real = Task_9.searchLenghtCircle(radius);
		Assert.assertEquals(expected, real, correctness);
	}

	@Test
	public void testX003() {
		double correctness = 0.01;
		double radius = Double.POSITIVE_INFINITY;
		double expected = Double.POSITIVE_INFINITY;
		double real = Task_9.seacrhArea(radius);
		Assert.assertEquals(expected, real, correctness);
	}

	@Test
	public void testX004() {
		double correctness = 0.0001;
		double radius = Double.NaN;
		double expected = Double.NaN;
		double real = Task_9.seacrhArea(radius);
		Assert.assertEquals(expected, real, correctness);
	}
	
	@Test
	public void testX005() {
		double correctness = 0.01;
		double radius = 11.49;
		double expected = 414.7532;
		double real = Task_9.seacrhArea(radius);
		Assert.assertEquals(expected, real, correctness);
	}
	
}
