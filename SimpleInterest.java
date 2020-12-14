package myprogram;
import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int principal=sc.nextInt();
		float rateOfInterest=sc.nextFloat();
		int time=sc.nextInt();
		
		float simpleInterest= principal*rateOfInterest*time/100;
		float amount= principal+simpleInterest;
        
		System.out.println("Net Amount is: "+amount);
	}
}
