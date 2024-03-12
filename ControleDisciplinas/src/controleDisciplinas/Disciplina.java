package controleDisciplinas;

public class Disciplina {

	private String nome;
	private double carga_horaria;
	private Professor professor;
	
	public Disciplina() {
		
	}
	
	public Disciplina(String nome, double carga_horaria) {
		this.nome = nome;
		this.carga_horaria = carga_horaria;
	}
	
	public Disciplina(String nome, double carga_horaria, Professor professor) {
		this.nome = nome;
		this.carga_horaria = carga_horaria;
		this.professor = professor;
	}

	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getCargaHoraria() {
		return this.carga_horaria;
	} 
	
	public void setCargaHoraria(double carga_horaria) {
		this.carga_horaria = carga_horaria;
	}
	
	public Professor getProfessor() {
		return this.professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + ", Carga Horaria: " + carga_horaria;
	}
	
}


