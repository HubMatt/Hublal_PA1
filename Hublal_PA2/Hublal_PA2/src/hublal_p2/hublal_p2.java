package hublal_p2;
import java.util.Scanner;
import java.lang.Math;
public class hublal_p2 {
	public static void main(String[] args) {
		int formula;
		double bMI,weight,height;
		Scanner scnr = new Scanner(System.in);
		System.out.printf("Enter 0 to use the first formula and 1 to use the second formula\n");		
		formula = scnr.nextInt();
		if (formula == 0) {
			System.out.printf("Enter weight in pounds:\n");
			weight = scnr.nextDouble();
			System.out.printf("Enter height in inches:\n");
			height = scnr.nextDouble();
			bMI = (703*weight)/	(Math.pow(height,2));
			System.out.printf("%f",bMI);
		}
		else if (formula == 1) {
			System.out.printf("Enter weight in kilograms:\n");
			weight = scnr.nextDouble();
			System.out.printf("Enter height in meters:\n");
			height = scnr.nextDouble();
			bMI = (weight)/(Math.pow(height,2));
			System.out.printf("%f\n",bMI);
		}
		System.out.println("\nUnderweight if BMI is less than 18.5\nNormal weight if BMI is in the range of 18.5 to 24.9\nOverweight if BMI is in the range of 25 to 29.9\nObese if BMI is 30 or greater");
		scnr.close();
	}	
}