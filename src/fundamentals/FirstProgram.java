package fundamentals;

import com.sun.tools.javac.Main;

/**
 * @author Lucas Nathan Henrique da Silva
 * @since JDK1.0
 * @see <a href="https://www.linkedin.com/in/lucas-nathan-h-silva" >LinkedIn</a>
 */
public class FirstProgram {

	private static final LoggerModule log = new LoggerModule(Main.class);

	/**
	 * JavaDoc comment
	 * 
	 * @param args you can set an string in this parameter
	 * 
	 */
	public static void main(String[] args) {
//		Logger configuration

		// Line comment
		// A code statement ever ends with a semicolon ";"
		/*
		 * Block comment You can write inside this block comment with endless lines
		 */

		log.info("Hello World!");
	}

}
