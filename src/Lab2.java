import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		double length;
		double width;
		double height;
		double area;
		double perimeter;
		double volume;
		char choice;
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		
		do {
			// enter length and width
			System.out.println("Enter Length: ");
			length = scnr.nextInt();
			System.out.println("Enter Width: ");
			width = scnr.nextInt();

			// area = w * l
			area = width * length;
			System.out.println("Area: " + area);

			// perimeter = 2(l + w)
			perimeter = 2 * (length + width);
			System.out.println("Perimeter: " + perimeter);
			
			// volume = l * w * h
			// to find height. height = area / length
			height = area / length;
			volume = length * width * height;
			System.out.println("Volume: " + volume);

			System.out.println("Continue? (y/n): ");
			choice = scnr.next().charAt(0);

		} while (choice == 'y' || choice == 'Y');

	}

}
