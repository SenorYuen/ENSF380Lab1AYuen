/**
 * <h1>Application.java</h1>
 * <P>
 * This is an introduction to Eclipse
 * Lab 1, Exercise 2
 * </p>
 * <p>
 * <b>Submission Date:</b> July 4th, 2024</p>
 * @author Adam Yuen
 * @Version 1.0
 * 
 */
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		do {
			String operation;
			if (args.length > 0) {
				operation = args[0];
			}
			else {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter operation (add, subtract, multiply, divide, factorial): ");
				operation = scanner.next();
			}
			Scanner operand_retriever = new Scanner(System.in);
			double num1;
			double num2;
			switch(operation.toLowerCase()) {
			case "add":
				System.out.println("Enter operand 1: ");
				num1 = operand_retriever.nextDouble();
				System.out.println("Enter operand 2: ");
				num2 = operand_retriever.nextDouble();
				System.out.println("Result: " + add(num1, num2));
				break;
			case "subtract":
				System.out.println("Enter operand 1: ");
				num1 = operand_retriever.nextDouble();
				System.out.println("Enter operand 2: ");
				num2 = operand_retriever.nextDouble();
				System.out.println("Result: " + subtract(num1, num2));
				break;
			case "multiply":
				System.out.println("Enter operand 1: ");
				num1 = operand_retriever.nextDouble();
				System.out.println("Enter operand 2: ");
				num2 = operand_retriever.nextDouble();
				System.out.println("Result: " + multiply(num1, num2));
				break;
			case "divide":
				System.out.println("Enter operand 1: ");
				num1 = operand_retriever.nextDouble();
				System.out.println("Enter operand 2: ");
				num2 = operand_retriever.nextDouble();
				System.out.println("Result: " + divide(num1, num2));
				break;
			case "factorial":
				System.out.println("Enter a number: ");
				num1 = operand_retriever.nextDouble();
				System.out.println("Result: " + factorial(num1));
				break;
			case "sine":
				System.out.println("Enter a number: ");
				num1 = operand_retriever.nextDouble();
				System.out.println("Result: " + sine(num1));
				break;
			case "cosine":
				System.out.println("Enter a number: ");
				num1 = operand_retriever.nextDouble();
				System.out.println("Result: " + cosine(num1));
				break;
			}
			Scanner continuer = new Scanner(System.in);
			System.out.println("Press 1 to continue, Press anything else to quit: ");
			String continue_status = continuer.next();
			System.out.println(continue_status);
			if (continue_status.equals("1")) {
				System.out.println("Continuing...\n");
				continue;
			}
			else {
				System.out.println("Ending Program");
				break;
			}
		} while (true);

	}
	
	public static double add(double a, double b) {
		return a + b;
	}
	
	public static double subtract(double a, double b) {
		return a - b;
	}
	
	public static double multiply(double a, double b) {
		return a * b;
	}
	
	public static double divide(double a, double b) {
		return a / b;
	}
	
	public static double factorial(double n) {
		if (n <= 1) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}

}
