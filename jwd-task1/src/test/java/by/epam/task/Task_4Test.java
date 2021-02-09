package by.epam.task;

import org.junit.Assert;
import org.junit.Test;



public class Task_4Test {

	@Test
	public void testX001() {
		int numbers[] = { 1, 3, 4, 7 };
		boolean expected = false;
		boolean real = Task_4.isTrueStatement(numbers[0], numbers[1], numbers[2], numbers[3]);
		Assert.assertEquals(expected, real);
	}

	@Test
	public void testX002() {
		int numbers[] = { -2, -6, -7, -3 };
		boolean expected = true;
		boolean real = Task_4.isTrueStatement(numbers[0], numbers[1], numbers[2], numbers[3]);
		Assert.assertEquals(expected, real);
	}

	@Test
	public void testX003() {
		int numbers[] = { -1, -3, -2, 7 };
		boolean expected = false;
		boolean real = Task_4.isTrueStatement(numbers[0], numbers[1], numbers[2], numbers[3]);
		Assert.assertEquals(expected, real);
	}

	@Test
	public void testX004() {
		int numbers[] = { 1, -8, -4, 6 };
		boolean expected = true;
		boolean real = Task_4.isTrueStatement(numbers[0], numbers[1], numbers[2], numbers[3]);
		Assert.assertEquals(expected, real);
	}

}
