package Functions;

import java.util.Scanner;

public class span_of_array {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int l=s.nextInt();
		int arr[]=new int[l];
		
		for(int i=0;i<arr.length;++i) {
			arr[i]=s.nextInt();
	     }
		
		int span=getdifference(arr);
		System.out.println(span);
	
	}
	
	
	public static int getdifference(int arr[]) {
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int diff=0;
		for(int i=0;i<arr.length;++i) {
			if(arr[i]>=max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
				
			}
			
		}
		System.out.println(max);
		System.out.println(min);
		diff=max-min;
		return diff;
	}

	}


