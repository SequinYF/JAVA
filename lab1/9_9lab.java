import java.util.Scanner;


public class Que1 {

	//1_1
	/*
	public static void main(String[] args){
		System.out.println("a a^2 a^3");
		System.out.println("1 1 1");
		System.out.println("2 4 8");
		System.out.println("3 6 9");
		System.out.println("4 16 64");
	}
	*/

	/*
	public static void main(String[] args){
		System.out.println((10.5 + 2 * 3)/(45 - 3.5));
	}
	*/

	//1_5
	/*
	public static void main(String[] args){
		System.out.println(((9.5 * 4.5) - (2.5 * 3))/ (45.4 - 3.5));
	}
	*/

	/*
	//2_11
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("please input the stuff name:");
		String name = input.nextLine();

		System.out.print("number of hours worked in a week:");
		int hour = input.nextInt();

		System.out.print("hourly pay work:");
		Double pay = input.nextDouble();

		System.out.print("federal tax withholding rate:");
		Double fed_rate = input.nextDouble();

		System.out.print("state tax withholding rate:");
		Double sta_rate = input.nextDouble();

		System.out.println("stuff name" + name);
		System.out.println("hours worked:" + hour);
		System.out.println("pay rate:$ " + pay);
		System.out.println("gross pay:$ " + (pay * hour));
		System.out.println("Deductions:");

		System.out.println("    federal withholding ("  + (fed_rate *
		100) + "%): $"     + (fed_rate * hour * pay) );
		System.out.println("    state withholding (" + (sta_rate *
		100) + "%): $" + (pay * sta_rate * 10));
		System.out.println("	total deduction: $" + ((sta_rate * hour * pay) + (fed_rate * hour * pay)) );
		System.out.println("net pay: $" + ( (pay * hour) - (sta_rate * hour * pay) - (fed_rate * hour * pay)) );
	}	
	*/

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("input inverstment amount: ");
		int ammount = input.nextInt();
		
		System.out.println("input annually interest rate: ");
		Double rate = input.nextDouble();

		System.out.println("input year: ");
		int year = input.nextInt();


		Double value = ammount * Math.pow( (1 + rate), (12 * year));
		System.out.println("accumulated value is " + value);

	}
}


