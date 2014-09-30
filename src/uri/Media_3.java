package uri;

import java.util.Locale;
import java.util.Scanner;

public class Media_3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		double n1, n2, n3, n4, n5, media;
		Scanner teclado = new Scanner(System.in);

		n1 = teclado.nextDouble();
		n2 = teclado.nextDouble();
		n3 = teclado.nextDouble();
		n4 = teclado.nextDouble();

		media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;

		System.out.printf("Media: %.1f\n", media);

		if (media >= 7.0) {
			System.out.printf("Aluno aprovado.\n");
		} else if (media < 5.0) {
			System.out.printf("Aluno reprovado.\n");
		} else if (media >= 5.0 && media <= 6.9) {
			System.out.printf("Aluno em exame.\n");
			n5 = teclado.nextDouble();
			System.out.printf("Nota do exame: %.1f\n", n5);
			media = (media + n5) / 2;
			if (media >= 5) {
				System.out.printf("Aluno aprovado.\n");
				System.out.printf("Media final: %.1f\n", media);
			} else {
				System.out.printf("Aluno reprovado.\n");
				System.out.printf("Media final: %.1f\n", media);
			}
		}
	}
}
