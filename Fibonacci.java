package series;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Terms");
		int terms = sc.nextInt();
		for (int i=0; i<terms; i++) {
			System.out.println(+a);
			temp =a+b;
			a = b;
			b = temp ;
			
			
		
		}
		}
	}
