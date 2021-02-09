package by.epam.task;

public class Task_3 {
	public static void main(String args[]) {
		System.out.println("Площадь малого квадрата: " + searchSmallArea(16));
		System.out.println("Отношение площадей " + seacrhAreaRatio(16));
	}

	protected static double searchSmallArea(double bigArea) {
		if (bigArea < 0 || Double.isNaN(bigArea)) {
			return Double.NaN;
		}
		double side = searchSideOfSmallSquare(searchRadius(bigArea));
		return side * side;
	}

	protected static double seacrhAreaRatio(double bigArea) {
		if (bigArea < 0 || Double.isNaN(bigArea)) {
			return -1;
		}
		return bigArea / searchSmallArea(bigArea);
	}

	private static double searchSideOfSmallSquare(double radius) {
		return radius * Math.sqrt(2);
	}

	private static double searchRadius(double area) {
		return (Math.sqrt(area)) / 2;
	}
}
