package fundamentals;

public class StringType {
	// String are immutable objects, then, String methods are not
	// going to change the original object memory reference value

	public static void main(String[] args) {
		LoggerModule log = new LoggerModule();

		String s = "Good afternoon";
		log.info(s);
		log.info(s.toUpperCase()); // Just output modified, not original string changes
		log.info(s); // See that it keeps the same original value
		log.info(String.valueOf(s.toLowerCase().startsWith("good")));
		log.info(String.valueOf(s.endsWith("noon")));
		log.info(String.valueOf(s.length()));
		log.info(String.valueOf(s.charAt(s.length() - 1)));
		log.info(String.valueOf(s.codePointAt(s.length() - 1)));
		log.info(String.valueOf(s.equalsIgnoreCase("gOoD aftErNoon")));
		log.info(String.format("Hello, and %s", s.toLowerCase()));

		String name = "Peter";
		String lastName = "Cetera";
		byte age = 33;
		double salary = 12345.987;

		String fullName = "%s %s";
		fullName = String.format(fullName, name, lastName);

		String presentation = "Hello %s! As you are %d aged, \nyour new salary will be USD %.2f";

		log.info(String.format(presentation, fullName, age, salary));

	}

}
