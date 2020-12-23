/*   * 
     * * 
     * * * 
     * * * *    */

package myprogram;
import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {      //1st row has 1 star, 2nd row has 2 stars. so j will run according to i
				System.out.print("* ");
			}
			System.out.println();

	}

}
}
