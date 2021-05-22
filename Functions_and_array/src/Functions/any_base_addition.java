package Functions;

import java.util.Scanner;

public class any_base_addition {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int b=s.nextInt();
		int n1=s.nextInt();
		int n2=s.nextInt();
        int sum=add(n1,n2,b);
        System.out.println(sum);
	}
	
	public static int todecimal(int n, int base) {
		
		int pow=1;
		int decval=0;
		while(n>0) {
			int rem=n%10;
			decval=decval+rem*pow;
			pow=pow*base;
			n=n/10;
		}
		return decval;
		
	}
	
	public static int add(int n1, int n2, int b) {
		
		int decn1=todecimal(n1,b);
		int decn2=todecimal(n2,b);
		System.out.println(decn1+" "+decn2);
		
		int n=decn1+decn2;
		int pow=1;
		
		int csum=0;
		while(n>0) {
			int rem=n%b;
			csum=csum+rem*pow;
			pow=pow*10;
			n=n/b;
		}
		return csum;
				
		
	}

}
