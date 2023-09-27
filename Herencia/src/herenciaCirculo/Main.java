package herenciaCirculo;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Circle circle = new Circle(5.0, "blue");

		System.out.println(circle.getRadius()); // 5.0
		System.out.println(circle.getColor()); // blue
		System.out.println(circle.getArea()); // 78.53981633974483

		circle.setRadius(10.0);
		circle.setColor("green");

		System.out.println(circle.toString()); // Circle[radius=10.0, color=green]
	}

}
