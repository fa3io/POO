package uri;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DivisoresI {

	public static void main(String[] args) throws NumberFormatException,IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sequencia = new StringBuilder();
		int numero;

		numero = Integer.parseInt(in.readLine());

		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				sequencia.append(i + "\n");
			}
		}
		bw.write(sequencia.toString());
		bw.flush();

	}
}
