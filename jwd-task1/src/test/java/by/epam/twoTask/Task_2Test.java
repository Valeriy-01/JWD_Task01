package by.epam.twoTask;

import org.junit.Assert;
import org.junit.Test;


public class Task_2Test {

	@Test
	public void testX001() {
		int year = 1600;
		boolean expected = true;
		boolean real = Task_2.isLeap(year);
		Assert.assertEquals(expected, real);
	}

	@Test
	public void testX002() {
		int year = -2004;
		boolean expected = false;
		boolean real = Task_2.isLeap(year);
		Assert.assertEquals(expected, real);
	}

	@Test
	public void testX003() {
		int year = -3;
		int numOfMonth = 2;
		int expected = -1;
		int real = Task_2.daysCounting(year, numOfMonth);
		Assert.assertEquals(expected, real);
	}

	@Test
	public void testX004() {
		int year = 1600;
		int numOfMonth = 2;
		int expected = 29;
		int real = Task_2.daysCounting(year, numOfMonth);
		Assert.assertEquals(expected, real);
	}

}
