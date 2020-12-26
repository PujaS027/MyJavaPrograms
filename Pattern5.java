/*   * * * *
     * * * *
     * * * *
     * * * *    */

package myprogram;
import java.util.Scanner;
public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=n;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
