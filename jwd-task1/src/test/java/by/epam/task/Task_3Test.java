package by.epam.task;

import org.junit.Assert;
import org.junit.Test;


public class Task_3Test {

	@Test
	public void testX001() {
		double correctness = 0.00001;
		double bigArea = 120;
		double expected = 60;
		double real = Task_3.searchSmallArea(bigArea);
		Assert.assertEquals(expected, real, correctness);
	}

	@Test
	public void testX002() {
		double correctness = 0.00001;
		double bigArea = 225;
		double expected = 112.5;
		double real = Task_3.searchSmallArea(bigArea);
		Assert.assertEquals(expected, real, correctness);
	}

	@Test
	public void testX003() {
		double correctness = 0.00001;
		double bigArea = -240;
		double expected = -1;
		double real = Task_3.seacrhAreaRatio(bigArea);
		Assert.assertEquals(expected, real, correctness);
	}

	@Test
	public void testX004() {
		double correctness = 0.00001;
		double bigArea = 360;
		double expected = 2;
		double real = Task_3.seacrhAreaRatio(bigArea);
		Assert.assertEquals(expected, real, correctness);
	}

	@Test
	public void testX005() {
		double correctness = 0.00001;
		double bigArea = Double.NEGATIVE_INFINITY;
		double expected = Double.NaN;
		double real = Task_3.searchSmallArea(bigArea);
		Assert.assertEquals(expected, real, correctness);
	}

	@Test
	public void testX006() {
		double correctness = 0.00001;
		double bigArea = Double.POSITIVE_INFINITY;
		double expected = Double.POSITIVE_INFINITY;
		double real = Task_3.searchSmallArea(bigArea);
		Assert.assertEquals(expected, real, correctness);
	}

	@Test
	public void testX007() {
		double correctness = 0.00001;
		double bigArea = Double.NaN;
		double expected = Double.NaN;
		double real = Task_3.searchSmallArea(bigArea);
		Assert.assertEquals(expected, real, correctness);
	}

}
