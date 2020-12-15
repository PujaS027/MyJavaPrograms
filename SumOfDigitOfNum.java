package myprogram;
import java.util.Scanner;
public class SumOfDigitOfNum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number: ");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(n>0) {
			temp=temp%10;
			temp=temp/10;
			sum=sum+temp;
		}
		System.out.println("sum of"+ n + "is"+sum);
	}

}
