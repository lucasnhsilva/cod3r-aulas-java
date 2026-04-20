package fundamentals;

public class Temperature {

	public static void main(String[] args) {
		LoggerModule log = new LoggerModule(Temperature.class);

		final double factor = 5.0 / 9;
		final double diff = 32.0;

		double fahrenheit = 86;
		double celsius = (fahrenheit - diff) * factor;

		log.info("Graus ".concat(String.valueOf(celsius)).concat("°C"));
	}
}
