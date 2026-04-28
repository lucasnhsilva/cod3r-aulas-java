package fundamentals;

public class PrimitiveVsObject {

	public static void main(String[] args) {
		LoggerModule log = new LoggerModule(PrimitiveVsObject.class);
		// Wrappers are the object version from primitive types
		// They have methods and properties

		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt("10000");
		Long l = 100000L;

		log.info(b);
		log.info(s.toString());
		log.info(i * 3);
		log.info(l / 3.0);

		Float f = 195.43F;

		log.info("isNaN: " + f.isNaN());

		Boolean bool = true;

		log.info(Boolean.parseBoolean("true"));
		log.info(bool.toString());

		Character ch = '$';

		log.info(ch);

	}
}
