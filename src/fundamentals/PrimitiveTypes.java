package fundamentals;

public class PrimitiveTypes {

	public static void main(String[] args) {
		// Employee informations
		LoggerModule log = new LoggerModule(PrimitiveTypes.class);
		// Integer number types
		byte yearsWithTheCompany = 23; // Must be between -128 and 127
		short numberOfFlights = 542; // Must be between -32768 and 32767
		int id = 56789; // Must be between -2,147,483,648 and 2,147,483,647
		long accumulatedPoints = 3_134_845_223L; // Must be between -2E63 and 2E63

		// Real number types
		float salary = 11_445.44F; // Must be between
		double accumulatedSales = 2_991_797_103.01;

		// Boolean type
		boolean isOnVacancy = false; // Only true or false are accepted;

		// Char type
		char status = 'A'; // Only one character and single quotes are accepted;

		// Days with the company
		log.info("Number of days with the company: " + yearsWithTheCompany * 365);

		// Number of trips
		log.info("Number of trips: " + numberOfFlights / 2);

		// Points per real
		log.info("Points per real: " + accumulatedPoints / accumulatedSales);

		// Employee salary
		log.info(id + ": earns " + salary);

		// Is on vacancy
		log.info("Vancancy? " + isOnVacancy);

		// Status
		log.info("Status: " + status);
	}
}
