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
		
		// all above are 100% correct
		
		int[] totalitemquantity = new int[count];
		int[] totalcustomernumber = new int[count];
		int[] num = new int[count];
		
		int numberofpeople = scan.nextInt();
		
		for (int i = 0; i < numberofpeople; i++) {
			String[] peoplename = new String[2];
			for (int a = 0; a < peoplename.length; a++) {
				peoplename[a] = scan.next();
			}
					
			int numberofitems = scan.nextInt();
			
			for (int b = 0; b < count; b++) {
				num[b] = 0;
			}
			
			for (int a = 0; a < numberofitems; a++) {
				
				int eachitemnumber = scan.nextInt();
				String item = scan.next();	
				
				for (int b = 0; b < count; b++) {
					if (item.equals(itemnames[b])) {
						totalitemquantity[b] += eachitemnumber;
						num[b] += eachitemnumber; 
					} 
				}
			}
			
			for (int a = 0; a < count; a++) {
				if (num[a] != 0) {
					totalcustomernumber[a] += 1;
				}
			}
		}
	
		for (int i = 0; i < count; i++) {
			if (totalcustomernumber[i] == 0) {
				System.out.println("No customers bought " + itemnames[i]);
			} else {
				System.out.println(totalcustomernumber[i] + " customers bought " + totalitemquantity[i] + " " + itemnames[i]);
			}
		}
	}
}