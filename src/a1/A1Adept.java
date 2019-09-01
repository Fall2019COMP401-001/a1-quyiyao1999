package a1;

import java.util.Scanner;

public class A1Adept {

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
		double[] fullprice = new double[people];
		String[] allnames = new String[people];
		
		for (int i = 0; i < people; i++) {
			String[] peoplename = new String[2];
			for (int a = 0; a < peoplename.length; a++) {
				peoplename[a] = scan.next();
			}
					
			int numbofitems = scan.nextInt();
			
			double prices = 0.00;
		
			for (int b = 0; b < numbofitems; b++) {
				int numbofeachitem = scan.nextInt();
				String str = scan.next();
				for (int c = 0; c < count; c++) {
					if (itemnames[c].equals(str) ) {
						prices += numbofeachitem * itemprices[c];
					}
				}
				fullprice[i]= prices;
			}
			
			allnames[i] = peoplename[0] + " " + peoplename[1];  
//			System.out.println(String.format("%.2f", price[i]));
			
		}
		
		double max = findValueMax(fullprice);
		double min = findValueMin(fullprice);
		double average = calculateValueSum(fullprice) / people;
		int maxindex = maxIndex(fullprice);
		int minindex = minIndex(fullprice);
		System.out.println("Biggest: " + allnames[maxindex] + " (" + String.format("%.2f", max) + ")");
		System.out.println("Smallest: " + allnames[minindex] + " (" + String.format("%.2f", min) + ")");
		System.out.println("Average: " + String.format("%.2f", average));

		scan.close();
    }
	
	
	static double findValueMax(double[] vals) {
		
		double cur_max = vals[0];
		for (int i = 1; i < vals.length; i++) {
			if (vals[i] > cur_max) {
				cur_max = vals[i];
			}
		}
		return cur_max;
	}
	
	static int maxIndex(double[] vals) {
		
		double cur_max = vals[0];
		int index = 0;
		for (int i = 1; i < vals.length; i++) {
			if (vals[i] > cur_max) {
				cur_max = vals[i];
				index = i;
			}
		}
		return index;
	}
	
	static double findValueMin(double[] vals) {

		double cur_min = vals[0];
		for (int i = 1; i < vals.length; i++) {
			if (vals[i] < cur_min) {
				cur_min = vals[i];
			}
		}
		return cur_min;
	}
	
	static int minIndex(double[] vals) {
		
		double cur_min = vals[0];
		int index = 0;
		for (int i = 1; i < vals.length; i++) {
			if (vals[i] < cur_min) {
				cur_min = vals[i];
				index = i;
			}
		}
		return index;
	}
	
	static double calculateValueSum(double[] vals) {
		
		double sum = 0.00;
		for (int i = 0; i<vals.length; i++) {
			sum += vals[i];
		}
		return sum;
	}

}

		


