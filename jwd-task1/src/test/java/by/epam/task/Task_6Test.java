package by.epam.task;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;


public class Task_6Test {

	@Test
	public void testX001() {
		int seconds = -3600;
		int[] expected = {-1,-1,-1};
		int[] real=new int[3];
		real[0]=Task_6.hoursFinding(seconds);
		real[1]=Task_6.minutesFinding(seconds);
		real[2]=Task_6.secondsFinding(seconds);
		assertArrayEquals(expected, real);
	}

	@Test
	public void testX002() {
		int seconds = 3200;
		int[] expected = {0,53,3200};
		int[] real=new int[3];
		real[0]=Task_6.hoursFinding(seconds);
		real[1]=Task_6.minutesFinding(seconds);
		real[2]=Task_6.secondsFinding(seconds);
		assertArrayEquals(expected, real);
	}

	@Test
	public void testX003() {
		int seconds = 228000;
		int[] expected = {-1,-1,-1};
		int[] real=new int[3];
		real[0]=Task_6.hoursFinding(seconds);
		real[1]=Task_6.minutesFinding(seconds);
		real[2]=Task_6.secondsFinding(seconds);
		assertArrayEquals(expected, real);
	}

	@Test
	public void testX004() {
		int seconds = 16000;
		int[] expected = {4,266,16000};
		int[] real=new int[3];
		real[0]=Task_6.hoursFinding(seconds);
		real[1]=Task_6.minutesFinding(seconds);
		real[2]=Task_6.secondsFinding(seconds);
		assertArrayEquals(expected, real);
	}
	
}
