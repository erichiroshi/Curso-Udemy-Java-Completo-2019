package aula181;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		Shape r1 = new Rectangle(2, 2);
		Shape r2 = new Rectangle(2, 3);

		Shape c1 = new Circle(1);

		List<Shape> list = new ArrayList<Shape>();
		list.add(r1);
		list.add(r2);
		list.add(c1);

		System.out.println("Total area: " + totalArea(list));
		
		List<Circle> myCircles = new ArrayList<Circle>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		
		System.out.println("Total area: " + totalArea(myCircles));
		

	}

	public static double totalArea(List<? extends Shape> list) {

		double sum = 0;

		for (Shape s : list)
			sum += s.area();

		return sum;

	}

}
