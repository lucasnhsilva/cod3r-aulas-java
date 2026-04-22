package fundamentals;

import java.util.Date;

/**
 * Classroom explaining imports in Java - similar to Python imports
 */
public class Import {
	public static void main(String[] args) {
		LoggerModule log = new LoggerModule(Import.class);

		Date d = new Date();
		log.info(String.valueOf(d)); // Can use d.toString()

		// JButton button = new JButton();

	}
}
