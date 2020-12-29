/*   * * * *
       * * *
         * *
           *    */

package myprogram;
import java.util.Scanner;
public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i-1;j++) {   //in 1st row 0spaces, 2nd row 2spaces-1 for star & other for space, so, we have 2(i-1) spaces or 2/1 spaces for (i-1)times
				System.out.print("  ");  //for space printing
			}
			for(int j=1;j<=n-i+1;j++) {  //for star printing, 1st row 4 stars, 2nd row 3stars,so general formula n-i+1
				System.out.print("* ");
			}
			System.out.println(); //printing next line
		}	
	}

}
	
