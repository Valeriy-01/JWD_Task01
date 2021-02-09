package by.epam.task;

public class Task_6 {
	public static void main(String[] args) {
		printResult(7199);
	}

	private static void printResult(int seconds) {
		System.out.println("Hours are " + hoursFinding(seconds) + ", minutes are " + minutesFinding(seconds)
				+ ", seconds are " + secondsFinding(seconds));
	}

	protected static int hoursFinding(int seconds) {
		if(!isRightData(seconds)) {
			return -1;
		}
		return seconds / 3600;
	}

	protected static int minutesFinding(int seconds) {
		if(!isRightData(seconds)) {
			return -1;
		}
		return seconds / 60;
	}

	protected static int secondsFinding(int seconds) {
		if(!isRightData(seconds)) {
			return -1;
		}
		return seconds;
	}

	private static boolean isRightData(int seconds) {
		if (seconds < 0 || seconds > 24 * 60 * 60) {
			return false;
		} else {
			return true;
		}
	}
}
