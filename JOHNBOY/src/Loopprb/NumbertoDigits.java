package Loopprb;
import java.util.Scanner; 

public class NumbertoDigits {
	public static int countDigits(int n) {
		if (n==0)
			return 1;
		if (n<0)
			n=n-1;
		int a = 0;
		while (n != 0) {
			n = n/10;
			a++;
		}
		return a;
	}
	public static void main (String []args) {
		Scanner bes= new Scanner(System.in);
		int n = bes.nextInt();
		System.out.println("The number of digits in " + n + " are: " + countDigits(n));
	}

}
