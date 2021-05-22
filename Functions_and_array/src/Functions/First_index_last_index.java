package Functions;

import java.util.Scanner;

public class First_index_last_index {

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
		
		while(l<=h) {
			if( d>arr[mid]) {
				l=mid+1;
			}
			else if(d<arr[mid]) {
				h=mid-1;
			}
			else if(d==arr[mid]) {
				int i=mid-1;
				int j=mid+1;
				while(d==arr[i]) {
					i--;
				}
				while(d==arr[j]) {
					j++;
				}
				System.out.println(i+1);
				System.out.println(j-1);
				break;
			}
		}

	}

}
