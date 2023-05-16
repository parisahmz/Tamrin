//tamrin3-fasl3
package pack1;

import java.util.Scanner;

public class Fisaghores {

	private float num1 , num2;
	
	public void setData() {
		Scanner scanner = new Scanner(System.in);
		float m = num1;
		float n = num2;
		System.out.println("Enter two number to find Pythagorean triples:");
		num1=scanner.nextFloat();
		num2=scanner.nextFloat();

	}

	public void fisa() {
		float side1 = (float) ((Math.pow(num1, 2)) - (Math.pow(num2, 2)));
		float side2 = (2*num1*num2);
		float vatar = (float) ((Math.pow(num1, 2)) + (Math.pow(num2, 2)));
		System.out.println( "side1 is (" + side1 + ") & side2 is (" + side2 + ") & hypotenuse of triangle is (" + vatar + ")");
	}
}
