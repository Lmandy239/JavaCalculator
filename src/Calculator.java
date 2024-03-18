import java.util.Scanner;

public class Calculator {
public static Scanner keyboard;
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		calc.run();

	}
	
	public void run() {
		Calculator calc = new Calculator();
		double one;
		double two;
		String answer;
		
		keyboard = new Scanner(System.in);
		System.out.println("Welcome to Calculator.  What is the first number? ");
		one = keyboard.nextDouble();
		System.out.println("What is the second number? ");
		two = keyboard.nextDouble();
		keyboard.nextLine();
		System.out.println("Do you want to add, substract, multiply or divide? ");
		answer = keyboard.next();
		
		if(answer.equals("add")) {
			calc.addition(one, two);
		}else if(answer.equals("substract")) {
			calc.substraction(one, two);
		}else if(answer.equals("multiply")) {
			calc.multiplication(one, two);
		}else if(answer.equals("divide")) {
			calc.division(one, two);
		}else {
			System.out.println("Invalid answer");
			run();
		}
		
	}

	public void addition(double one, double two) {

		double answer = one + two;
		
		System.out.println("Your answer is: " + answer);
		run();

	}

	public void substraction(double one, double two) {
	
		double answer = one - two;
		System.out.println("Your answer is: " + answer);
		run();


	}

	public void multiplication(double one, double two) {

		double answer = one * two;
		System.out.println("Your answer is: " + answer);
		run();
		
	}

	public void division(double one, double two) {
		
		double answer = one / two;
		System.out.println("Your answer is: " + answer);
		run();
		
	}

}

