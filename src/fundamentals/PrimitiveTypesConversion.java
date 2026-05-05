package fundamentals;

public class PrimitiveTypesConversion {

	/*
	 * Also called "casting" Best practice: avoid using casting, use default data
	 * types like integer for non-decimal values and double for decimal values
	 */

	public static void main(String[] args) {
		LoggerModule log = new LoggerModule(PrimitiveTypesConversion.class);

		double a = 1.1234567890;
		log.info(a);

		double c = 1; // the integer 1 is converted to double implicitly
		log.info(c);
		// Explicit type conversion using "casting" technique
		// In this case will cause data lost because of decimal digits length
		float b = (float) a;
		log.info(b);

		int d = 4;
		// Cannot do this implicitly because Java need to fit the bigger type
		// value into smaller memory space of the new type
		// E.g.: byte e = d;
		// Explicitly we can do that using "casting"
		byte e = (byte) d;
		log.info(e);

	}
}
