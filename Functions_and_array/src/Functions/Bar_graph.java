package Functions;

import java.util.Scanner;

public class Bar_graph {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;++i) {
			arr[i]=s.nextInt();
			
		}

           int max=Integer.MIN_VALUE;
           for(int i=0;i<arr.length;++i) {
        	   if(arr[i]>=max) {
        		   max=arr[i];
         }
        	   
         for(int floor=max;floor>=1; floor--) {
        	 for(int j=0;j<arr.length;++j) {
        		 if(arr[j]>=floor) {
        			 System.out.print("* ");
        		 }else {
        			 System.out.print("  ");
        		 }
        }
        	 System.out.println();
        		  
       }
        			   

	}
	
	
}
}
