package fundamentals;

import java.util.Scanner;

public class ConversionChallenge {
	public static void main(String[] args) {
		// The user want to input 3 salaries and calculate the mean of it
		// try to create a feature for handling comma and point separated values

		Scanner in1 = new Scanner(System.in);
		double salary1, salary2, salary3, mean = 0;
		System.out.println("First salary: ");
		salary1 = Double.parseDouble(in1.nextLine().replace(",", "."));
		System.out.println("Second salary: ");
		salary2 = Double.parseDouble(in1.nextLine().replace(",", "."));
		System.out.println("Third salary: ");
		salary3 = Double.parseDouble(in1.nextLine().replace(",", "."));
		in1.close();
		mean = (salary1 + salary2 + salary3) / 3;
		System.out.println("Salary mean: " + mean);
	}
}
