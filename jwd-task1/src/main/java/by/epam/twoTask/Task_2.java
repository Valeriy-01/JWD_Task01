package by.epam.twoTask;

public class Task_2 {
	public static void main(String args[]) {
		System.out.println("Количество дней в этом месяце -- " + daysCounting(1600, 2));
		printLeap(1600);
	}

	private static void printLeap(int year) {
		if (isLeap(year)) {
			System.out.println("Год является високосным");
		} else {
			System.out.println("Год не является високосным");
		}
	}

	protected static int daysCounting(int year, int numOfMonth) {
		if (year < 0) {
			return -1;
		}
		if (numOfMonth == 1 || numOfMonth == 3 || numOfMonth == 5) {
			return 31;
		}
		if (numOfMonth == 7 || numOfMonth == 8 || numOfMonth == 10 || numOfMonth == 12) {
			return 31;
		}
		if (numOfMonth == 4 || numOfMonth == 6 || numOfMonth == 9 || numOfMonth == 11) {
			return 30;
		}

		if (numOfMonth == 2) {
			if (isLeap(year)) {
				return 29;
			} else {
				return 28;
			}
		}
		return -1;

	}

	protected static boolean isLeap(int year) {
		if (year <= 0) {
			return false;
		}
		boolean isLeap = false;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			isLeap = true;
		}
		return isLeap;
	}
}
