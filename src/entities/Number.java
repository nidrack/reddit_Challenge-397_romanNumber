package entities;

public class Number {

	public Number() {
	}
	
	public static int numCalc(String txt) {
		int sum = 0;
		String[] txt1 = txt.split("(?!^)");
		for (int i = 0; i < txt1.length; i++) {

			char a = txt.charAt(i);
			switch (a) {
			case ('I'):
				sum += 1;
				break;
			case ('V'):
				sum += 5;
				break;
			case ('X'):
				sum += 10;
				break;
			case ('L'):
				sum += 50;
				break;
			case ('C'):
				sum += 100;
				break;
			case ('D'):
				sum += 500;
				break;
			case ('M'):
				sum += 1000;
				break;
			}
		}
		return sum;
	}

	public static boolean numcompare(int a, int b) {
		return a > b;
	}

}
