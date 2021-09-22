import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char again;
		double[] bmiArray;
		int index = 0;
		bmiArray = new double[10];
		
		do {
			System.out.println("Größe in M: ");
			double height = sc.nextDouble();

			System.out.println("Gewicht in KG: ");
			double weight = sc.nextDouble();

			double result = calculateBMI(height, weight);
			
			bmiArray[index++] = result;
			
			System.out.println(bmiArray[0]);
			
			System.out.println("BMI: " + result);
		
			System.out.println("Again?");
			
			again = sc.next().toUpperCase().charAt(0);
			
			System.out.println("Stored: \n" + Arrays.toString(bmiArray));
		} while (again == 'J');
	}
	
	public static double calculateBMI(double height, double weight) {	
		return weight / Math.pow(height, 2);
	}
	
	
}
