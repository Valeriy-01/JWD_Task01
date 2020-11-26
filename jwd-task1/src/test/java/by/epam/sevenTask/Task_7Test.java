package by.epam.sevenTask;

import org.junit.Assert;
import org.junit.Test;



public class Task_7Test {
	@Test
	public void testX001() {
		double coordinates[] = { 1, Double.POSITIVE_INFINITY, 4, 7 };
		int expected = -1;
		int real = Task_7.pointFinding(coordinates[0], coordinates[1], coordinates[2], coordinates[3]);
		Assert.assertEquals(expected, real);
	}

	@Test
	public void testX002() {
		double coordinates[] = { 1.54, 7, 1.54, 7 };
		int expected = 0;
		int real = Task_7.pointFinding(coordinates[0], coordinates[1], coordinates[2], coordinates[3]);
		Assert.assertEquals(expected, real);
	}

	@Test
	public void testX003() {
		double coordinates[] = { 6, Double.NEGATIVE_INFINITY, 4, 11 };
		int expected = -1;
		int real = Task_7.pointFinding(coordinates[0], coordinates[1], coordinates[2], coordinates[3]);
		Assert.assertEquals(expected, real);
	}

	@Test
	public void testX004() {
		double coordinates[] = { -3.1, 4, -8, 7 };
		int expected = 1;
		int real = Task_7.pointFinding(coordinates[0], coordinates[1], coordinates[2], coordinates[3]);
		Assert.assertEquals(expected, real);
	}
	
	@Test
	public void testX005() {
		double coordinates[] = { -3.1, Double.NaN, -8, 7 };
		int expected = 2;
		int real = Task_7.pointFinding(coordinates[0], coordinates[1], coordinates[2], coordinates[3]);
		Assert.assertEquals(expected, real);
	}
}
