import java.util.Date;
import java.util.Scanner;

public class Car {
	
	StringBuilder licensePlate = new StringBuilder(6);
	Date startDateTime;
	Date endDateTime;
	
	Car() {
		getLicensePlate();
	}

	void getLicensePlate() {
		System.out.println("Put a license plate number: ");
		Scanner sc = new Scanner(System.in);
		licensePlate.append(sc.nextLine());
		sc.close();
		System.out.println(licensePlate);
	}
}
