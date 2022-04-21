package HalloWelt;

import java.util.Scanner;
import HalloWelt.Data;

public class HalloWelt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sprechen Sie Deutsch?");
		String response = scan.next() + scan.nextLine();
		if (response.toLowerCase().equals("ja")) {
			System.out.println("Sehr gut, wie heissen Sie?");
		} else {
			System.out.println("Perhaps English then? What's your name?");
		}
		String name = scan.next();
		if (response.toLowerCase().equals("ja")) {
			System.out.printf("Freut mich, %s!%n", name);
		} else {
			System.out.printf("Nice to meet you, %s. Try learning German sometime.%n", name);
		}
		
		String[] obst = {"banana", "orange", "apples"};
		String[] desc = {"favorite", "nutritious", "red"};
		
		Data mySet = new Data(desc, obst);
		mySet.printValues();

	}

}
