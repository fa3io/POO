package aula1;

public class ExercicioSimples11A {

	public static void main(String[] args) {
		
		System.out.println(soma(1,3));
	}

	private static int soma(int i, int j) {
		if(j == 0){
			return i ;
		
		}else {
                    return soma(i, j-1)+ 1;
		}
	}

}


/*

1 3 
1 2
1 1 
1 0 





*/