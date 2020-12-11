package myprogram;
import java.util.Scanner;
public class SeriesSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		float result=0;
		float result1=0;
		for(float i=1;i<=n;i++) { //division gives float value and hence sum should
			                         //also be float value. if int taken result will be 0 
			result=result+1/i;
		}
		System.out.println("1+1/2+1/3+.....+1/n = "+result);
		
		for(float i=1;i<=n;i++) {
			if(i%2==0) {       //- in front of even denominators, + in front of odd deno
				result1=result1-1/i;
			}else {
				result1=result1+1/i;
			}
		}
		System.out.println("1-1/2+1/3-.....+1/n = "+result1);
		
	}

}
