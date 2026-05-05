package fundamentals;

public class ConvertingNumberToString {

	public static void main(String[] args) {
		LoggerModule log = new LoggerModule(ConvertingNumberToString.class);
		Integer num1 = 10000;
		log.info(num1.toString());

		int num2 = 100;
		log.info(String.valueOf(num2));
		log.info(Integer.toString(num2));
		// Concatenate string and integer to get String. Similar to JavaScript
		log.info(("" + num1).length());

		// The same way for Double and Long
	}
}
