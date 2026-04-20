package fundamentals;

/**
 * @author Lucas Silva
 * @apiNote Type-inference class
 */
public class Inference {

	public static void main(String[] args) {

		LoggerModule log = new LoggerModule(Inference.class);

		double a = 4.5; // Not inferred type

		log.info(String.valueOf(a));

		var b = 4.7; // Inferred double type

		log.info(String.valueOf(b));

		String c = "Jonas";

		// c = 4.5 // cannot be done, because the types are not dynamic

		log.info(c);
	}

}
