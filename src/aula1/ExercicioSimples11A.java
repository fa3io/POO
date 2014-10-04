package aula1;

public class ExercicioSimples11A {

	public static void main(String[] args) {
		
		System.out.println(soma(4,7));
	}

	private static int soma(int i, int j) {
		if(i == 0){
			return i;
		}else {
			return soma(i, j-1)+ 1;
		}
	}

}
