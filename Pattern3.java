/*   * * * *
     * * * 
     * * 
     *     */

package myprogram;
import java.util.Scanner;
public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {      //1st row has 4 star, 2nd row has 3 stars. so j will run starting from i till n 
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
