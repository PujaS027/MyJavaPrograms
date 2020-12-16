package myprogram;
import java.util.Scanner;
public class XraisedY {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter x");
		int x=sc.nextInt();
		System.out.println("enter y");
		int y=sc.nextInt();
		int result=1;
		for(int i=1;i<=y;i++) {
			result=result*x;
		}
		System.out.println("result "+result);
	}

}
