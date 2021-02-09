package by.epam.task;

public class Task_8 {

	public static void main(String[] args) {
		double result = valueCalculating(Math.pow(6, (double) 1 / 3));
		System.out.println("Result is " + result);
	}

	protected static double valueCalculating(double arg) {
		if (!isCorrectData(arg)) {
			return Double.NaN;
		}
		if (arg >= 3) {
			return arg * arg + 3 * arg - 9;
		} else {
			return 1 / (Math.pow(arg, 3) - 6);
		}
	}

	private static boolean isCorrectData(double arg) {
		if (Double.isNaN(arg)) {
			return false;
		} else {
			return true;
		}
	}

}
