package aula1;

public class ExercicioSimples11A {

	public static void main(String[] args) {
		
		System.out.println(soma(1,3));
	}

	private static int soma(int i, int j) {
		if(i == 0){
			return j ;
		}else if(j ==1 ) {
			return 1;
		}else {
			return soma(i, j-1)+ 1;
		}
	}

}


/*

1 3 
1 2
1 1 






*/