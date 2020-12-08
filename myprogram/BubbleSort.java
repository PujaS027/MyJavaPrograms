package myprogram;
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements of the array:");
		int n=sc.nextInt();
		
		int a[]=new int[n];  //for 1-d array entry
		System.out.println("enter the elements:");
		for(int k=0;k<n;k++) {
			a[k]=sc.nextInt();
		}
		//int a[]= {2,30,-5,81,100,34,48,66};
		//int n=a.length;  //length of array ,here n=8
		
		for(int i=0;i<n-1;i++) {
			boolean sorted=true;  //loop will not be executed if already sorted array given
			for(int j=0;j<n-1-i;j++) {  //loop runs -i times as the last elements already get sorted in successive lines
				if(a[j+1]<a[j]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					
					sorted=false;
				}
			}
			if(sorted) break;
			
		}
		System.out.println("Sorted array is: ");
		for(int item:a) {  //enhanced for loop
			System.out.println(item + " ");
		}
		
	}

}
