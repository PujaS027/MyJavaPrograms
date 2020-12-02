package myprogram;
import java.util.Scanner;
public class ClassRecord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of students in the class: ");
		int n=sc.nextInt();
		
		int roll[]=new int[n];   //array initialization
		int marks[]=new int[n];
		
		System.out.println("enter roll nos:");
		for(int i=0;i<n;i++) {
			roll[i]=sc.nextInt();
		}
		System.out.println("enter marks:");
		for(int i=0;i<n;i++) {
			marks[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=marks[i];
		}
		float average=sum/n;
		System.out.println("average is "+average );
	}

}
