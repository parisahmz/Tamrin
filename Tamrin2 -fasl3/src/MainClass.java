
public class MainClass {

	public static void main(String[] args) {
		
		House house1 = new House();
		house1.SetData(67000, 2300);
		System.out.println("Cost of first house is " + house1.calculate());
		
		House house2 = new House();
		house2.SetData(62000, 2500);
		System.out.println("Cost of second house is " + house2.calculate());
		
		House house3 = new House();
		house3.SetData(75000, 1850);
		System.out.println("Cost of third house is " + house3.calculate());
		
	}

}
