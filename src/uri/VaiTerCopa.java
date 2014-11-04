package uri;

import java.util.Scanner;
import java.util.Locale;

public class VaiTerCopa {


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int N;
		

		do {

			N = input.nextInt();
			if (N == 0) {
				System.out.println("vai ter copa!");
			} else {
				System.out.println("vai ter duas!");
			} 
		} while (input.hasNext());

	}
}
