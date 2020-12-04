package myprogram;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of terms of fibonacci series");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<n-2;i++) {      //n terms,loop will run upto
			                         //n-2 terms printed here as first 2 num already printed
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	}

}
