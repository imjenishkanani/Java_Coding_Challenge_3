//Que 3: write java program to print numbers between 1 to 100 which are divisible by 5.

import java.util.*;

public class Que3 {
	public static void main(String[] args) {
		
		for(int i=1; i<100; i++) {
			if(i%5 == 0)
				System.out.print(i + " ");
		}
	}
}
