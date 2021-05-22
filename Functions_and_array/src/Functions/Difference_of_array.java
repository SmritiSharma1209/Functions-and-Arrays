package Functions;

import java.util.Scanner;

public class Difference_of_array {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n1=s.nextInt();
		int arr1[]=new int[n1];
		
		for(int i=0;i<arr1.length;++i) {
			arr1[i]=s.nextInt();
		}
		
		int n2=s.nextInt();
		int arr2[]=new int[n2];
		for(int i=0;i<arr2.length;++i) {
			arr2[i]=s.nextInt();

	}
		
		int diff[]=new int[n1>n2 ? n1:n2];
		int i=arr1.length-1;
		int j=arr2.length-1;
		int k=diff.length-1;
		int a1val= i>=0? arr1[i]:0;
		
		while(k>=0) {
			int d=0;
			int c=0;
			
			if(arr2[j]+c>=a1val) {
				d=arr2[j]+c-a1val;
				c=0;
			}else {
				d=arr2[j]+c+10-a1val;
				c-=1;
			}
			diff[k]=d;
			i--;
			j--;
			k--;
		}
           
		int pos=0;
		while(pos<diff.length) {
			if(diff[pos]==0) {
				pos++;
			}else {
				break;
			}
		}
		while(pos<diff.length) {
			System.out.println(diff[pos]);
			pos++;
		}
}
	

	
	
}
