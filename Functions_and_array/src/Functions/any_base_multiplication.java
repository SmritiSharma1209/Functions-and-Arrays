package Functions;

import java.util.Scanner;

public class any_base_multiplication {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int b=s.nextInt();
		int n1=s.nextInt();
		int n2=s.nextInt();
        int sum=mul(n1,n2,b);
        System.out.println(sum);
        

	}
	
public static int todecimal(int n,int b) {
		
		int pow=1;
		int dnum=0;
		while(n>0) {
			int rem=n%10;
		    dnum=dnum+rem*pow;
		    pow=pow*b;
		    n=n/10;
			
		}
		return dnum;
	}



public static int mul(int n1,int n2,int b) {
	int decn1=todecimal(n1,b);
	int decn2=todecimal(n2,b);
	
	int n=decn2*decn1;
	int pow=1;
	int convnum=0;
	while(n>0) {
		int rem=n%b;
		convnum=convnum+rem*pow;
		pow=pow*10;
		n=n/b;
		
	}
	return convnum;
	
}
}
	

