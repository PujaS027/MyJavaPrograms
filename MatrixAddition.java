package myprogram;
import java.util.Scanner;
public class MatrixAddition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows: ");
		int r=sc.nextInt();
		System.out.println("enter the no of columns: ");
		int c=sc.nextInt();
		
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		int x[][]=new int[r][c];
		System.out.println("enter elements of matrix a: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter elements of matrix b: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Addition matrix x: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				x[i][j]=a[i][j]+b[i][j];
				System.out.println(" "+x[i][j]);
			}
		}
		
		
	}

}
