import java.util.Scanner;



public class Main
{
	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature Converter!");
		Scanner Celsius = new Scanner(System.in);
		Scanner Fahrenheit = new Scanner(System.in);
    Scanner yon = new Scanner(System.in);
		System.out.println("Do you want to convert Celsius to Fahrenheit? 1 for yes, 0 for no.");
		int c = yon.nextInt();
		if (c == 1) {
    System.out.println("Choose a Celsius.");   
		int a = Celsius.nextInt();
        System.out.println(a);
	System.out.println("Celsius");
	System.out.println("is");
	System.out.println((a * 1.8) + 32);
	System.out.println("Fahrenheit.");
		}else {
		    System.out.println("So Fahrenheit to Celsius? Ok!");
		    System.out.println("Choose a Fahrenheit.");
		    int b = Fahrenheit.nextInt();
        System.out.println(b);
	System.out.println("Fahrenheit");
	System.out.println("is");
	System.out.println((b - 32) / 1.8);
        System.out.println("Celsius");
        
		}
	}
}

