//Que 1: print table of 12 using while loop.
import java.util.*;

public class Que2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number to print table : ");
		int num = sc.nextInt();
		int res, i = 1;
		
		while(i<=10) {
			res = num * i;
			System.out.println(num + " X " + i + " = " + res);
			i++;
		}
	}
}
