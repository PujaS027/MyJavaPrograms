package myprogram;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number to find factorial");
		int a=sc.nextInt();
		int fact=1;
		for(int i=a;i>0;i--) {
			fact=fact*i;
		}
		System.out.println("factorial is:"+fact);

	}

}
