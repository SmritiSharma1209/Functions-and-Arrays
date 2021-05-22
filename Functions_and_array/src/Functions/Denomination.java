package Functions;

import java.util.Scanner;

public class Denomination {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;++i) {
			arr[i]=s.nextInt();
		}
		
		int d=s.nextInt();
		
		int l=0;
		int h=arr.length-1;
		int mid=(l+h)/2;
		while(l<h) {
			
				mid=(l+h)/2;
			    if(d>arr[mid]) {
					l=mid+1;
				}
				else if(d<arr[mid]) {
					h=mid-1;
				}
				else if(d==arr[mid]) {
					System.out.println(d);
					return;
				}
				
		}
		System.out.println(arr[mid]);
		System.out.println(arr[l]);
	}

}
