package myprogram;
import java.util.Scanner;
public class PalindromeNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no to find palindromic nature: ");
		int n=sc.nextInt();
		int temp=n;
		int reverseNo=0;
		while(temp>0) {
			int lastDigit=temp%10;
			reverseNo=reverseNo*10+lastDigit;
			temp=temp/10;
		}
		if(n==reverseNo) {
			System.out.println("Number "+ n + " is palindrome!");
		}else {
			System.out.println("Number "+ n + " is  not palindrome!");
		}
	}

}
