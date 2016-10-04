import java.util.Scanner;

public class Car {
	
	StringBuilder licensePlate = new StringBuilder(6);	
	
	Car() {
		System.out.println("Put a license plate number: ");
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextLine());
	}

}
