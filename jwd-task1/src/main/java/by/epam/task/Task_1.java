package by.epam.task;

public class Task_1 {
	public static void main(String[] args) {
		System.out.println(findLastNumber(121));
	}

	protected static int findLastNumber(int number) {
		int lastNum = Math.abs(number) % 10;
		switch (lastNum) {
		case 2:
			return 4;
		case 8:
			return 4;
		case 3:
			return 9;
		case 7:
			return 9;
		case 4:
			return 6;
		case 9:
			return 1;
		default:
			return lastNum;
		}
	}
}
