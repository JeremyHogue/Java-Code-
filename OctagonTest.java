public class OctagonTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Octagon octagon1 = new Octagon(5);
		
		System.out.printf("Area of the octagon with side value 5.00 is %.2f", octagon1.getArea());
		System.out.printf("\nPerimeter of the octagon with side value 5.00 is %.2f", octagon1.getPerimeter());
		System.out.printf("\nComparison result between an octagon and its clone: ");
		
		Octagon octagon2 = (Octagon)octagon1.clone();
		int result = (octagon1.compareTo(octagon2));
		if (result == 1)
			System.out.println("1");
		else if (result == -1)
			System.out.println("-1");
		else 
			System.out.println("0");
	}
}