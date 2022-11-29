package execicios;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	String nome;
	int idade;
	String dataNascimento;
	String registroGeral;
	String numeroCPF;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;
	boolean matriculaAtiva;
	
	private List< Disciplina> disciplinas = new ArrayList <Disciplina>();
	 

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	/*Constructor*/
	Aluno(String Nome, String cpf){
		this.nome=Nome;
		this.numeroCPF=cpf;
	}
	
	/*Métodos Gets e Sets*/
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public String getNumeroCPF() {
		return numeroCPF;
	}
	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	public String getSerieMatriculado() {
		return serieMatriculado;
	}
	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	public boolean isMatriculaAtiva() {
		return matriculaAtiva;
	}
	public void setMatriculaAtiva(boolean matriculaAtiva) {
		this.matriculaAtiva = matriculaAtiva;
	}
	
	
	/*Método para calculo e retorno da média*/
	public double getMediaNotas() {
		double somNotas = 0.0;
		for (Disciplina disc : disciplinas) {
			somNotas += disc.getNota();
			
		}
		return somNotas/disciplinas.size();
	}
	
	public boolean getAlunoAprovado() {
		double media = this.getMediaNotas();
		if (media>=70) {
			return true;
		}else {
			return false;
		}
	}
}
