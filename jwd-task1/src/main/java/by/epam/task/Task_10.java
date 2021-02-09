package by.epam.task;

public class Task_10 {

	public static void main(String[] args) {
		double[] arrResult = valueCalculating(-6.8, 8.1, 0.12);
		printTable(arrResult, -6.8, 8.1, 0.12);
	}

	private static int getSizeArr(double left, double right, double step) {
		int size = 0;
		double value = left + step;
		size++;
		while (value < right) {
			size++;
			value += step;
		}
		size++;
		return size;
	}

	protected static double[] valueCalculating(double left, double right, double step) {
		if (!isCorrectData(left, right, step)) {
			return null;
		}

		double[] arr = new double[getSizeArr(left, right, step)];
		int index = 0;

		arr[index] = Math.tan(left);
		index++;

		double value = left + step;
		while (value < right) {
			arr[index] = Math.tan(value);
			value += step;
			index++;
		}

		arr[index] = Math.tan(right);

		// printTable(arr, left, right, step); //таблицу можно создать и таким образом
		return arr;
	}

	private static void printTable(double[] result, double left, double right, double step) {
		if (result == null) {
			System.out.println("Введены некорректные данные");
		}

		double value = left;
		if (result == null) {
			System.out.println("Прекращение работы программы");
			return;
		}
		for (int i = 0; i < result.length; i++) {
			if (i != result.length - 1) {
				value = left + step * i;
			} else {
				value = right;
			}
			System.out.printf("%.5f                         %.5f\n", value, result[i]);
			System.out.println("-------------------------------------------");
		}
	}

	private static boolean isCorrectData(double left, double right, double step) {
		if (Double.isNaN(left) || Double.isInfinite(left)) {
			return false;
		}
		if (Double.isNaN(right) || Double.isInfinite(right)) {
			return false;
		}
		if (Double.isNaN(step) || Double.isInfinite(step)) {
			return false;
		}
		return true;
	}

}
