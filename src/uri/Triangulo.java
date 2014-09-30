package uri;

import java.util.Locale;
import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		double a, b, c, ladobc, ladoac, ladoab, bc, ac, ab, perimetro, area;
		Scanner teclado = new Scanner(System.in);

		a = teclado.nextDouble();
		b = teclado.nextDouble();
		c = teclado.nextDouble();

		ladobc = Math.abs(b - c);
		ladoac = Math.abs(a - c);
		ladoab = Math.abs(a - b);

		bc = b + c;
		ac = a + c;
		ab = a + b;

		if (ladobc < a && a < bc && ladoac < b && b < ac && ladoab < c
				&& c < ab) {
			perimetro = a + b + c;
			System.out.printf("Perimetro = %.1f\n", perimetro);

		} else {
			area = ((a + b) * c) / 2;
			System.out.printf("Area = %.1f\n", area);
		}
	}
}
