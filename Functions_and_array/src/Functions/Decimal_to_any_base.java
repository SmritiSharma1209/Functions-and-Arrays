package Functions;

import java.util.Scanner;


public class Decimal_to_any_base {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int b=s.nextInt();
		int dn = getValueInBase(n, b);
	      System.out.println(dn);

	}
	public static int getValueInBase(int n, int b){
		
		int pow=1;
		int bval=0;
	       while(n>0) {
	    	   int rem=n%b;
	    	  
	    	   bval=bval+rem*pow;
	    	   pow=pow*10;
	    	   n=n/b;
	       }
	       return bval;
	       
	   }

}
