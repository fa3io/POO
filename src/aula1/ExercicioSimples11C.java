package aula1;

public class ExercicioSimples11C {

	public static void main(String[] args) {
		
		System.out.println(multi(4,7));
	}

	private static int multi(int i, int j) {
		if(i == 0){
			return i;
		}else {
			return multi(i, j-1)+ i;
		}
	}

}
