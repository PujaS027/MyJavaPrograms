package myprogram;
import java.util.Scanner;
public class TimesTable {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number whose table you want:" );
		int n=sc.nextInt();
		int result=1;
		for(int i=1;i<=20;i++) {
			result=n*i;
			System.out.println(n+ " * "+ i+ "=" +result);
		}
	}

}
