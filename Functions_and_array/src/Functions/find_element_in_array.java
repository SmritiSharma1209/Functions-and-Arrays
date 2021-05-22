package Functions;

import java.util.Scanner;

public class find_element_in_array {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;++i) {
			arr[i]=s.nextInt();
		}
		int d=s.nextInt();
		int pos=findelement(arr,d);
		System.out.println(pos);

	}
	
	public static int findelement(int arr[],int d) {
		int pos=0;
		
		for(int i=0;i<arr.length;++i) {
			if(arr[i]==d) {
				pos=i;
				break;
			}else {
				pos=-1;
			}
			
		}
		return pos;
		
	}

}
