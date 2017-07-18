import java.util.Scanner;
import java.util.Calendar;

public class lab2{
	/*//2.21
	public static void main(String[] args){

		double sidel1, sidel2, sidel3, area, temp;
		System.out.print("Enter the points for triangle: ");
		double x1, y1, x2, y2, x3, y3;
		Scanner scanner = new Scanner(System.in);
		x1 = scanner.nextDouble();
		y1 = scanner.nextDouble();
		x2 = scanner.nextDouble();
		y2 = scanner.nextDouble();
		x3 = scanner.nextDouble();
		y3 = scanner.nextDouble();
		
		sidel1 = distance(x1, y1, x2, y2);
		sidel2 = distance(x3, y3, x2, y2);
		sidel3 = distance(x1, y1, x3, y3);

		temp = (sidel1 + sidel2 + sidel3) / 2;
		area = temp * (temp - sidel1) * (temp - sidel2) * (temp - sidel3) ;
		System.out.println("the area of the triangle is " + (float)Math.sqrt(area) );

	}

	public static double distance(double x1, double y1, double x2, double y2){
		double distance;

		distance = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
		return Math.sqrt(distance);
		//System.out.println("the distance of two points is " + Math.sqrt(distance) );
	}*/
	/*
	//3.21_Zeller
	public static void main(String[] args) {
		int year;
		int month;
		int day;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter year:(e.g.,2008): ");
		year = scanner.nextInt();

		System.out.print("Enter month:1~12 : ");
		month = scanner.nextInt();

		System.out.print("Enter the day of the month:1~31 : ");
		day = scanner.nextInt();

		String weekday[]= new String[] {"Saturday","Sunday","Monday","Tuesday","Wednessday","Thursday","Friday"};
				
		int q = day;
		int m;

		switch(month){
			case 1:
				m = 13;
				year = year - 1;
				break;
			case 2:
				m = 14;
				year = year - 1;
				break;
			default:
				m = month;
				break;
		}

		int j = year / 100;
		int k = year % 100;
		int h = ( q + 26 * (m + 1)/10 + k + k/4 + j/4 + 5*j ) % 7;
		System.out.println("Day of the week is " + weekday[h]);
	}
	*/

	//4.6
	/*
	public static void main(String[] args) {
		int mile;
		float km;
		int kms;
		float miles;

		System.out.printf("%-5s\t%-10s\t%-10s\t%-5s\n", "Miles", "Kilometers", "Kilometers", "Miles");
	
		for(int i = 1; i <= 10; i++){
			mile = i;
			km = mile * 1.609F;
			kms = i * 5 + 15;
			miles = (float)kms / 1.609F;

			System.out.printf("%-5d\t%-10.3f\t%-10d\t%-5.3f\n", mile, km, kms, miles);
		}
	}
	*/

	//4.21
	/*
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float rate, month_pay, month_rate, total_pay;
		int year, amount;
		
		System.out.print("Loan Amount: ");
		amount = scanner.nextInt();

		System.out.print("Number of Years: ");
		year = scanner.nextInt(); 

		System.out.println("Interest Rate\tMonthly Payment\tTotal Payment");

		for(int i = 0; i < 12; i++){
			rate = 5 + i * 0.125F;
			month_rate = rate / 1200;
			month_pay = (month_rate + 1) * amount;
			total_pay = (rate + 1) * amount;

			System.out.printf("%1.0f%%\t\t%-14.2f\t%-13.2f\n", rate, month_pay, total_pay);

		}
	}
	*/

	static public void main(String 参数[]){		
		Calendar  c = Calendar.getInstance();

		c.set(Calendar.YEAR, 2005);
		c.set(Calendar.MONTH, Calendar.JANUARY);
		c.set(Calendar.DAY_OF_MONTH, 1);

		while(c.get(Calendar.YEAR) == 2005){
			int wday=c.get(Calendar.DAY_OF_WEEK);
			int mday=c.get(Calendar.DAY_OF_MONTH);
			
			if(mday==1){
				System.out.printf("\t\t\t%s\n", c.get(Calendar.MONTH)+1);
				System.out.println("---------------------------------------------------");
				System.out.println("\nSun\tMon\tTue\tWed\tThu\tFri\tSet\t");
				for(int i = 0; i < wday-1; i++){
					System.out.print(" \t");
				}
			}			
			System.out.print(mday+"\t");
			if(wday == 7){
				System.out.println();
			}

			c.add(Calendar.DAY_OF_YEAR, 1);
		}
	}	
} 
