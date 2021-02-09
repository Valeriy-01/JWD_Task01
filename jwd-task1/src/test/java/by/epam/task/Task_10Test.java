package by.epam.task;

import org.junit.Assert;
import org.junit.Test;


public class Task_10Test {

	@Test
	public void testX001() {
		double correctness = 0.01;
		double[] data = { -1.8, 2, 0.75 };
		double[] expected= {4.286,-1.743,-0.309,0.483,2.572,-2.509,-2.185};
		double[] real =Task_10.valueCalculating(data[0], data[1], data[2]);
		Assert.assertArrayEquals(expected, real, correctness);
	}

	@Test
	public void testX002() {
		double correctness = 0.01;
		double[] data = { Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, 2 };
		double[] expected= null;
		double[] real =Task_10.valueCalculating(data[0], data[1], data[2]);
		Assert.assertArrayEquals(expected, real, correctness);
	}

	@Test
	public void testX003() {
		double correctness = 0.01;
		double[] data = { -1.8, 2, Double.NaN };
		double[] expected= null;
		double[] real =Task_10.valueCalculating(data[0], data[1], data[2]);
		Assert.assertArrayEquals(expected, real, correctness);
	}

}
