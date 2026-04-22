package fundamentals;

public class DotNotation {

	public static void main(String[] args) {
		LoggerModule log = new LoggerModule(DotNotation.class);

		String s = "Bom dia!"; // Not primitive type
		s = s.toUpperCase();

		s = s.replace("O", "0");
		log.info(s);

		// Primitive types doesn't have the dot operator "." for accessing attributes
		// and methods
	}
}
