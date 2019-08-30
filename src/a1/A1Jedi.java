package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int count = scan.nextInt();
		
		String[] itemnames = new String[count];
		double[] itemprices = new double[count];
		
		for (int i = 0; i < count; i++) {
			itemnames[i] = scan.next();
			itemprices[i] = scan.nextDouble();				
		}
		
		int people = scan.nextInt();
		int[] itemquantity = new int[count];
		int[] customernumber = new int[count];
		
		for (int i = 0; i < people; i++) {
			String[] peoplename = new String[2];
			for (int a = 0; a < peoplename.length; a++) {
				peoplename[a] = scan.next();
			}
					
			int numberofitems = scan.nextInt();
			
			for (int b = 0; b < numberofitems; b++) {
				int eachitem = scan.nextInt();
				String item = scan.next();
				for (int c = 0; c < count; c++) {
					if (itemnames[c].equals(item) ) {
						itemquantity[c] += eachitem;
						customernumber[c] += 1;
					}
				}
			}
		}
		
		for (int i = 0; i < count; i++) {
			if (customernumber[i] == 0) {
				System.out.println("No customers bought " + itemnames[i]);
			} else {
				System.out.println(customernumber[i] + " customers bought " + itemquantity[i] + " " + itemnames[i]);
			}
		}
	}
}
