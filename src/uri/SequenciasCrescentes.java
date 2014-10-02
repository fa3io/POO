package uri;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SequenciasCrescentes {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int x;
		boolean ehZero = false;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		StringBuilder sequencia = new StringBuilder();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (!ehZero) {
			x = Integer.parseInt(in.readLine());
			if (x == 0) {
				break;
			} else {
				for (int i = 1; i <= x; i++) {
					if (i == x) {
						//System.out.print(i);
						sequencia.append(i +"\n" );
					} else {
						//System.out.print(i + " ");
						sequencia.append(i +" " );
					}
				}
				//System.out.println();
				//System.out.printf(sequencia.toString());
				bw.write(sequencia.toString());
				bw.flush();
				sequencia.delete(0, sequencia.length());
			}
		}
	}
}
