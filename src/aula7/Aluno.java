package aula7;



public class Aluno extends Pessoa {
	
	private String matricula;
	private String curso;
	
	public Aluno() {
		
	}
	
	public Aluno(String matricula, String curso) {
		super();
		this.matricula = matricula;
		this.curso = curso;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
}
