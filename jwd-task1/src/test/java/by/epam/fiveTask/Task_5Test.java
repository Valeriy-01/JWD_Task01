package by.epam.fiveTask;

import org.junit.Assert;
import org.junit.Test;



public class Task_5Test {
	
	@Test
	public void testX001() {
		int num=26;
		boolean expected= false;
		boolean real =Task_5.isPerfect(num);
		Assert.assertEquals(expected, real);
	}

	@Test
	public void testX002() {
		int num=-37;
		boolean expected= false;
		boolean real =Task_5.isPerfect(num);
		Assert.assertEquals(expected, real);
	}

	@Test
	public void testX003() {
		int num=496;
		boolean expected= true;
		boolean real =Task_5.isPerfect(num);
		Assert.assertEquals(expected, real);
	}
	
	@Test
	public void testX004() {
		int num=-6;
		boolean expected= false;
		boolean real =Task_5.isPerfect(num);
		Assert.assertEquals(expected, real);
	}
}
