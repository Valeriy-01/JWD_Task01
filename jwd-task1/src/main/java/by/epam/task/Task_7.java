package by.epam.task;

public class Task_7 {

	private static int X_0 = 0; // начало координат
	private static int Y_0 = 0;

	public static void main(String[] args) {
		int result = pointFinding(-3, 0, Double.POSITIVE_INFINITY, 0);
		printResult(result);
	}

	protected static int pointFinding(double x_1, double y_1, double x_2, double y_2) {
		if(!isCorrectData(x_1, y_1, x_2, y_2)) {
			return 2;
		}
		
		double distanceDiff = distanceCalculation(x_1, y_1) - distanceCalculation(x_2, y_2);
		if (distanceDiff < 0) { // Если первая вершина ближе, возвр. 1, вторая -1, на одинаковом расстоянии 0
			return 1;           //Если были введены некорректные данные --   2
		}
		if (distanceDiff > 0) {
			return -1;
		} else {
			return 0;
		}
	}
	
	private static boolean isCorrectData(double x_1, double y_1, double x_2, double y_2) {
		if(Double.isNaN(x_1) || Double.isNaN(x_2) ||Double.isNaN(y_1)||Double.isNaN(y_2)) {
			return false;
		}else {
			return true;
		}
	}

	private static double distanceCalculation(double x, double y) {
		return Math.sqrt((Math.pow(x - X_0, 2) + Math.pow(y - Y_0, 2)));
	}

	private static void printResult(int result) {
		switch (result) {
		case 0:
			System.out.println("Первая и вторая вершины находятся на одинаковом расстоянии");
			break;
		case 1:
			System.out.println("Первая вершина ближе");
			break;
		case -1:
			System.out.println("Вторая вершина ближе");
			break;

		}
	}

}
