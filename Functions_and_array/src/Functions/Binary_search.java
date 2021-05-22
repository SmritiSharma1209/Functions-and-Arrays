package Functions;

import java.util.Scanner;

public class Binary_search {

	public static void main(String[] args) {

       int arr[]= {10,20,30,40,50,60,70,80,90};
   	   Scanner s= new Scanner(System.in);
	   int n=s.nextInt();
       int l=0;
       int h=arr.length-1;
       
       while(l<=h) {
       int mid=(l+h)/2;
       
       if(n>arr[mid]) {
    	   l=mid+1;
       }
       else if(n<arr[mid]) {
    	   h=mid-1;
       }
       else {
    	   System.out.println(mid);
    	   return;
       }
      
       }
      System.out.println(-1);
       
       

	}

}
