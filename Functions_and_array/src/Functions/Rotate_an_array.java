package Functions;

import java.util.Scanner;

public class Rotate_an_array {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;++i) {
			arr[i]=s.nextInt();
		}
		int k=s.nextInt();
		int count=arr.length;
		if(k<0) {
			k=k+count;
		}
		k=k%10;
		
		while((count-k)!=0) {
			int temp=arr[0];
			for(int i=0;i<arr.length-1;++i) {
				arr[i]=arr[i+1];
				}
			arr[arr.length-1]=temp;
			k++;
		}
		
		for(int i=0;i<arr.length;++i) {
			System.out.print(arr[i]);
		}
		
		
	}

}
