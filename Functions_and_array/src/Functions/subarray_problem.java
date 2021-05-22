package Functions;

import java.util.Scanner;

public class subarray_problem {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;++i) {
			arr[i]=s.nextInt();
		}
		
		for(int i=0;i<arr.length;++i) {
			int temp=i;
			while(temp<arr.length) {
				
				for(int k=i;k<=temp;++k) {
					System.out.print(arr[k]+" ");
				}
				System.out.println();
				temp++;
				
			}
			
		}
	}

}
