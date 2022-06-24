//Que 1: print table of 12 using for loop.
import java.util.*;

public class Que1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number to print table : ");
		int num = sc.nextInt();
		int res;
		
		for(int i=1; i<=10; i++) {
			res = num * i;
			System.out.println(num + " X " + i + " = " + res);
		}
	}
}
