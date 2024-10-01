package main;

public class MethodsReturn {
	 public static void main(String[] args) {
	        Calculator calculator = new Calculator();

	        double result1 = calculator.average(10, 20);
	        System.out.println("Average of 10 and 20: " + result1);

	        double result2 = calculator.average(30, 40);
	        System.out.println("Average of 30 and 40: " + result2);
	 }
}
