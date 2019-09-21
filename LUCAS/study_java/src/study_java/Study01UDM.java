package study_java;

import java.util.Locale;

public class Study01UDM {
	public static void main(String[] args) {
		String product1 = "Computer", product2 = "Office desk";
		int age = 30, code = 5290;
		char gender = 'F';
		double price1 = 2100, price2 = 650.50, measure = 53.234567;

		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n%n", product2, price2);
		
		System.out.printf("Record: %d years old, code %d and gender: %c%n%n", age,code,gender);
		
		Locale.setDefault(Locale.KOREAN);
		System.out.printf("Measure with eight decimal point places: %.8f%n", measure);
		System.out.printf("Rounded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		
		double a = 1.0,b = -3.0,c = -4.0;
		double x1 = (-b + Math.sqrt(Math.pow(b, 2.0) - 4.0*a*c))/(2*a);
		double x2 = (-b - Math.sqrt(Math.pow(b, 2.0) - 4.0*a*c))/(2*a);
		
		System.out.println("X1: " + x1 + " X2: " + x2);
	}

}
