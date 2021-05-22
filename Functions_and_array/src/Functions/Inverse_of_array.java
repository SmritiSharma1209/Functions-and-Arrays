package Functions;

import java.util.Scanner;

public class Inverse_of_array {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;++i) {
			arr[i]=s.nextInt();
		}
		
		int narr[]= new int[arr.length];
		for(int i=0;i<arr.length;++i) {
			int val=arr[i];
			narr[val]=i;
		}
		for(int i=0;i<arr.length;++i) {
			System.out.print(narr[i]+" ");
		}
	}

}
