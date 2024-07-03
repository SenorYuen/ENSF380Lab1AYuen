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
				System.out.println("Enter operation (add, subtract, multiply, divide, factorial, power, square root, log, log10, sine, cosine, tangent ): ");
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
				int factorial_input = operand_retriever.nextInt();
				System.out.println("Result: " + factorial(factorial_input));
				break;
			case "power":
				System.out.println("Enter a number for the base: ");
				double base = operand_retriever.nextDouble();
				System.out.println("Enter a number for the exponent: ");
				double exponent = operand_retriever.nextDouble();
				System.out.println("Result: " + power(base, exponent));
				break;
			case "square root":
				System.out.println("Enter a number: ");
				num1 = operand_retriever.nextDouble();
				System.out.println("Result: " + sqrt(num1));
				break;
			case "log":
				System.out.println("Enter a number: ");
				num1 = operand_retriever.nextDouble();
				System.out.println("Result: " + log(num1));
				break;
			case "log10":
				System.out.println("Enter a number: ");
				num1 = operand_retriever.nextDouble();
				System.out.println("Result: " + log10(num1));
				break;
			case "sine":
				System.out.println("Enter a number: ");
				num1 = operand_retriever.nextDouble();
				System.out.println("Result: " + sin(num1));
				break;
			case "cosine":
				System.out.println("Enter a number: ");
				num1 = operand_retriever.nextDouble();
				System.out.println("Result: " + cos(num1));
				break;
			case "tangent":
				System.out.println("Enter a number: ");
				num1 = operand_retriever.nextDouble();
				System.out.println("Result: " + tan(num1));
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
	
	public static long factorial(int num) {
	    if (num < 0) {
	        System.out.println("Factorial of negative number is undefined.");
	        return 0;
	    }
	    return factorialHelper(num, num);
	}

	private static long factorialHelper(int originalNum, int num) {
	    if (num <= 1) {
	        return 1;
	    }
	    // Calculate progress and update progress bar - also fixed the formula so it can possibly include 1 as a
	    int progress = (int) (((originalNum - num) / (double) (originalNum - 1)) * 100);
	    System.out.print("\rCalculating factorial: " + progress + "%");
	    return num * factorialHelper(originalNum, num - 1);
	}
	
	public static double power(double base, double exponent) {
	    return Math.pow(base, exponent);
	}

	// Square root
	public static double sqrt(double number) {
	    return Math.sqrt(number);
	}

	// Natural logarithm
	public static double log(double number) {
	    return Math.log(number);
	}

	// Base-10 logarithm
	public static double log10(double number) {
	    return Math.log10(number);
	}

	// Sine function
	public static double sin(double angleRadians) {
		double angleDegrees = Math.toRadians(angleRadians);
	    return Math.sin(angleDegrees);
	}

	// Cosine function
	public static double cos(double angleRadians) {
		double angleDegrees = Math.toRadians(angleRadians);
	    return Math.cos(angleDegrees);
	}

	// Tangent function
	public static double tan(double angleRadians) {
		double angleDegrees = Math.toRadians(angleRadians);
	    return Math.tan(angleDegrees);
	}


}
