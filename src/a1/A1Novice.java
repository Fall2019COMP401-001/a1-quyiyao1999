package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// create a new scanner object. type = scanner
		// "System.in" : to read input from console  

		// Your code follows here.
		
		int count = scan.nextInt();
		for (int i = 0; i < count; i++) {
			String[] str = new String[2];
			for (int a = 0; a < str.length; a++) {
				str[a] = scan.next();
			}
			int number = scan.nextInt();
			double fullprice = 0.00;
			for (int b = 0; b < number; b++) {
				int numb1 = scan.nextInt();
				String str1 = scan.next();
				double doub1 = scan.nextDouble();
				fullprice = fullprice + numb1 * doub1;
			}
			System.out.println(str[0].charAt(0) + ". " + str[1] + ": " + String.format("%.2f", fullprice));
		}
		scan.close();
	}
}
