package Functions;

import java.util.Scanner;

public class any_base_to_decimal {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int b=s.nextInt();
		int dn = getValueIndecimal(n, b);
	      System.out.println(dn);

	}
	
	public static int getValueIndecimal(int n, int b) {
		
		int dval=0;
		int pow=1;
		while(n>0) {
			int rem=n%10;
			
			dval=dval+rem*pow;
			pow=pow*b;
			n=n/10;
			
		}
		return dval;
	}

}
