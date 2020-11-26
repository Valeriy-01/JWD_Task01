package by.epam.nineTask;

public class Task_9 {

	public static void main(String[] args) {
		double radius = 4;
		System.out.println("Длина окружности равна: " + searchLenghtCircle(radius));
		System.out.println("Площадь круга равна: " + seacrhArea(radius));
	}

	protected static double seacrhArea(double radius) {
		if(!isCorrectData(radius)) {
			return Double.NaN;
		}
		return Math.PI * radius * radius;
	}

	protected static double searchLenghtCircle(double radius) {
		if(!isCorrectData(radius)) {
			return Double.NaN;
		}
		return Math.PI * radius * 2;
	}
	
	private static boolean isCorrectData(double radius) {
		if(radius==Double.NEGATIVE_INFINITY || Double.isNaN(radius)) {
			return false;
		}else {
			return true;
		}
	}

}
