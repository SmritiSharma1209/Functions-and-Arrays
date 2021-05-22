package Functions;

import java.util.Scanner;

public class Frequency_of_a_number {
	
	
	
	public static int getDigitFrequency(int n, int d) {
		int count=0;
		while(n!=0) {
			int rem=n%10;
			if(rem==d) {
				count++;
			}
			n=n/10;
		}
		return count;
		
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int d=s.nextInt();
		int f= getDigitFrequency( n, d);
		System.out.println(f);

	}

}
