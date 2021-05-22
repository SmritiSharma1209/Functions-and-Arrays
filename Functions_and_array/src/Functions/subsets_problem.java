package Functions;

import java.util.Scanner;

public class subsets_problem {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;++i) {
			arr[i]=s.nextInt();
		}
		
		// no. of subsets of array is 2^n
		int limit=(int)Math.pow(2,arr.length);  
		
		for(int i=0;i<limit;++i) {                   //index ko binary mai convert karenge. Jitne elements honge utne bits ki binary mai convert karo .aagar binary mai 0 hai toh kuch nhi print karna agar binary mai 1 hai toh woh particular element print karna hai.
			int temp=i;
			String set=" ";
			
			for(int j=arr.length-1;j>=0;j--) {    //for which element to print
				int rem=temp % 2;
				temp=temp/2;
				
				if(rem==0) {
					set=" - "+" "+ set;
				}else {
					set=arr[j]+ " "+set;
					
				}
				
			}
			System.out.println(set);
		}

	}

}
