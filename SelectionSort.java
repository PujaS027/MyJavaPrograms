package myprogram;
import java.util.Scanner;
public class SelectionSort {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter no of elements of the array:");
		//int n=sc.nextInt();
		
		//int a[]=new int[n];  //for 1-d array entry
		//System.out.println("enter the elements:");
		//for(int k=0;k<n;k++) {
			//a[k]=sc.nextInt();
		//}
		int a[]= {2,30,-5,81};
		int n=a.length;  //length of array ,here n=8
				
		
		for(int i=0;i<n-1;i++) {
			int minIndex=i; //initially 0
			for(int j=i;i<n;i++) {     //inner loop will start from i nd end till the end to check min value
				if(a[minIndex]>a[j]) { //interchnging the index no with i and min value index
					minIndex=j;
				}
			}
			int temp=a[i];
			a[i]=a[minIndex];
			a[minIndex]=temp;
		}
		System.out.println("Sorted array is: ");
		for(int item:a) {  //enhanced for loop
			System.out.println(item + " ");
		}

	}

}
