package myprogram;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first number a: ");
		float a=sc.nextInt();
		System.out.println("enter second number b: ");
		float b=sc.nextInt();
		System.out.println("enter operation to be performed: ");
		sc.hasNextLine();           // for flush,take the enter key as its i/p
		char operator=sc.next().charAt(0);
		
		switch(operator) {                   //take charac ip in ' '
			case '+':
				System.out.println("Addition: "+(a+b));
				break;
			case '-':
				System.out.println("Subtraction: "+(a-b));
				break;
			case '*':
				System.out.println("Multiplication: "+(a*b));
				break;
			case '/':
				System.out.println("Division: "+(a/b));
				break;
			case '^':
				System.out.println("Power: "+((int)a^(int)b));
				break;
			case '%':
				System.out.println("Modulo Division: "+(a%b));
				break;
			default:
				System.out.println("Invalid operation!!");
	}
  }
}
	












	}

}
