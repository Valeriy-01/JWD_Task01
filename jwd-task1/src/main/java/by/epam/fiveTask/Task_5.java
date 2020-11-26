package by.epam.fiveTask;


public class Task_5 {

	public static void main(String[] args) {
		printResult(6);
	}
	
	protected static boolean isPerfect(int num) {
		if(num<=1) {
			return false;
		}
		
		int sum=0;
		for(int i=1;i<num;i++){
			if(num%i==0) {
				sum+=i;
			}
		}
		if(sum==num) {
			return true;
		}else {
			return false;
		}
	}
	
	private static void printResult(int num) {
		if(isPerfect(num)) {
			System.out.println("Число является совершенным");
		}else {
			System.out.println("Число не является совершенным");
		}
	}

}
