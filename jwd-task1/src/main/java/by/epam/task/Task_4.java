package by.epam.task;

public class Task_4 {
	public static void main(String args[]) {
		printIsTrueStatement(1, 0, 6, 7);
	}

	private static void printIsTrueStatement(int a, int b, int c, int d) {
		if (isTrueStatement(a, b, c, d)) {
			System.out.println("Утверждение является истинным");
		} else {
			System.out.println("Утверждение не является истинным");
		}
	}

	protected static boolean isTrueStatement(int a, int b, int c, int d) {
		int count = 0;
		if (isEvenNumber(a)) {
			count++;
		}
		if (isEvenNumber(b)) {
			count++;
		}
		if (isEvenNumber(c)) {
			count++;
		}
		if (isEvenNumber(d)) {
			count++;
		}

		if (count >= 2) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean isEvenNumber(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
