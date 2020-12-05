package myprogram;
import java.util.Scanner;
public class IsPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter x");
		int n=sc.nextInt();
		for(int i=2;i*i<=n;i++) {         //factors of any number lies btn 2 to sqroot of the num
			if(n%i==0) {
				System.out.println("Number is not prime!");
				break;
			}else {
				System.out.println("number is prime!");
				break;
			}
		}
		if(n<2) {
			System.out.println("number is not prime!");
			
		}
	}

}
