package fundamentals;

/**
 * @author Lucas Silva
 * @since JDK1.0
 * @see <a href="https://www.linkedin.com/in/lucas-nathan-h-silva" >LinkedIn</a>
 */
public class CircumferenceArea {
	private double area;
	private double radius;
	private final double PI = 3.14159;

	public CircumferenceArea(double radius) {
		this.setRadius(radius);
	}

	/**
	 * 
	 * @return area calculus result
	 */
	public double getArea() {
		return area;
	}

	private void calculateArea() {
		this.area = this.PI * this.radius * this.radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
		this.calculateArea();
	}

	public static void main(String[] args) {
		double radius = 1;
		CircumferenceArea circumference = new CircumferenceArea(radius);
		// Constant due to final word

		LoggerModule log = new LoggerModule(CircumferenceArea.class);
		log.info("Area = ".concat(String.valueOf(circumference.getArea())));

		radius = 4;
		circumference.setRadius(radius);
		log.info("Area = ".concat(String.valueOf(circumference.getArea())));

	}
}
