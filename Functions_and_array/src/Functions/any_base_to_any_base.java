package Functions;

import java.util.Scanner;

public class any_base_to_any_base {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int sourcebase=s.nextInt();
		int convertbase=s.nextInt();
		int convnum=any_base(n,sourcebase,convertbase);
		System.out.println(convnum);
		
		}
	
	public static int any_base(int n, int sbase, int cbase) {
		
		
		int dnum=0;
		int pow=1;
		while(n>0) {
			int rem=n%10;
			dnum=dnum+rem*pow;
			pow=pow*sbase;
			n=n/10;
			
		}
		 pow=1;
		 n=dnum;
		 int convnum=0;
		 
		 while(n>0) {
			 int rem=n%cbase;
			 convnum=convnum+rem*pow;
			 pow=pow*10;
			 n=n/cbase;
		}
		 return convnum;
		 
		
		
	}

}
