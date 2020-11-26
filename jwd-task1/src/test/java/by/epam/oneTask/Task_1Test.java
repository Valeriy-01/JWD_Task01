package by.epam.oneTask;

import org.junit.Assert;
import org.junit.Test;



public class Task_1Test {

	@Test
	public void testX001() {
		int x = -121;
		int expected = 1;
		int real = Task_1.findLastNumber(x);
		Assert.assertEquals(expected, real);
	}

	@Test
	public void testX002() {
		int x = 27;
		int expected = 9;
		int real = Task_1.findLastNumber(x);
		Assert.assertEquals(expected, real);
	}

	@Test
	public void testX003() {
		int x = -2;
		int expected = 4;
		int real = Task_1.findLastNumber(x);
		Assert.assertEquals(expected, real);
	}

	@Test
	public void testX004() {
		int x = 0;
		int expected = 0;
		int real = Task_1.findLastNumber(x);
		Assert.assertEquals(expected, real);
	}

}
