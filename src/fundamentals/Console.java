package fundamentals;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		LoggerModule log = new LoggerModule(Console.class);

		Scanner scanner = new Scanner(System.in);

		// User sign-up flow
		log.info("Enter your name: ");
		String name = scanner.nextLine();

		log.info("Enter your age: ");
		int age = Integer.parseInt(scanner.nextLine());

		log.info("Enter your job position: ");
		String job = scanner.nextLine();

		log.info("%s is %d and work as %s", name, age, job);
		scanner.close();

	}
}
