import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Room room1 = new Room();
		
		System.out.println("Enter number of class: ");
		room1.id = scanner.nextInt();
		
		System.out.println("Enter capacity of class" + room1.id);
		room1.capacity = scanner.nextInt();
		
		System.out.println("How many people have registered in class" + room1.id);
		room1.enrollment = scanner.nextInt();
		
		System.out.print("Class" + room1.id + " has " + room1.capacity + " capacity and ");
		
		if (room1.enrollment >= room1.capacity) {
			System.out.print(room1.statuses());
		}
		else
			System.out.print(room1.statuses2() + (room1.capacity-room1.enrollment) + " capacities left to be completed.");

	}

}
