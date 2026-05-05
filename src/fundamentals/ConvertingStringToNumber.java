package fundamentals;

import javax.swing.JOptionPane;

public class ConvertingStringToNumber {
	public static void main(String[] args) {
		LoggerModule log = new LoggerModule(ConvertingStringToNumber.class);

		String value1 = JOptionPane.showInputDialog("Type the first number");
		log.info(value1);
		String value2 = JOptionPane.showInputDialog("Type the second number");
		log.info(value2);

		log.info(value1 + value2); // Still string, will concatenate

		double number1 = Double.parseDouble(value1);
		double number2 = Double.parseDouble(value2);

		double sum = number1 + number2;

		log.info("The sum is: " + sum);
		log.info("The mean is: " + sum / 2);

	}
}
