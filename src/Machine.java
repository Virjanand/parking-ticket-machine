import java.util.Scanner;

public class Machine {
	
	Car car;
	
	Machine() {
		car = new Car();
		double money = getMoney();
		System.out.printf("Amount entered: %.2f", money);
	}

	double getMoney() {
		System.out.println("Enter money: ");
		return 10.50;
	}
}
